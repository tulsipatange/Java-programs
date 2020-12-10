
public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program to illustrate break");
		
		//found 5
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			else
				System.out.println("i = " + i);
		}
		System.out.println("========================");
		System.out.println("program to illustrate continue");
		//continue skip execute 6
		for(int i=1;i<=10;i++) {
			if(i==6) {
				continue;
			}
			else
				System.out.println("i = " + i);
	}

}
}
