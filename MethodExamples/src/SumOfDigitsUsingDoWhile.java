
public class SumOfDigitsUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=123;
		sumOfDigits(num1);
		int num2=456;
		sumOfDigits(num2);
	}
static void sumOfDigits(int num) {
	int n,sum=0,temp=num;
	do {
		n=num%10;
		sum=sum+n;
		num=num/10;
	}while(num>0);
	System.out.println("sum of digits of " + temp + " is " + sum) ;
	}
}
