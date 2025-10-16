package practice;

class A{
	void eat() {
		System.out.println("eat....");
	}
}

class B extends A{
	void show() {
		System.out.println("show111");
	}
}
public class Single_Inheritance {

	public static void main(String[] args) {
		B b = new B();
		b.eat();   //inherited method
		b.show();  //own method
//		A a = new B();
//		a.show();

	}

}

