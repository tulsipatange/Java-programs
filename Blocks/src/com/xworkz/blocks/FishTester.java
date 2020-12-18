package com.xworkz.blocks;

public class FishTester {
	public static void main(String[] args) {
		Fish goldfish=new Fish();
		System.out.println("Breed: " + goldfish.breed);
		System.out.println("Life span: " + goldfish.ageInDays);
		System.out.println("Color: " + goldfish.color);
		System.out.println("Cost: " + goldfish.cost);
		System.out.println("Size: " + goldfish.size);
		
		System.out.println("=============================");
		
		Fish shark=new Fish("Shark","Black",150);
		System.out.println("Breed: " + shark.breed);
		System.out.println("Color: " + shark.color);
		System.out.println("Life span: " + shark.ageInDays);
		System.out.println("Cost: " + shark.cost);
		System.out.println("Size: " + shark.size);
	}

}
