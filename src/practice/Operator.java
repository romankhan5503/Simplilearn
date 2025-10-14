package practice;

public class Operator {

	public static void main(String[] args) {
		
		//Arithmetic operator
		int a = 5, b = 10;
		
		System.out.println("=====arithmetic operator====");
		System.out.println("Addition : " + (a + b));
		System.out.println("Substraction : " + (a - b));
		System.out.println(("Multiplication : " + (a * b)));
		System.out.println("Division : " + (a / b));
		System.out.println("Modulus : " + (a % b));
        System.out.println();
		
		//unary operator
		int c = 20;
		boolean d = true;
		
		System.out.println("=====unary operator====");
		System.out.println("post increment : " + (c++));
		System.out.println("post decrement : " + (c--));
		System.out.println("after post increment : " + c);
		System.out.println("pre increment : " + (++c));
		System.out.println("pre decrement : " + (--c));
		System.out.println("negation : " + (!d));
		 System.out.println();
		
		//assignment operator
		int e = 60;
		
		System.out.println("=====assignment operator====");
		e = e + 5; // e += 5
		System.out.println(e);
		
		e -= 5;
		System.out.println(e);
		
		e /= 5;
		System.out.println(e);
		
		e *= 2;
		System.out.println(e);
		
		e %= 3;
		System.out.println(e);
		System.out.println();
		
		//relational operator
		int  f = 30, g = 40;
		
		System.out.println("=====relational operator====");
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a >= b);
		System.out.println(a <= b);
		System.out.println();
		
		//logical operator
		int h = 50, i = 30;
		
		System.out.println("=====logical operator====");
		System.out.println((h > 40) && (i > 20));
		System.out.println((h < i) || (i > h));
		System.out.println(!(h > i));
		System.out.println();
		
		//bitwise operator
		int j = 5, k = 3;
		
		System.out.println("=====bitwise operator====");
		System.out.println(j & k);
		System.out.println(j | k);
		System.out.println(j ^ k);
		System.out.println(~j);
		System.out.println(j << k);
		System.out.println(j >> k);
		System.out.println(j >>> k);
		System.out.println();
		
		//ternary operator
		int l = 60, m = 70;
		
		System.out.println("=====ternary operator====");
		int max = (l > m) ? l : m;
		System.out.println(max);
		System.out.println();
		
		
	}

}
