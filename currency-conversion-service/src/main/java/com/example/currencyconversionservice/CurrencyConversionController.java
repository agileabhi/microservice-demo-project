package com.example.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion retrieveConvertedQuantity(@PathVariable String from,@PathVariable String to, @PathVariable String quantity) {
		
		ResponseEntity<CurrencyConversion[]> response = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange",CurrencyConversion[].class);
		
		CurrencyConversion[] list = response.getBody();
		BigDecimal mf = BigDecimal.ONE;
		BigDecimal convertedQty = BigDecimal.ONE;
		BigDecimal inputQty = new BigDecimal(quantity);
		for(CurrencyConversion cc:list) {
			if(cc.getFrom().equalsIgnoreCase(from)&&cc.getTo().equalsIgnoreCase(to)) {
			  mf=cc.getConversionFactor();
			  convertedQty=inputQty.multiply(mf);
			  break;
			}
		}
		
		return new CurrencyConversion((long) 1001,from,to,mf,inputQty,convertedQty);
	}
}
