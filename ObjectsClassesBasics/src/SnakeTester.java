
public class SnakeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snake cobra=new Snake();       //instance
		cobra.breed="Cobra";
		cobra.color="Black";
		cobra.isPoisonous=true;
		cobra.lifeSpan=50;
		cobra.lengthInMeters=1;
		
		System.out.println("Details pf Cobra:");
		System.out.println("color of cobra is:" +cobra.color);
		System.out.println("Breed of cobra is:" +cobra.breed);
		System.out.println("is cobra Poisonous:"+cobra.isPoisonous);
		System.out.println("life span of cobra:"+cobra.lifeSpan);
		System.out.println("length of cobra in meters:"+cobra.lengthInMeters);
		
		cobra.color="Brown";
		System.out.println("changed color of cobra is:" +cobra.color);
		
		cobra.biting();
		
		Snake rattleSnake=new Snake();
		rattleSnake.breed="Rattle";
		rattleSnake.color="dusty";
		rattleSnake.isPoisonous=true;
		rattleSnake.lifeSpan=25;
		rattleSnake.lengthInMeters=1.5;
		
	}

}
