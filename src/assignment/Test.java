package assignment;

public class Test {

	Test(){
		this(44,56);
		System.out.println("Constructor......");
	}
	
	Test(int x){
		this();
		System.out.println(x);
	}
	
	Test(int x, int y){
		this("Hii...");
		System.out.println(x);
		System.out.println(y);
	}
	
	Test(String s){
		System.out.println(s);
	}
	
	static {
		new Test(15);
		new Test();
		System.out.println("static1");
		
//		new Test(55);
//		new Test(44,56);
	}
	
	{
		System.out.println("init....");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		new Test("Bye....");
	}

	static {
		System.out.println("static2");
		new Test(12,46);
		new Test(44);
		new Test();
	}
}
