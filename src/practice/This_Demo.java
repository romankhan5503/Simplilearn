package practice;

class Roman{
	int i;
	
	void m1(int i) {
		this.i = i;
		System.out.println(i);
	}
}

class Arkem{
	
	Arkem(){
		System.out.println("calling constructor in another constructor");
	}
	
	Arkem(int a){
		this();
		System.out.println("parametrized constructor = " + a);
	}
	
	void m2() {
		System.out.println("m2 call in m3");
	}
	
	void m3() {
		m2();
	}
}

class Zubair{
	void m4(Zubair z) {
		System.out.println("this is m4");
	}
	
	void m5() {
		m4(this);
	}
}

class Dilshad{
	Dilshad(Bhai b) {
		System.out.println("calling constructor in another class method");
	}
}

class Bhai{
	void m6() {
		Dilshad d = new Dilshad(this);
	}
}

class Aeraf{
	Aeraf m7() {
		return this;
	}
}

public class This_Demo {

	public static void main(String_Demo1[] args) {
		Roman r = new Roman();
		r.m1(10);
		
		Arkem a = new Arkem(10);
		a.m3();
		
		Zubair z = new Zubair();
		z.m5();
	   
		Bhai b = new Bhai();
		b.m6();
		
		Aeraf af = new Aeraf();
		af.m7();

	}

}
