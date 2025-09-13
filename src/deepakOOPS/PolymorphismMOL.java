package deepakOOPS;

//NOP = numbers of parameters

class NOP{
	void m1(){
		System.out.println("numbers of parameters");
	}
	
	void m1(int a) {
		System.out.println("numbers of parameters is : " + a);
	}
}

//TOP = type of parameters
class TOP extends NOP{
	void m2(int a) {
		System.out.println("type of parameters is : " + a);
	}
	
	void m2(String a) {
		System.out.println("type of parameters is : " + a);
	}
}

//OOP = order of parameters
class OOP extends TOP{
	void m3(int a, String b) {
		System.out.println("order of parameters is : " + a+" "+b);
	}
	
	void m3(String b, int a) {
		System.out.println("order of parameters is : " + b+" "+a);
	}
}

public class PolymorphismMOL {

	public static void main(String[] args) {
		OOP obj = new OOP();
		obj.m1();
		obj.m1(10);
		obj.m2(20);
		obj.m2("Arkem");
		obj.m3(10, "Roman");
		obj.m3("Shabaz", 10);
	}

}
