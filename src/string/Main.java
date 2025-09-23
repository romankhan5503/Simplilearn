package string;


public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation (joining)
        String result = str1 + " " + str2;

        System.out.println(result);  // Output: Hello World
        
        System.out.println(result.length());        // 16
        System.out.println(result.toUpperCase());   // JAVA PROGRAMMING
        System.out.println(result.toLowerCase());   // java programming
        System.out.println(result.charAt(5));       // P (character at index 5)
        System.out.println(result.substring(5, 11));// Program
        System.out.println(result.contains("Java"));// true
        System.out.println(result.replace("Java", "C++")); // C++ Programming
    }
}


