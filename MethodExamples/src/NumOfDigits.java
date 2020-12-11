public class NumOfDigits{
	public static void main(String[] args) {
		int num1=123;
		digits(num1);
		int num2=4565;
		digits(num2);
		
	}
	static void digits(int num) {
		int count=0,temp=num;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("number of digits in " + temp + " are: "+count);
	}
}