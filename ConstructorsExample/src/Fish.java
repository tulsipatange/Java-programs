
public class Fish {
	String breed;
	String color;
	String size;
	int ageInDays;
	double cost;
	
	//Java is adding default constructor
//    Fish(){ //default
//
//	  }
	
	//modifiers ClassName(param List){
			//initialize
	//     }
	
	Fish(){ //no-arg constructor
		breed="goldfish";
		color="gold";
		ageInDays=150;
		cost=50;
	}
	
	Fish(String inBreed,String inColor,int inAgeInDays){
		breed=inBreed;
		color=inColor;
		ageInDays=inAgeInDays;
	}
	
	Fish(String inBreed,String inColor,String inSize,int inAgeInDays,double inCost){
		breed=inBreed;
		color=inColor;
		size=inSize;
		ageInDays=inAgeInDays;
		cost=inCost;
	}
	
	void swimming() {
		System.out.println("Swimming using fins");
		
	}
	
	void breathing() {
		System.out.println("Breathing through gills");
	}
	
}
