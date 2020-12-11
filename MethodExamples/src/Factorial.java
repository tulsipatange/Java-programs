
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=5;
		factnum(num1);
		int num2=8;
		factnum(num2);
	}
	static void factnum(int num) {
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is of " + num + " is " + fact);
		
	}
	}

