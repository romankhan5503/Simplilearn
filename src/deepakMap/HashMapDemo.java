package deepakMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "Roman");
		hm.put(102, "Arkem");
		hm.put(103, "Shabaz");
		hm.put(104, "Zubair");
		hm.put(102, "Mango"); // updates value for key 2
		hm.put(null, "NullKey"); // one null key
        hm.put(4, null);        // null values allowed

		System.out.println(hm);

		 // Accessing
        System.out.println("Value for key 2: " + hm.get(102));

        // Checking
        System.out.println("Contains key 3? " + hm.containsKey(103));
		
//		Set<Entry<Integer, String>> set = hm.entrySet();
//		System.out.println(set);
//
		// Iterating through entrySet
//		Iterator<Entry<Integer, String>> itr = set.iterator();
//		while (itr.hasNext()) {
//            //System.out.println(itr.next());
//			Map.Entry entry = itr.next();
//			System.out.println(entry.getKey() + " -> " + entry.getValue());
//		}
		
		for(Map.Entry me : hm.entrySet()) {
			System.out.println(me.getKey() + " -> " + me.getValue());
		}

	}

}
