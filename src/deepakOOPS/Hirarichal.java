package deepakOOPS;

class A3{
	void show() {
		System.out.println("Show...");
	}
}

class B3 extends A3 {
	void disp() {
		System.out.println("disp....");
	}
}

class C2 extends A3{
	void area() {
		System.out.println("area....");
	}
}

public class Hirarichal {

	public static void main(String[] args) {
		C2 c = new C2();
		c.show();
		c.area();
		

	}

}
