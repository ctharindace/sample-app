package com.accelaero.aeroinventory.adaptor;

import java.math.BigDecimal;

import com.accelaero.aeroinventory.gen.grpc.proto.CurrencyConverterOuterClass;
import com.accelaero.aeroinventory.gen.grpc.proto.CurrencyConverterOuterClass.CurrencyConvertResponse;

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
