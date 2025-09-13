package oops;

public class MOLDemo {

	int multiply(int x, int y) {
		return (x * y);
	}
	
	int multiply(int x, int y, int z) {
		return (x * y * z);
	}
	
	double multiply(double x, double y) {
		return(x * y);
	}
	
	public static void main(String[] args) {
		MOLDemo demo = new MOLDemo();
		System.out.println(demo.multiply(10, 30));
		System.out.println(demo.multiply(10, 30, 50));
		System.out.println(demo.multiply(10.7, 30.6));

	}

}
