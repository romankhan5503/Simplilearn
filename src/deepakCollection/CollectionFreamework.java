package deepakCollection;


import java.util.ArrayList;
import java.util.Collection;

public class CollectionFreamework {

	public static void main(String[] args) { 
		
		Collection<String> cl = new ArrayList<>();
		
		 // add()
		cl.add("Apple");
		cl.add("Banana");
		cl.add("Orange");
		System.out.println("After add: " + cl);
		
		
		// addAll()
        Collection<String> mf = new ArrayList<>();
        mf.add("Grapes");
        mf.add("Mango");
        cl.addAll(mf);
        System.out.println("After addAll: " + cl);

        // contains()
        System.out.println("Contains Mango? " + cl.contains("Mango"));

        // remove()
        cl.remove("Banana");
        System.out.println("After remove Banana: " + cl);

        // removeAll()
        cl.removeAll(mf);
        System.out.println("After removeAll moreFruits: " + cl);

        // size() & isEmpty()
        System.out.println("Size: " + cl.size());
        System.out.println("Is empty? " + cl.isEmpty());

        // clear()
        cl.clear();
        System.out.println("\nAfter clear, is empty? " + cl.isEmpty());
		
		
		System.out.println(cl);
	}

}
