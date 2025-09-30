 package deepakCollection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Object> li = new LinkedList<Object>();
		
		li.add("Roman");
		li.add("Shabaz");
		li.add(205);
		li.add(5.504);
		li.add('c');
		li.add("Roman");
		li.add(null);
		li.add("Shabaz");
		li.add(null);

		li.addFirst(505);
		li.addLast(1000);
		li.remove(3);
		
		System.out.println(li);
		System.out.println(li.getFirst());
		System.out.println(li.getLast());

	}

}
