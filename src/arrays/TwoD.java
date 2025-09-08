package arrays;

//  You use two indices: matrix[row][column].
public class TwoD {

	public static void main(String[] args) {
		int arr[][] = {{2,7,9}, {6,8,7}, {8,7,5}};
		
//		System.out.println(arr[0][0]);
//		System.out.println(arr[1][0]);
//		System.out.println(arr[2][0]);

		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
