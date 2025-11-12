package java8;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
    	
    	Consumer<String> cons = s -> System.out.println(s);		
    	cons.accept("Roman");
    	
        Consumer<List<Integer>> liCons = li -> {
            for(Integer i : li){
                System.out.println(i + 100);
            }
        };
        
        Consumer<List<Integer>> liCons2 = li -> {
            for(Integer i : li){
                System.out.println(i);
            }
        };
        liCons2.andThen(liCons).accept(Arrays.asList(1, 2, 3, 4));
    }
}
