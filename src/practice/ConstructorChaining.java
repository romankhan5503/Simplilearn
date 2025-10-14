package practice;

public class ConstructorChaining {

	int id;
	String name;
	int age;
	
	ConstructorChaining(){
		this(101, "Roman");
		System.out.println("default ConstructorChaining");
	}
	
	ConstructorChaining(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void display() {
        System.out.println(id + " " + name);
    }
	
	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining();
		obj.display();

	}

}
