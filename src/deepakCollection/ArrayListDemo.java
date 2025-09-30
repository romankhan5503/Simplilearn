package deepakCollection;

import java.util.ArrayList;

public  class ArrayListDemo  {

	public static void main(String[] args) {
		
		ArrayList<Object> al = new ArrayList<>();
		al.add( 10);
		al.add(1, 20);
		al.add(2, "Shabaz");
		al.add(3, 40);
		al.add(4, "Shabaz");
		al.add(5, null);
		al.add(6, 50);
		al.add(7, "Roman");
		al.add(8, 60);
		al.add(9, null);
		al.add(10, 70);
		System.out.println(al);
		
		System.out.println(al.remove(9));
		
		ArrayList<Object> al2 = new ArrayList<>();
		al2.add( 10);
		al2.add(1, 20);
		al2.add(2, "Shabaz");
		al2.add(3, 40);
		al2.add(4, "Shabaz");
		System.out.println(al2);
		
		System.out.println(al.contains(50));
		System.out.println(al.contains(100));
		System.out.println(al.indexOf("Shabaz"));
		
		al.removeAll(al2);
		System.out.println(al);
		
		al.clear();
		System.out.println(al);
		
		System.out.println(al.isEmpty());
	}

}
