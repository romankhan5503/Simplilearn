package java8;

interface Employee{
	String getName();
}



public class LENew {

	public static void main(String[] args) {
		Employee em = () -> "Software Engineer";
		System.out.println(em.getName());
		
		Employee ed = () -> "Editor";
		System.out.println(ed.getName());

	}

}
