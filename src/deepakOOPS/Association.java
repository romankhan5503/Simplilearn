package deepakOOPS;

class Back{
	int x = 10;
	
	void show() {
		System.out.println("show....");
	}
}

public class Association {

	public static void main(String[] args) {
		Back b = new Back(); //Association
		b.show();
		
		new Back(); //Composition
		Back b1; //Aggregation

	}

}
//like another example















