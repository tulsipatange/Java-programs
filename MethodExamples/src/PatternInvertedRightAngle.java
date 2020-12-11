
public class PatternInvertedRightAngle {

	public static void main(String[] args) {
		System.out.println("inverted right angle");
		// TODO Auto-generated method stub
		int n1=5;
		pattern(n1);
		int n2=6;
		pattern(n2);
		
	}
	static void pattern(int n) {
		System.out.println("pattern for n=" + n);
		for(int i=n;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
	}
		
	}
}
