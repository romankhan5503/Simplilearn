package deepakCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Arkem");
		list.add("Boman");
		list.add("Chabaz");

		System.out.println(list);

		 ListIterator<String> lit = list.listIterator();
		while (lit.hasNext()) {
			String el = lit.next();
			System.out.println(el);

			if (el.equals("Chabaz")) {
				lit.remove();
			}

		}
		System.out.println(list);
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		lit.add("chabaz");
		System.out.println(list);
	}

}
