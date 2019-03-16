package com.accelaero.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accelaero.sample.adaptor.CurrencyConvertRSAdaptor;
import com.accelaero.sample.adaptor.UserAdaptor;
import com.accelaero.sample.data.mongo.UserRepository;
import com.accelaero.sample.gen.grpc.proto.GreeterOuterClass;
import com.accelaero.sample.gen.grpc.proto.AuthenticatorGrpc.AuthenticatorImplBase;
import com.accelaero.sample.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateRequest;
import com.accelaero.sample.gen.grpc.proto.AuthenticatorOuterClass.AuthenticateResponse;
import com.accelaero.sample.gen.grpc.proto.CurrencyConverterGrpc.CurrencyConverterImplBase;
import com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest;
import com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse;
import com.accelaero.sample.gen.grpc.proto.GreeterGrpc.GreeterImplBase;
import com.accelaero.sample.gen.grpc.proto.GreeterOuterClass.HelloReply;
import com.accelaero.sample.gen.grpc.proto.GreeterOuterClass.HelloRequest;
import com.accelaero.sample.interceptor.AuthInterceptor;
import com.accelaero.sample.interceptor.SpringBeanInterceptor;
import com.accelaero.sample.model.document.User;
import com.accelaero.sample.model.rdbms.Currency;
import com.accelaero.sample.model.rdbms.CurrencyExchangeRate;
import com.accelaero.sample.service.AuthenticationService;
import com.accelaero.sample.service.CurrencyService;

import java.math.BigDecimal;
import java.util.Date;

import org.lognet.springboot.grpc.GRpcService;
import io.grpc.stub.StreamObserver;

@SpringBootApplication
public class SampleAppApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	
	@Autowired CurrencyService currencyService;

	public static void main(String[] args) {
		SpringApplication.run(SampleAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		// save a couple of Users
		repository.save(new User("Manoj", "Dhanushka", "mdhanushka@accelaero.com", "mdhanushka", "manoj"));
		repository.save(new User("Muhammad", "Rikaz", "mrikaz@accelaero.com", "mrikaz", "rikaz"));

		// fetch all Users
		System.out.println("Users found with findAll():");
		System.out.println("-------------------------------");
		for (User user : repository.findAll()) {
			System.out.println(user);
		}
		System.out.println();

		// fetch an individual customer
		System.out.println("User found with findByFirstName('Manoj'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByFirstName("Manoj"));
		
		System.out.println("User found with findByUsername('mdhanushka'):");
		System.out.println("--------------------------------");
		System.out.println(repository.findByUsername("mdhanushka"));

		System.out.println("Users found with findByLastName('Muhammad'):");
		System.out.println("--------------------------------");
		for (User user : repository.findByLastName("Muhammad")) {
			System.out.println(user);
		}
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		Currency currency = new Currency();
		currency.setCurrencyCode("AED");
		currency.setCurrencyName("Arab Emirates Dirham");
		currency.setStatus("ACT");
		
		currencyService.saveCurrency(currency);
		
		CurrencyExchangeRate currencyExchangeRate = new CurrencyExchangeRate();
		currencyExchangeRate.setEffectiveFrom(new Date());
		currencyExchangeRate.setEffectiveTo(new Date());
		currencyExchangeRate.setCurrencyCode("AED");
		currencyExchangeRate.setExRateFromBase(new BigDecimal("1.0"));
		currencyExchangeRate.setExRateToBase(new BigDecimal("1.0"));
		currencyExchangeRate.setStatus("ACT");
		
		currencyService.saveCurrencyExchangeRate(currencyExchangeRate);
		
		CurrencyExchangeRate exRate = currencyService.getExchangeRate("AED");
		if (exRate != null) {
			System.out.println(exRate.getCurrencyCode());
			System.out.println(exRate.getEffectiveFrom());
			System.out.println(exRate.getEffectiveTo());
			System.out.println(exRate.getExRateFromBase());
			System.out.println(exRate.getExRateToBase());
			System.out.println(exRate.getStatus());

		} else {
			System.out.println("Currency Null");
		}
		
		

	}
	
	@GRpcService(interceptors = AuthInterceptor.class)
	public static class AuthenticatorService extends AuthenticatorImplBase{
		
		@Autowired
		private AuthenticationService authenticationService;
		
		@Override
		public void authenticate(AuthenticateRequest request, StreamObserver<AuthenticateResponse> responseObserver) {
			User user = authenticationService.authenticate(request.getUsername(), request.getPassword());
			responseObserver.onNext(UserAdaptor.adapt(user));
			responseObserver.onCompleted();

		}

	}
	
	@GRpcService(interceptors = SpringBeanInterceptor.class)
	public static class CurrencyConverterService extends CurrencyConverterImplBase {
		
		@Autowired
		private CurrencyService currencyService;
		
		@Override
		public void currencyConvert(CurrencyConvertRequest request, StreamObserver<CurrencyConvertResponse> responseObserver) {
			BigDecimal convertedAmount = currencyService.convertedAmount(request.getFromCurrencyCode(),
					request.getToCurrencyCode(), new BigDecimal(request.getAmount()));
			responseObserver.onNext(CurrencyConvertRSAdaptor.adapt(convertedAmount));
			responseObserver.onCompleted();

		}

	}
	
	@GRpcService(interceptors = SpringBeanInterceptor.class)
	public static class GreeterService extends GreeterImplBase{
		
		@Override
		public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
			
			GreeterOuterClass.HelloReply.Builder responseBuilder = GreeterOuterClass.HelloReply.newBuilder();
			responseBuilder.setMessage("Hello World");
			responseObserver.onNext(responseBuilder.build());
			responseObserver.onCompleted();

		}

	}

}