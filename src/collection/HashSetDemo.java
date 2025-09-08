package collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		
		hashSet.add("A");
		hashSet.add("B");
		boolean r1 = hashSet.add("C");
		System.out.println(r1);
		boolean r2 = hashSet.add("C");
		System.out.println(r2);
		hashSet.add("D");
		
		System.out.println(hashSet );
		System.out.println("List contains C or not? " + hashSet.contains("C"));
		
		hashSet.remove("A");
		System.out.println("List after removing A: " + hashSet);
		
		for(String i : hashSet) {
			System.out.println(i);
		}

	}

}
