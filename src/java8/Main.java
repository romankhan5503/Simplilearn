package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Student{
	
	public Integer id;
	public String name;
	
	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return this.id + ": " + this.name;
	}
}

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(2, "Roman");
		Student s2 = new Student(22, "Shabaz");
		Student s3 = new Student(33, "Arkem");
		
		List<Student> li = new ArrayList<Student>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		Collections.sort(li, (a, b) -> b.id - a.id);
		System.out.println(li);
	}

}
