package keyword;

class OuterClass{
	static class StaticNestedClass{
		void display() {
			System.out.println("This is a static nested class.");
		}
	}
}

class Outer{
	static String outerStaticVar = "Outer static Variable";
	
	static class Nested{
		void show() {
			System.out.println("Accesssing outer class static var: " + outerStaticVar);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
		nested.display();
		
		Outer.Nested obj = new Outer.Nested();
		obj.show();
	}

}
