
public class SumOfDigitsUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=123,sum=0,n;

		do {
			n=num%10;
			sum=sum+n;
			num=num/10;
		}while(n>0);
		System.out.println("sum of digits is =" + sum) ;
	}

}
