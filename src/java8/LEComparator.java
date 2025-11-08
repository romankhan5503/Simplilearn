package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LEComparator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(88);
		list.add(66);
		list.add(78);
		list.add(32);
		
		System.out.println(list);
		Collections.sort(list);  //ascending order
		System.out.println(list);
		Collections.sort(list, (a , b) -> b - a);  //descending order
		System.out.println(list);

	}

}
 