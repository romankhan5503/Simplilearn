package collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<String> treeset = new TreeSet<String>();
		
		treeset.add("A");
		treeset.add("B");
		treeset.add("C");
		treeset.add("D");
		
		System.out.println(treeset);
		
		treeset.remove("A");
		System.out.println("List after removing A: " + treeset);
	}

}
