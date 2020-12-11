
public class PyramidPattern {

	public static void main(String[] args) {
		System.out.println("pyramid pattern");
		// TODO Auto-generated method stub
		int n1=5;
		pattern(n1);
		int n2=9;
		pattern(n2);
		
	}
	static void pattern(int n) {
		System.out.println("Pyramid pattern for n="+n);
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
