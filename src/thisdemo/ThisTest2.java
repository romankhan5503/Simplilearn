//2)This Keyword Is Used As Methods Argument In Order To Refer Current Object.

package thisdemo;


//in this we know that a one class method call in another class

class A{
	void show() {
		System.out.println("show....");
		B b =new B();
		b.disp();
	}
}

/*
 in class B we want to call disp method in class A so it not called directly because disp
 method is a non static that's why it doesn't called directly. here we want to create an object.
*/
class B{
	void disp() {
		System.out.println("disp....");
		C.mrk();
	}
	
	void right() {
		System.out.println("java developer..");
		C.mrk();
	}
}
/*
 in class C we want to call mrk method in class B right method so it called directly 
because disp method is a static that's why it called directly.  
*/
class C{
	static void mrk() {
		System.out.println("mrk....");
	}
}

public class ThisTest2 {

	public static void main(String[] args) {
		A a = new A();
		a.show();
		
		B b = new B();
		b.right();

	}

}
