package accessmodifier;

public class TestDemo {

	public static void main(String[] args) {
		Test t = new Test();
		t.display();
		//it showing error because default can't access private
		//t.show();

	}

}
