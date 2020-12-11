
public class FactorialUsingWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=5;
		factorial(n1);
		int n2=8;
		factorial(n2);
		
	}
	static void factorial(int num) {
		int fact=1,temp=num;
		while(num>0) {
			fact=fact*num;
			num--;
		}
		System.out.println("factorial of " + temp + " is " +fact);
	}
}
