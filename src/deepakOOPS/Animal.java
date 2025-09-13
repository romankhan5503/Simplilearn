package deepakOOPS;

public class Animal {

	int no_of_eyes;
	String color;
	
	void Details(String name) {
		System.out.println("-----------Details of" + name+ "----------");
		System.out.println(name + " has "+ no_of_eyes + " eyes");
		System.out.println(name + " color is "+ color);
	}
	
	void details(String name) {
		System.out.println("-----------Details of" + name+ "----------");
		System.out.println(name + " has "+ no_of_eyes + " eyes");
		System.out.println(name + " color is "+ color);
	}
	public static void main(String[] args) {
		Animal a = new Animal();
		a.no_of_eyes = 2;
		a.color = "Black";
		a.Details("jumbo");
		
		Animal tommy = new Animal();
		tommy.no_of_eyes = 2;
		tommy.color = "Brown";
		tommy.details("Buzo");

	}

}
