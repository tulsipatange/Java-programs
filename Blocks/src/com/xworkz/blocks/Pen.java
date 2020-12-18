package com.xworkz.blocks;

public class Pen {
	String color;
	String brand;
	boolean isRefill;
	double price;
	
	{
		System.out.println("initialization block 1");
		color="Blue";
		brand="Ranolds";
	}
	
	Pen(){
		System.out.println("No-arg constructor");
	}
	
	{
		System.out.println("initialization block 2");
		isRefill=true;
	}
	
	Pen(String inColor,String inBrand,double inPrice)
	{
		color=inColor;
		brand=inBrand;
		price=inPrice;
	}
	
	{
		System.out.println("initialization block 3");
		price=20.00;
	}
}
