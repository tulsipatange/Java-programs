package com.xworkz.staticmembers.fields;

public class Trainee {
	int id;
	String name;
	String emailId;
	static String institution="X-Workz";
	int age;
	
	//static block
	static {//initialized at the time of class loading
		System.out.println("in static block");
		institution="GSSS";
	}
	
	Trainee(){
		System.out.println("no arg constructor");
	}
	
	Trainee(int inId,String inName,String inEmailId,int inAge){
		id=inId;
		name=inName;
		emailId=inEmailId;
		age=inAge;
	}
	
	static void setInstitution(String inInstitution) {
		//initialization for static members
		//called based on requirement
		//cannot access/call non-static members(variables/methods)
		// age=20;          //not allowed
		//displayDetails();    //not allowed
		System.out.println("in static method");
		institution="X-workz";
	}
	
	void displayDetails() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Email Id: "+emailId);
		System.out.println("Age: "+age);
		
	}
}
