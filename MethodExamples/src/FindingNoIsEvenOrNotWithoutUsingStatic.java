
public class FindingNoIsEvenOrNotWithoutUsingStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program to find even or not");
		
		FindingNoIsEvenOrNotWithoutUsingStatic ref=new FindingNoIsEvenOrNotWithoutUsingStatic();
		
		int num1 = 10;
		ref.findingEven(num1);

		int num2 = 65;
		ref.findingEven(num2);

		int num3 = 84;
		ref.findingEven(num3);

		System.out.println("End of program");
	}

	// accessModifier static returnType methodname(parameters)

	void findingEven(int num) {
		System.out.println("method is called");

		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		System.out.println("method completed executing");
	}

	}


