
public class BirdsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds sparrow = new Birds();
		sparrow.name = "Sparrow";
		sparrow.beakColor = "Black";
		sparrow.featherColor = "Brown";

		System.out.println("name of the bird:" + sparrow.name);
		System.out.println("beak color of the bird:" + sparrow.beakColor);
		System.out.println("feather color of the bird:" + sparrow.featherColor);

		System.out.println("===========================");
		Birds parrot = new Birds();
		parrot.name = "Parrot";
		parrot.beakColor = "Red";
		parrot.featherColor = "Green";

		System.out.println("name of the bird:" + parrot.name);
		System.out.println("beak color of the bird:" + parrot.beakColor);
		System.out.println("feather color of the bird:" + parrot.featherColor);

	}

}
