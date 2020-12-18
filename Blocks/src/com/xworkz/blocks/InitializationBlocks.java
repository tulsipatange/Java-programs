package com.xworkz.blocks;

public class InitializationBlocks {

	{
	//Initialization block
		System.out.println("This is Initialization Block");
		
	}
	{
		//Initialization block
			System.out.println("This is Initialization Block 2");
			
		}
	
	InitializationBlocks(){
		System.out.println("Non-arg constructor");
	}
	
	InitializationBlocks(int a,int b){
		System.out.println("parameterized constructor");
	}
	{
		//Initialization block
			System.out.println("This is Initialization Block 3");
			
		}
}
