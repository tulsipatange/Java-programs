
public class NumberOfDigitsUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=456,count=0,rem;
		do {
		rem=n%10;
		count++;
		n=n/10;
		}while(n>0);
		System.out.println("number of digits="+ count);
	}

}
