package deepakOOPS;

class A1{
	void show() {
		System.out.println("Show....");
	}
}

class B1 extends A1{
	void disp() {
		System.out.println("Disp....");
	}
}


public class Single {

	public static void main(String[] args) {
		B1 b = new B1();
		b.show();
		b.disp();
	}

}
