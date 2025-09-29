package deepakCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Arkem");
		list.add("Boman");
		list.add("Chabaz");
		
		System.out.println(list);
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String el = it.next();
			System.out.println(el);
			
			if(el.equals("Chabaz")) {
				it.remove();
			}
			
		}
		
		System.out.println(list);

	}

}
