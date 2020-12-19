package com.xworkz.staticmembers.fields;

public class TraineeTester {

	public static void main(String[] args) {
		
		Trainee tulsi=new Trainee(1,"tulsi","tulsi@gmail.com",22);
		tulsi.displayDetails();
		Trainee.setInstitution("X-workz");
		System.out.println("===========================");
		
		Trainee priya=new Trainee(2,"priya","priya@gmail.com",22);
		priya.displayDetails();
		
		System.out.println("============================");
		
		Trainee soumya=new Trainee(3,"soumya","soumya@gmail.com",22);
		soumya.displayDetails();
		
		System.out.println("=============================");
		
		Trainee.institution="Something";
		Trainee riya=new Trainee(4,"riya","riya@gmail.com",23);
		riya.displayDetails();
		
		
	}

}
