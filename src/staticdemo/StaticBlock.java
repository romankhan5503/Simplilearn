package staticdemo;

public class StaticBlock {

	
	StaticBlock(){
		System.out.println("constant");
	}
	public static void main(String[] args) {
		System.out.println("main");

	}

	static {
		
		new StaticBlock();
		System.out.println("static");
	}
}
