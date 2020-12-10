
public class RightAnglePatternUsingNumbers {

	public static void main(String[] args) {    //inverted right angle pattern
		// TODO Auto-generated method stub
		int n=5;
		
		System.out.println("inverted right angle pattern");
	for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++){
				System.out.print(' ');
			}
			for(int k=i;k<=n;k++) {
				System.out.print("*");
			}
		System.out.println();
		}
	//right angle pattern using numbers                                //5
	for(int a=5;a>=1;a--) {                                            //5 4
		for(int b=5;b>=a;b--) {                                        //5 4 3
			System.out.print(b +" ");                                  //5 4 3 2 
		}                                                              //5 4 3 2 1
		System.out.println();
	}
	}
}