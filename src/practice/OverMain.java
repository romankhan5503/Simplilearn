package practice;

public class OverMain {

	OverMain(){
		System.out.println("Simple Const");
	}
	
	OverMain(int x){
		System.out.println("Cons with parameter " + x);
	}
	
	void main() {
		System.out.println("Hello Java 2");
	}
	
	void main(int a) {
		System.out.println("Hello java 3 " + a);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Java");
		OverMain om = new OverMain();
		om.main();
		om.main(10);

		new OverMain(100);

	}

	
}
