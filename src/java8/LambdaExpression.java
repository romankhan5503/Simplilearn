package java8;

@FunctionalInterface
interface Message {
    void say();
}

@FunctionalInterface
interface Addable {
    void add(int a, int b);
}

public class LambdaExpression {

    public static void main(String[] args) {
        
        // Lambda expression assigned to interface reference
        Message msg = () -> {
            System.out.println("Hello World!");
        };
        
        Addable adds = (a, b) -> {
        	System.out.println(a + b);
        };
        // Call the method
        msg.say();
        adds.add(10, 20);
        
    }
}

