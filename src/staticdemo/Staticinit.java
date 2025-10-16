package staticdemo;

public class Staticinit {

	Staticinit(){
		System.out.println("cons....");
	}
	
	Staticinit(int x){
		System.out.println(x);
	}
	
	Staticinit(int x ,int y){
		System.out.println(x+y);
	}
	
	public static void main(String[] args) {
			System.out.println("main");
			{
				System.out.println("init block is me");
			}
	}
	
	
	{
		System.out.println("init block");
	}
	
	static {
		new Staticinit();
		new Staticinit(44);
		new Staticinit(44,67);
		System.out.println("static block");
	}

	static {
		System.out.println("static block1");
	}
	
	static {
		System.out.println("static block3");
	}
	
	static {
		System.out.println("static block4");
		{
			System.out.println("init block4");
		}
	}
	
	{
		System.out.println("init block1");
	}
	
	{
		System.out.println("init block2");
	}
	
	{
		System.out.println("init block3");
	}
}
