package practice;

public class PrivateConstructor {

	static PrivateConstructor obj = new PrivateConstructor();
	
	PrivateConstructor(){
		System.out.println("PrivateConstructor called");
	}
	
	static PrivateConstructor getInstance() {
		return obj;
	}
	
	public static void main(String[] args) {
		PrivateConstructor obj2 = PrivateConstructor.getInstance();

	}

}
