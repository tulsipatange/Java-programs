
public class NumberOfDigitsUsingDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=123;
		digits(num1);
		int num2=4565;
		digits(num2);
	}
	static void digits(int num) {
		int count=0,temp=num;
		do
		{
			num=num/10;
			count++;
		}while(num>0);
		System.out.println("number of digits are in " + temp +" are : " +count);
	}
}
