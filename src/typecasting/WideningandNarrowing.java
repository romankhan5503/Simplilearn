package typecasting;

public class WideningandNarrowing {

	public static void main(String[] args) {
		
		//Widening
		byte a = 30;
		short b = a;
		int c = a;
		long d = a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//Narrowing
		long e = 300;
		int f = (int)e;
		short g = (short)f;
		byte h = (byte)e;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);

		/* why this is showing error because we have to do a type casting; 
		its output is 44 why because 
		total value is 200 in 200 - 127 = 73 and also 73 - 1 = 72 then it comes into minus the value of minus is
		-128 then the solution is 72 - 128  = -56 
		*/
		byte b1 = 100;
		byte b2 = 100;
		byte c1 = (byte)(b1+b2);
		System.out.println(c1);
		
		/*
		 interview Question
		 because in b4 condition there has a byte and int formation in short and long formation long is win 
		 thats why b4 cond is showing compile time error 
		 */
		byte b3 = 20;
		b3++; //this cond is work
		System.out.println(b3);
		
//		byte b4 = 20;
//		b4=b4+1; //why this is not 
//		//  b4= (byte) (b4+1) it work 
//		System.out.println(b4);
		
		int male = 2;
		int female = 3;
		float  both = (float)male/female;
		System.out.println(both);
	}
	

}
/*
convert one data type into another
it has 2 types
1. widening [implicit] (smaller type to a larger type Done automatically by Java (no need to write extra code))
                 int → long → float → double
2. narrowing [explicit] (a larger type to a smaller type. You have to do it manually using a cast)
                 double → float → int → byte
*/