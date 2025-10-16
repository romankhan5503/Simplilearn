package superk;

class Car{
	String name = "cars";
}

class Mercedes extends Car{
	String name = "Mercedes";
	
	void show() {
		System.out.println("My Car Name is : " +name);
		System.out.println("My Parent Car Name is : " +super.name); // using super
	}
}

public class Parentvariables {

	public static void main(String[] args) {
		Mercedes m = new Mercedes();
		m.show();

	}

}
