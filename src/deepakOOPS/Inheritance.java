package deepakOOPS;

class Base{
	int x= 10;
	
	void show() {
		System.out.println("Show....");
	}
}

public class Inheritance extends Base{
	
	Inheritance() {
		System.out.println(x);
	}
	
	void method() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		System.out.println(new Inheritance().x); //1st way to call non static into static

		Inheritance i = new Inheritance(); //2nd way to call non static into static
      	System.out.println(i.x);
      	
      	i.method(); //3rd way
      	
      	i.show(); //4th way
	}

}
