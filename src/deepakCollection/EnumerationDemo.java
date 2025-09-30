package deepakCollection;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("A");
		v.add("B");
		v.add("C");
		
		Enumeration<String> e = v.elements();
		
		System.out.println(v);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
