package com.example.currencyexchangeservice;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository evRepository;
	
	
	@GetMapping("/currency-exchange")
  public List<ExchangeValue> retrieveExchangeValue() {
		List<ExchangeValue> ev = evRepository.findAll();
	  //ExchangeValue ret = new ExchangeValue(1001L,"USD","INR",BigDecimal.valueOf(80));
		for(ExchangeValue evalue:ev) {
	  evalue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		}
	  return ev ;
  }
}
