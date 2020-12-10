
public class ArithmeticOperationsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Start of program");
	ArithmeticOperations.operation=new ArithmeticOperations();
	int a=10,b=20;
	int result=operation.addition(a,b);  //method calling
	System.out.println("Result of a "+a+"and b"+"is"+result);
	
	int p=20,q=25,r=40;
	int result2=operation.addition(p,q,r);
	System.out.println("Result of "+p,q,r+"is"+result2);
	
	System.out.println("end of program");
	
	}

}
