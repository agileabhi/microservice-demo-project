package com.example.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
    private Configuration configuraion;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitConfiguration() {
		
		return new LimitConfiguration(configuraion.getMaximum(),configuraion.getMinimum());
	}

}
