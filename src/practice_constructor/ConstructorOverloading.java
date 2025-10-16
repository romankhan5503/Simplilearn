package practice_constructor;

public class ConstructorOverloading {
	int id;
	String name;
	int age;

	ConstructorOverloading(int i, String n){
		id = i;
		name = n;
	}
	
	ConstructorOverloading(int i, String n, int a){
		id = i;
		name = n;
		age = a;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + age);
	}
	public static void main(String[] args) {
		ConstructorOverloading co = new ConstructorOverloading(101, "Roman");
		co.display();
		
		ConstructorOverloading co1 = new ConstructorOverloading(101, "Roman", 23);
		co1.display();

	}

}
