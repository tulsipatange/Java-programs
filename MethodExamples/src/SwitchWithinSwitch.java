
public class SwitchWithinSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String branch1="CSE";
		String subject1="ADA";
		syllabus(branch1,subject1);
		
		String branch2="ECE";
		String subject2="ADA";
		syllabus(branch2,subject2);
	}
	static void syllabus(String branch,String subject) {
		switch(branch)
		{
		case "CSE":
			switch(subject)
			{
			case "JAVA":
				System.out.println("you have selected CSE branch with JAVA subject");
				System.out.println("Syllabus :Method Overloading,Multithreading");
				break;
			case "OS":
				System.out.println("you have selected CSE branch with OS subject");
				System.out.println("Syllabus : Processes and Process Management , Scheduling");
				break;
			case "ADA":
				System.out.println("you have selected CSE branch with ADA subject");
				System.out.println("Syllabus : Analysis of algoritms,Best case worst case");
				break;
			default:
				System.out.println("Enter correct subject");
			}
			break;
		case "ECE":
			switch(subject)
			{
			case "DC":
				System.out.println("you have selected EC branch with DC subject");
				System.out.println("Syllabus :Direct current,ohms Law");
				break;
			case "NA":
				System.out.println("you have selected EC branch with NA subject");
				System.out.println("Syllabus :Network analysis, service areas");
				break;
			case "CS":
				System.out.println("you have selected EC branch with Cs subject");
				System.out.println("Syllabus :open loop and close loop,System interfering");
				break;
			default:
				System.out.println("Enter correct subject");
			}
			break;
		case "ME":
			switch(subject)
			{
			case "CAD":
				System.out.println("you have selected ME branch with CAD subject");
				System.out.println("Syllabus :curves,3D models");
				break;
			case "Survey":
				System.out.println("you have selected ME branch with survey subject");
				System.out.println("Syllabus :market survey,customer survey");
				break;
			default:
				System.out.println("Enter correct subject");
			}
			break;
		default:
			System.out.println("Enter correct subject");
		}
	}
}
