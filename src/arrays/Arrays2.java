package arrays;

public class Arrays2 {

	public static void main(String args[]) {
//		int arr[] = {10,20,30,50,60,70,80,90,101};
//		System.out.println(arr[0]);
//		System.out.println(arr[8]);
//		System.out.println(arr.length);
//		System.out.println(arr[arr.length-1]); //showing arrayIndexOutOfBondException
		
		
//		int[] arr;          //declaration
//		arr = new int[5];   //creation
		
        int[] arr = new int[5]; //declaration and creation in singleline
//		
//		//initialization
		arr[0] = 101;
		arr[1] = 101;
		arr[2] = 101;
		arr[3] = 101;
		
		//int[] arr = {101,102,103,104,105}; //declaration creation and initialization in singleline
		
		//retrieve one way
		//System.out.println(arr[0]);  
		
		//retrieve 2nd way
		for(int i=0;i<=3;i++) {
			System.out.println(arr[i]);
		}
		
		//retrieve 3rd way for-each loop
		for(int no:arr) {
			System.out.println(no);
		}
	}
}
