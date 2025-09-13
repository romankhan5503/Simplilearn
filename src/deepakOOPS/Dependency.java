package deepakOOPS;

class Printer{
	void printDocument(String docname) {
		System.out.println("printing document: " + docname);
	}
}

class Officework{
	void dowork() {
		Printer print = new Printer(); //dependency
		print.printDocument("Roman");
		System.out.println("shabaz");
		System.out.println("work completed");
	}
}

public class Dependency {

	
	public static void main(String[] args) {
		Officework office = new Officework();
		office.dowork();

	}

}
