package com.xworkz.memorymanagement;

public class FindingCircumferenceOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of program");
		
		FindingCircumferenceOfCircle fc=new FindingCircumferenceOfCircle();
		double result=fc.findCircumefrence(5);
		System.out.println("circumference of radius 5 is "+ result);
		System.out.println("End of Program");
	}
double findCircumefrence(int radius) {
	//c=2*pi*radiusfindCircumefrence
	double circumference;
	double pi=findPi();//method calling
	System.out.println("value of pi is "+ pi);
	circumference=2*pi*radius;
	return circumference;
}
double findPi() {
	double pi=(22.00/7.00);
	return pi;
}
}
