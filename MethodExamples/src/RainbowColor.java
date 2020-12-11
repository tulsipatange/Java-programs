
public class RainbowColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color1 ="Blue";
		checkcolor(color1);
		String color2 ="White";
		checkcolor(color2);
		
	}
	static void checkcolor(String color) {
		switch (color) {
		case "Red":
			System.out.println("Red color is present in Rainbow");
			break;
		case "Orange":
			System.out.println("Orange color is present in Rainbow");
			break;
		case "Yellow":
			System.out.println("Yellow color is present in Rainbow");
			break;
		case "Green":
			System.out.println("Green color is present in Rainbow");
			break;
		case "Blue":
			System.out.println("Blue color is present in Rainbow");
			break;
		case "Indigo":
			System.out.println("Indigo color is present in Rainbow");
			break;
		case "Violet":
			System.out.println("Violet color is present in Rainbow");
			break;
		default:
			System.out.println(color+" is Not a color from Rainbow");
		}
	}

}
