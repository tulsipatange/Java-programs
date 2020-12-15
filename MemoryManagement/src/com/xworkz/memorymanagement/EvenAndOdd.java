package com.xworkz.memorymanagement;

public class EvenAndOdd {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.out.println("Start of program");
		
		EvenAndOdd number=new EvenAndOdd();
		number.number(100);
	
		System.out.println("End of program");
	}
	void number(int num)
	{
	
		if(num%2==0)
		{
			System.out.println(num+" is even");
			}
		else {
			numberOdd(num);
		}
			
	}
	void numberOdd(int num) 
	{
		if((num%2)!=0)
		{
			System.out.println(num +"is odd");
		}
	}
}
