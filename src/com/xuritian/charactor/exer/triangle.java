package com.xuritian.charactor.exer;

public class triangle {


	private double base;
	private double height;
	
	
	public triangle(double b,double h) {
		base=b;
		height=h;
	}
	
	public triangle()
	{
		
	}
	public void setBase(double b) {
	   base=b;
	   }
	
	public void setHeight(double h)
	{
		height=h;
	}
	
	public double getbase() {
		return base;
	}
	
	public double getheight() {
		return height;
	}
	
	public double getmianji() {
		return height*base*0.5;
	}
}
