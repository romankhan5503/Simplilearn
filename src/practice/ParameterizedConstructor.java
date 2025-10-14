package practice;

public class ParameterizedConstructor {

	int id;
	String name;
	
	ParameterizedConstructor(int i, String n){
		id = i;
		name = n;
	}
	
	void display() {
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
		
		ParameterizedConstructor pc = new ParameterizedConstructor(1, "Roman");
		pc.display();
		
		ParameterizedConstructor pc1 = new ParameterizedConstructor(2, "Shabaz");
        pc1.display();
	}

}
