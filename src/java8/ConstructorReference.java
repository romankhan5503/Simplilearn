package java8;

import java.util.function.BiFunction;
import java.util.function.Supplier;

class Arkem{
	
	String name;
    int age;
    
	public Arkem() {
		System.out.println("my name is this");
	}
	
	Arkem(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person created: " + name + ", age " + age);
    }
}


public class ConstructorReference {

	public static void main(String[] args) {
		Supplier<Arkem> constref = Arkem :: new;
		constref.get();
		
		BiFunction<String, Integer, Arkem> ak = Arkem :: new;
		ak.apply("Roman", 21);

	}

}
