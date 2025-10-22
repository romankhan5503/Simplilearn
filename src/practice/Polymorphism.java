package practice;

//MOR
class Poly{
	
	void show() {
		System.out.println("Helloo java");
	}
}

//MOL
public class Polymorphism extends Poly{

	void show() {
		System.out.println("show....");
	}
	
	void show(int x) {
		System.out.println("Showig...");
	}
	
	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
//		p.show();
		p.show(10);

		Poly po = new Poly();
		po.show();
	}

}


