package oops;

public abstract class Abstraction {

int x, y;
	
Abstraction(){
	System.out.println("base abstract class");
}

	void moveTo(int newX, int newY) {
		System.out.println("move to x : " + x + " and y : " + y);
	}
	
	abstract void draw();
	abstract void resize();
}
