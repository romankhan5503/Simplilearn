package keyword;

class Super{
	int i = 10;
}

public class SuperDemo extends Super{

	int i = 20;
	void show(int i) {
		System.out.println(i);
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
	public static void main(String[] args) {
		SuperDemo s = new SuperDemo();
		s.show(30);

	}

}
