package oops;

class Circle extends Abstraction {

	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}

	@Override
	void resize() {
		System.out.println("Resizing a circle");
	}
}

class Rectangle extends Abstraction {

	@Override
	void draw() {
		System.out.println("Drwaing a Rectangle");
	}

	@Override
	void resize() {
		System.out.println("Resizing a Rectangle");
	}
}

public class AbstractionDemo {
	public static void main(String args[]) {
		Abstraction circle = new Circle();
		circle.draw();
		circle.resize();

		Abstraction rectangle = new Rectangle();
		rectangle.draw();
		rectangle.resize();
	}
}
