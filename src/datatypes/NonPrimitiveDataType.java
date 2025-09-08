package datatypes;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		String str = new String("Hello Roman");
		System.out.println("String is: " + str);

		String str1 = "Hello Java";
		System.out.println("Another String is: " + str1);
		
		int[] arr ;
		arr = new int[3];
		arr [0] = 1;
		arr [1] = 2;
		arr [2] = 3;
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}

}
