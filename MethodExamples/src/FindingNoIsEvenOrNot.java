
public class FindingNoIsEvenOrNot {
	public static void main(String[] args) {// calling method
		// main-->JVM

		int num1 = 10;
		findingEven(num1);

		int num2 = 65;
		findingEven(num2);

		int num3 = 84;
		findingEven(num3);

		System.out.println("End of program");
	}

	// accessModifier static returnType methodname(parameters)

	static void findingEven(int num) {
		System.out.println("method is called");

		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		System.out.println("method completed executing");
	}
}
