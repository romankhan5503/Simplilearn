package deepakCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		al.add("arkem");
		al.add("Zubair");
		
		HashSet<Object> hs = new HashSet<Object>(al);
		//HashSet<Object> hs = new HashSet<Object>(al);
		hs.addAll(al);
		hs.add(10);
		hs.add("Roman");
		hs.add(20);
		hs.add("shabaz");   
		hs.add(30.5);
		hs.add("shabaz");  //ignored
		hs.add(null); // allows one null

		System.out.println(hs);
		
		 // Checking element
        System.out.println("Contains A? " + hs.contains("A"));

        // Removing element
        hs.remove("C");
        System.out.println("After removal: " + hs);
		
		// Iterating
		Iterator<Object> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		

	}

}
