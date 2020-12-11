
public class GlassTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("program to illustrate instance methods ");
		Glass steelGlass=new Glass();   //instance of class
		steelGlass.material="steel";
		steelGlass.Shape="cone";
		steelGlass.lengthInCm=10;
		steelGlass.volumeInMl=200; 
		
		System.out.println("Glass Material "+steelGlass.material);
		System.out.println("Glass Shape "+steelGlass.Shape);
		System.out.println("Glass length in cm "+steelGlass.lengthInCm);
		System.out.println("Glass Volume in ml "+steelGlass.volumeInMl);
		
		
		String drink="ButterMilk";
		steelGlass.drinking(drink);  //method call
		
		System.out.println("Ending program");
	}

}
