package datatypes;

public class Conversions {

	public static void main(String[] args) {
		//implicit
		byte b = 120;
		System.out.println(b);
		
		short s = b;
		System.out.println(s);
		
		int i  = s;
		System.out.println(i);
		
		long l = i;
		System.out.println(l);
		
		float f = l;
		System.out.println(f);
		
		double d = f;
		System.out.println(d);
		
		//explicit
		double a = 60.70;
		System.out.println(a);
		
		float c = (float)a;
		System.out.println(c);
		
		long e = (long)c;
		System.out.println(e);
		
		int g = (int)e;
		System.out.println(g);
		
		short h = (short)g;
		System.out.println(h);
		
		byte j = (byte)h;
		System.out.println(j);

	}

}
