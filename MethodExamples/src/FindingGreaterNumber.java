
public class FindingGreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=54,b=12,c=67;
		FindingGreaterNumber ref=new FindingGreaterNumber();
		int res1=ref.findGreatestNumber(a,b,c);
	
		System.out.println(res1 + " is Greatest Number among 54,12,67" );
		
		int res2=ref.findGreatestNumber(50,71,15);     //args
		System.out.println(res2 + " is Greatest Number among 50,71,15");
	}
	int findGreatestNumber(int a,int b,int c) {
		int result=0;
		if(a>b) {
			if(a>c) {
				result=a;                //System.out.println("A is Greatre");
			}else {
				result=c;               //System.out.println("C is Greater");
			}
		}else {
			if(b>c) {
				result=b;              //System.out.println("B is Greater");
			}else {
				result=c;              // System.out.println("C is Greater");
			}
		}
		return result;
	}

}
