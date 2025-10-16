package practice_constructor;

public class CopyConstructor {

	int id;
	String name;
	
	CopyConstructor(int i, String n){
		id = i;
		name = n;
	}
	
	public CopyConstructor(CopyConstructor c) {
		id = c.id;
		name = c.name;
	}

	void display() {
		System.out.println(id + " " + name);
	}
	public static void main(String[] args) {
		CopyConstructor cc = new CopyConstructor(101, "Roman");
		CopyConstructor c2 = new CopyConstructor(cc);
		cc.display();
		c2.display();

	}

}
