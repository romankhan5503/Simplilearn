package practice;

public class Arrays {

	public static void main(String_Demo1[] args) {

		int[] arr; // declare
		arr = new int[7]; // create
		int[] arr1 = new int[5]; // creation and deletion are in same

		arr[0] = 101; // Initialization

		int[] arr11 = { 101, 102, 103, 104 }; //// creation and deletion are in same initialization

		int indexpos = 2;
		int element = 100;

		// create new array of size +1
		int[] newArr = new int[arr.length + 1];

		// copy elements before position
		for (int i = 0; i < indexpos; i++) {
			newArr[i] = arr[i];
		}

		// insert new element
		newArr[indexpos] = element;

		// copy remaining elements
		for (int i = indexpos; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}

		// print new array
		for (int i : newArr) {
			System.out.print(i + " ");
		}

		System.out.println(arr11);

		int[][] arrmr = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][][] arrr = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 7, 8, 9 }, { 11, 12, 13 } },
				{ { 14, 15, 16 }, { 17, 18, 19 } } };

		System.out.println(arrmr[0][1]);
		System.out.println(arrmr[1][0]);
		System.out.println(arrmr.length);
		System.out.println(arrr.length);
		System.out.println(arrr[0][0][0]);
		System.out.println(arrr[1][0][2]);

	}
}
