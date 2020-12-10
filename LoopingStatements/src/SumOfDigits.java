
public class SumOfDigits {
	public static void main(String args[]) {
		int num=456,sum=0,n;
		while(num>0)
		{
		n=num%10;
		sum=sum+n;
		num=num/10;
		}
		System.out.println("sum of digits is:" + sum);
	}
}
