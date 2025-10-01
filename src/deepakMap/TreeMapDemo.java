package deepakMap;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(105, "Shabaz");
		map.put(110, "Rahul");
		map.put(107, "Arkem");
		map.put(109, "Roman");
		map.put(104, "Deepak");
		map.put(111, "Zubair");
		map.put(117, "Iqra");
		
		System.out.println(map);
		System.out.println(map.ceilingEntry(109));
		System.out.println(map.ceilingKey(107));
		System.out.println(map.floorKey(110));
		System.out.println(map.floorEntry(106));
		System.out.println(map.containsKey(117));
		System.out.println(map.containsValue("Iqra"));
		System.out.println(map.headMap(105));
		System.out.println(map.higherKey(109));
		System.out.println(map.keySet());
		System.out.println(map.pollFirstEntry());
		System.out.println(map.pollLastEntry());
		System.out.println(map);
		

	}

}
