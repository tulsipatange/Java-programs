package com.xworkz.blocks;

public class Fish {
	String breed;
	String color;
	String size;
	int ageInDays;
	double cost;
	
	{
		System.out.println("Initialization Block 1");
		color="Red";
		breed="GoldFish";
	}
	
	Fish(){
		System.out.println("No-arg constructor");
	}
	
	{
		System.out.println("Initialization Block 2");
		size="Medium";
	}
	
	Fish(String inBreed,String inColor,int inAgeInDays){
		breed=inBreed;
		color=inColor;
		ageInDays=inAgeInDays;
	}
	
	{
		System.out.println("Initialization BLock 3");
		 cost=50.00;
		 
	}
}