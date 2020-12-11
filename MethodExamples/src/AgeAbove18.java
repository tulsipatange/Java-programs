
public class AgeAbove18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age1=16;
		age(age1);
		
		int age2=20;
		age(age2);
		
	}
	static void age(int age) {
		if(age>18)
			System.out.println("age = "+ age +  " eligible to vote");
		else
			System.out.println("age = " +age +" not eligible to vote");

	}
}
