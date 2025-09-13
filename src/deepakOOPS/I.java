package deepakOOPS;

public interface I {

	int x = 10;
	int y = 20;
	
	void show();
	void disp();
}

class Demo implements I{

	@Override
	public void show() {
		System.out.println("show....");
		
	}

	@Override
	public void disp() {
		System.out.println("Disp....");
		
	}
	
	public static void main(String args[]) {
		//I i = new I(); //interface cannot create an object.
		
		I i = new Demo();
		i.show();
		i.disp();
		
	}
}