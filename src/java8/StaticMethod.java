package java8;

interface D{
	 static void display() {
	        System.out.println("Static method in interface D");
	    }
}

public class StaticMethod {

	public static void main(String[] args) {
		D.display();

	}

}
