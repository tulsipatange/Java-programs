
public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length1=3.00;
		double breadth1=6.50;
		area(length1,breadth1);
		
		double length2=4.00;
		double breadth2=5.50;
		area(length2,breadth2);
	}
	static void area(double length,double breadth) {
	double AreaOfRectangle;
	AreaOfRectangle=length*breadth;
	System.out.println("area of rectangle for length= " + length + " and breadth= " + breadth+ " is " + AreaOfRectangle);
	}
}
