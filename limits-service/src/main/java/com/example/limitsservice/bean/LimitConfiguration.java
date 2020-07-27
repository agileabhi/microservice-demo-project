package com.example.limitsservice.bean;

public class LimitConfiguration {
  private int maximum;
  private int minimum;
  
 protected LimitConfiguration() {
	 
 }
  
public int getMaximum() {
	return maximum;
}
public LimitConfiguration(int maximum, int minimum) {
	super();
	this.maximum = maximum;
	this.minimum = minimum;
}
public void setMaximum(int maximum) {
	this.maximum = maximum;
}
public int getMinimum() {
	return minimum;
}
public void setMinimum(int minimum) {
	this.minimum = minimum;
}
  
}
