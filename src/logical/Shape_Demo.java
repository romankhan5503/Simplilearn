package logical;

class Shape{
	void area() {
		System.out.println("Calculate area...");
	}
}

class Circle extends Shape{
	void area(double r) {
		System.out.println("Circle Area : " + (3.14*r*r));
	}
}

class Rectangle extends Shape{
	void area(double l, double b) {
		System.out.println("Rectangle Area: " + (l*b));
	}
}

public class Shape_Demo {

	public static void main(String[] args) {
		Circle c = new Circle();
		Rectangle r = new Rectangle();
		
		c.area(5);
		r.area(4, 6);
		

	}

}
