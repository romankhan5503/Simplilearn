package deepakCollection;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<Object>();
		v.add("Roman");
		v.add(1, "Shabaz");
		v.add(2, "Zubair");
		System.out.println(v);
		
		//v.removeElementAt(2);
		System.out.println(v.capacity());
		System.out.println(v);
		
		v.setElementAt("Arkem", 2);
		System.out.println(v);

	}

}
