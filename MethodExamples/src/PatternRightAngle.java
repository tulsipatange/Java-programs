
public class PatternRightAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("pattern right angle");
		int n1=5;
		pattern(n1);
		int n2=6;
		pattern(n2);
		
	}
	static void pattern(int n) {
		System.out.println("pattern for n=" + n);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}
}
