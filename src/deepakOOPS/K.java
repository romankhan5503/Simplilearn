package deepakOOPS;

public interface K {

	public void show();
	public void disp();
}

class Crk {
	public void show() {
		System.out.println("show..2..");
	}
	
	public void disp() {
		System.out.println("disp..2..");
	}
}

class Lrk extends Crk implements K{
	public static void main(String args[]) {
		K k = new Lrk();
		k.show();
		k.disp();
	}
}