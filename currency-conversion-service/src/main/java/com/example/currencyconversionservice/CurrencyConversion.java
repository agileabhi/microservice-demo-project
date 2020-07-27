package com.example.currencyconversionservice;

import java.math.BigDecimal;

public class CurrencyConversion {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionFactor;
	private BigDecimal quantity;
	private BigDecimal convertedQuantity;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}
	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getConvertedQuantity() {
		return convertedQuantity;
	}
	public void setConvertedQuantity(BigDecimal convertedQuantity) {
		this.convertedQuantity = convertedQuantity;
	}
	public CurrencyConversion(Long id, String from, String to, BigDecimal conversionFactor, BigDecimal quantity,
			BigDecimal convertedQuantity) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.quantity = quantity;
		this.convertedQuantity = convertedQuantity;
	}
	public CurrencyConversion() {
		
	}

}
