
public class FanTester {
	public static void main(String[] args) {

		Fan ushaFan = new Fan();
		ushaFan.color = "Black";
		ushaFan.brand = "Usha";
		ushaFan.numOfPlates = 3;

		System.out.println("color of fan:" + ushaFan.color);
		System.out.println("brand of fan:" + ushaFan.brand);
		System.out.println("number of plates:" + ushaFan.numOfPlates);

		ushaFan.color = "white";
		ushaFan.numOfPlates = 4;

		System.out.println("changed color of fan:" + ushaFan.color);
		System.out.println("changed number of plates:" + ushaFan.numOfPlates);

		System.out.println("========================");

		Fan orientFan = new Fan();
		orientFan.color = "White";
		orientFan.brand = "Orient";
		orientFan.numOfPlates = 4;

		System.out.println("color of fan:" + orientFan.color);
		System.out.println("brand of fan:" + orientFan.brand);
		System.out.println("number of plates:" + orientFan.numOfPlates);

		orientFan.color = "Brown";
		orientFan.numOfPlates = 5;

		System.out.println("changed color of fan:" + orientFan.color);
		System.out.println("changed number of plates:" + orientFan.numOfPlates);
	}
}
