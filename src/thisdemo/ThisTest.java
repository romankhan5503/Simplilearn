//1)It Is Used To Identify The Instance Variable In Case Of Data Shadowing.

package thisdemo;

public class ThisTest {

	int x= 10;
	
	/* why this is showing 20 in output because of data shadowing
	  if we want to show instance variable then we should do 
	  1st is using this keyword and the
	  2nd is object into parameter like this
	  
	void show(This t) {
		int x = 20;
		System.out.println(t.x);
	}
	public static void main(String[] args) {
		This t = new This();
		t.show(t);
	*/
	void show() {
		int x = 20;
		System.out.println(x);
	}
	public static void main(String[] args) {
		ThisTest t = new ThisTest();
		t.show();

	}

}

