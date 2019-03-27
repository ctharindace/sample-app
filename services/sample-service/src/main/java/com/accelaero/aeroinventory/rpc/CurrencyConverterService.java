package com.accelaero.aeroinventory.rpc;

import java.math.BigDecimal;

import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

import com.accelaero.aeroinventory.adaptor.CurrencyConvertRSAdaptor;
import com.accelaero.aeroinventory.gen.grpc.proto.CurrencyConverterGrpc.CurrencyConverterImplBase;
import com.accelaero.aeroinventory.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertRequest;
import com.accelaero.aeroinventory.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse;
import com.accelaero.aeroinventory.interceptor.SpringBeanInterceptor;
import com.accelaero.aeroinventory.service.CurrencyService;

import io.grpc.stub.StreamObserver;

@GRpcService(interceptors = SpringBeanInterceptor.class)
public class CurrencyConverterService extends CurrencyConverterImplBase {
	
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