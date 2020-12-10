
public class SkipFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program to illustrate skip multiples of 5 using continue in while loop ");
		int n=1;
		while(n<=15) {
			if(n%5==0) {
				n++;
				continue;
			}
			
			System.out.println(n);
			n++;
	}
		System.out.println("end of program");
}
}
