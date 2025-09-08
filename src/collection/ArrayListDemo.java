package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<>(5);

		for (int i = 1; i <= 5; i++) {
			arrayList.add(i);
		}

		// printing elements
		System.out.println(arrayList);

		// remove elements at index 3
		arrayList.remove(3);

		// displaying the arrayList after deletion
		System.out.println(arrayList);

		// printing elements one by one
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i) + "  ");
		}
	}

}
