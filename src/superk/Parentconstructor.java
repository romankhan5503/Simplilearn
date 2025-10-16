package superk;

class Human{
	Human(){
		System.out.println("Being Human");
	}
}

class Father extends Human{
	Father(){
		super();  // calls parent constructor
		System.out.println("Best Father");
	}
	
}


public class Parentconstructor {

	public static void main(String[] args) {
		Father f = new Father();
	}

}
