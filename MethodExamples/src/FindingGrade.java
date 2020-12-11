
public class FindingGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char alpha1='A';
		grade(alpha1);
		char alpha2='C';
		grade(alpha2);
		
	}
	static void grade(char alpha) {
		switch(alpha)
		{
		case 'A': System.out.println("For Grade A");
					System.out.println("Your percentage is between 85 to 100");
					break;
		case 'B':System.out.println("For Grade B"); 
			System.out.println("Your percentage is between 65 to 84");
					break;
		case 'C':System.out.println("For Grade C"); 
			System.out.println("Your percentage is between 45 to 64");
					break;
		case 'D':System.out.println("For Grade D"); 
			System.out.println("Your percentage is between 35 to 44");
					break;
					
		default :
			System.out.println("Your percentage is below 35");
		}
		
		}
	}

