package binding;

class Parent {
	int x = 10;
	static int y = 20;
	
	void show() {
		System.out.println("Parent Show....");
	}
	
	static void disp() {
		System.out.println("Parent Display....");
	}
	
	Parent(){
		System.out.println("Parent Contructor....");
	}
}

class Derived extends Parent{
	int x = 20;
	static int y = 200;
	
	Derived(){
		System.out.println("Derived Constructor....");
	}
	
	static void disp() {
		System.out.println("Derived Display....");
	}
	
	void show() {
		System.out.println("Derived Show....");
	}
}


public class TestBinding {

	public static void main(String[] args) {
		Parent d = new Derived();
		System.out.println(d.x);
		System.out.println(d.y);
		d.show();
		d.disp();
		

	}

}
