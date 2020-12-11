
public class RightAnglePatternUsingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=5;
		pattern(n1);
		int n2=8;
		pattern(n2);
		
	}
	static void pattern(int n) {
		System.out.println("pattern for n=" +n);
		for(int a=n;a>=1;a--) {                                            //5 4
			for(int b=n;b>=a;b--) {                                        //5 4 3
				System.out.print(b +" ");                                  //5 4 3 2 
			}                                                              //5 4 3 2 1
			System.out.println();
		}
	}
	
}
