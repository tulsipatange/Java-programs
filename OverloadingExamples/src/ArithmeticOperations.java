
public class ArithmeticOperations {
	int addition(int a,int b) {
		int sum=a+b;
		return sum;
	}
	//method overloading
	//compile time polymorphisom
	int addition(int x,int y,int z) {
		int sum=x+y+z;
		return sum;
	}
	double addition(double o,double p) {
		double sum=o+p;
		return sum;
	}
}
