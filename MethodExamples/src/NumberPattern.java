
public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=2;
		pattern(n1);
		int n2=4;
		pattern(n2);
		
	}
	static void pattern(int n) {
		int count=1;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				System.out.print(count +" ");
				count++;
			}
			System.out.println();
		}
	}
}
