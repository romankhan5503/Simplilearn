package deepakOOPS;

class Animals{
	void sound() {
		System.out.println("m1() method in class Animals");
	}
}

class Dog extends Animals{
	void sound() {
		System.out.println("m2() method in class Dog");
	}
}

public class PolymorphismMOR {

	public static void main(String[] args) {
		Animals a = new Dog();
		a.sound();
		
		
		Test t = new Test();
		t.show();
		
		Xyz x = new Xyz();
		x.show();
	}
}

//overriding and Exception handling
class Test {
	void show() throws RuntimeException{
		System.out.println("1");
	}
}

class Xyz extends Test{
	void show() throws ArithmeticException{
		System.out.println("2");
	}
}

//work
//class Test {
//	void show() throws RuntimeException{
//		System.out.println("1");
//	}
//}
//
//class Xyz extends Test{
//	void show() throws RuntimeException{
//		System.out.println("2");
//	}
//}


//not work
//class Test {
//	void show() throws RuntimeException{
//		System.out.println("1");
//	}
//}
//
//class Xyz extends Test{
//	void show() throws Exception{
//		System.out.println("2");
//	}
//}

// work
//class Test {
//	void show() {
//		System.out.println("1");
//	}
//}
//
//class Xyz extends Test{
//	void show() throws ArithmeticException{
//		System.out.println("2");
//	}
//}

// work
//class Test {
//	void show() throws RuntimeException{
//		System.out.println("1");
//	}
//}
//
//class Xyz extends Test{
//	void show() {
//		System.out.println("2");
//	}
//}