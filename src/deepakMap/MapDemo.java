package deepakMap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(101, " Roman");
		m.put(102, " Amit");
		m.put(103, " Zubair");
		System.out.println(m);
		
		//m.clear();
		System.out.println(m.containsKey(101));
		System.out.println(m.containsValue(" Amit"));
		
		//m.remove(103); 
		m.replace(102, " Arkem");
		System.out.println(m);

	}

}
