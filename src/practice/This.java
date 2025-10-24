package practice;

class First {
	int i;

	void m1(int i) {
		this.i = i;
		System.out.println(i);
	}
}

class Second {

	void m2() {
		System.out.println("this is second class");
	}

	void m3() {
		m2();
	}
}

class Third {

	Third() {
		System.out.println("no arg const...");
	}

	Third(int a) {
		this();
	}
}

class Fourth {
	void m4(Fourth f) {
		System.out.println("in m4");
	}

	void m5() {
		m4(this);
	}
}

class Fifth {
	Fifth(Sixth ft) {
		System.out.println("const....");
	}
}

class Sixth {
	void m6() {
		Fifth fh = new Fifth(this);
	}
}

class Seventh{
	Seventh m7() {
		return this;
	}
}

public class This {

	public static void main(String[] args) {

		First f = new First();
		f.m1(10);

		Second s = new Second();
		s.m3();

		Third t = new Third(10);

		Fourth ft = new Fourth();
		ft.m5();

		Sixth st = new Sixth();
		st.m6();
		
		Seventh sh = new Seventh();
		sh.m7();
	}
}
