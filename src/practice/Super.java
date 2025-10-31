package practice;

class Salman{
	int i = 10;
	
	Salman(){
		System.out.println("parent class constructor");
	}
	
	void m1() {
		System.out.println("parent class method");
	}
}

class Khan extends Salman{
	int i = 20;
	
	void show(int i) {
		
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
	Khan() {
		super();
		System.out.println("child class constructor");
	}
	
	void m1() {
		System.out.println("child class method");
	}
	
	void m2() {
		m1();
		super.m1();
	}
}
public class Super {

	public static void main(String_Demo1[] args) {
		Khan k = new Khan();
		k.show(30);
		k.m2();

	}

}
