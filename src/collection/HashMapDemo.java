package collection;

import java.util.Map.Entry;
import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);
		map.put("d", 40);

		System.out.println("Size of map is: " + map.size());
		System.out.println(map);
		
		if(map.containsKey("a")){
			Integer a = map.get("a");
			System.out.println("Value for key" + "\"a\" is: " + a);
	}
		if(map.containsKey("b")){
			Integer b = map.get("b");
			System.out.println("Value for key" + "\"b\" is: " + b);
		}
		
		for(String key : map.keySet()) {
			System.out.println("Key: " + key + ", value: " + map.get(key));
		}
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key- " + entry.getKey() + ", value: " + entry.getValue());
		}
}
}
