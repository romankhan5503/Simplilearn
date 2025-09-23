 package string;

public class StringBuilderDemo {

	public static void main(String[] args) {
        
        //Using Java StringBuilder or StringBuffer Class
        String firstName = "Roman";
        String lastName = "Khan";
        
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Hello, ");
        stringbuilder.append(firstName);
        stringbuilder.append(" ");
        stringbuilder.append(lastName);
        String result = stringbuilder.toString();
        System.out.println(result);
    }

}

