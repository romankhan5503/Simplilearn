package methods;

public class Methods {

	//Method Without Parameters
	static void sum() {
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println("sum=" +z);
	}
	
	//method without parameter but return value
	static String get() {
		return "hello";
	}
	
	//Method With Parameters 
	static void add(int x,int y) {
		int z = x+y;
		System.out.println("add=" +z);
	}
	
	//Method With Parameters and Return Value
		static  int cat(int x,int y) {
			return x + y;
			
		}

		//all in one
	static void sub(int x, int y, String a, float f, boolean b) {
		
		System.out.println(x+y+a+f+b);
		
	}
	
	//method without void true and false
	static boolean withdraw(String name,int pin) {
		if (name=="Roman" && pin== 7860)
			return true;
		else
			return false;
		
	}
	
	//method with parameter without void
	static int back(int x,int y) {
		int p,q,r;
		p = x;
		q = y;
		r = x+y;
		System.out.println("sum of two number=" +r);
		return r;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Welcome");

		
		
		sum();
		
		add(29,31);
		
		sub(20,30,"Roman",3.14f,true);
		
		System.out.println(withdraw("Roman",7860));
		
		int dad = back(10,40);
		System.out.println(dad);
		
		String mom = get();
		System.out.println(mom);
		
	}

}
