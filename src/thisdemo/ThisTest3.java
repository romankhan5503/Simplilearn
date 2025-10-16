//3)This Keyword Are Also Used In Case Of Method Chaining. Calling Multiple Method 
//          On Single Object.

package thisdemo;

public class ThisTest3 {

	ThisTest3 show() {
		System.out.println("show....");
		return this;
	}
	
	ThisTest3 disp() {
		System.out.println("disp....");
		return this;
		
	}
	
	void hii() {
		System.out.println("hii....");
	}
	
	
	// we want to call more method in single line like this is called method chaining;
	
	public static void main(String[] args) {
		new ThisTest3().show().disp().hii();
		

	}

}

//if we want to call multiple method in single object then we want to update a upper method 
//           in class name 
