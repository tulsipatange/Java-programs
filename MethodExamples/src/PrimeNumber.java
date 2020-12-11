
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=7;
		prime(num1);
		int num2=9;
		prime(num2);
		
	}
 static void prime(int num) {
	 int m=0,flag=0,i;
		m=num/2;
		if(num==0||num==1){
		System.out.println(num + " is not prime number");
		}
		else{
		for(i=2;i<=m;i++)
		{
		if(num%i==0){
		System.out.println(num + " is not a prime number");
		flag=1;  
		break;
		}
		}
		if(flag==0)
		{
		System.out.println(num + " is prime number");
		}
		}
 }
}
