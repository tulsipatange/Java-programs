
public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 20;
		PositiveOrNegative(num1);
		int num2 = -30;
		PositiveOrNegative(num2);

	}

	static void PositiveOrNegative(int num) {
		if (num > 0)
			System.out.println(num + " is positive");
		else
			System.out.println(num + " is negative");
	}

}
