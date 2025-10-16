package practice_constructor;

public class DefaultConstructor {

	int id;
	String name;

	void display() {
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
		DefaultConstructor c = new DefaultConstructor();
		c.display();
	}

}
