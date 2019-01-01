package com.accelaero.sample.adaptor;

import java.math.BigDecimal;

import com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass;
import com.accelaero.sample.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse;

public class CurrencyConvertRSAdaptor {

	
	public static CurrencyConvertResponse adapt(BigDecimal convertedAmount) {
		
		CurrencyConverterOuterClass.CurrencyConvertResponse.Builder resultBuilder = CurrencyConverterOuterClass.CurrencyConvertResponse
				.newBuilder();
		if (convertedAmount != null) {
			resultBuilder.setConvertedAmount(convertedAmount.doubleValue());
			resultBuilder.setSuccess(true);
		} else {
			resultBuilder.setSuccess(false);
		}

		return resultBuilder.build();
	}

}
