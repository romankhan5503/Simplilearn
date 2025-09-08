package collection;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<>();
		
		treemap.put(4, "A");
		treemap.put(3, "B");
		treemap.put(2, "C");
		treemap.put(1, "D");
		
		System.out.println("Size of map is: " + treemap.size());
		System.out.println(treemap);
		
		if(treemap.containsKey(4)){
			String a = treemap.get(4);
			System.out.println("Value for key" + "\"4\" is: " + a);
	}
		if(treemap.containsKey(3)){
			String b = treemap.get(3);
			System.out.println("Value for key" + "\"3\" is: " + b);
		}
		
		for(Integer key : treemap.keySet()) {
			System.out.println("Key: " + key + ", value: " + treemap.get(key));
		}
		
		for(Entry<Integer, String> entry : treemap.entrySet()) {
			System.out.println("Key- " + entry.getKey() + ", value: " + entry.getValue());
		}

	}

}
