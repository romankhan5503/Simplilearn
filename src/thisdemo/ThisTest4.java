package thisdemo;

public class ThisTest4 {

	ThisTest4() {
		this(34);
		System.out.println("default....");
	}
	
	ThisTest4(int x) {
		this(55,87);
		System.out.println(x);
	}
	
	ThisTest4(int x, int y) {
		System.out.println(x);
		System.out.println(y);
	}

	
	public static void main(String[] args) {
		new  ThisTest4();
	}

}
