package arrays;

//cube[block][row][column];
public class ThreeD {

	public static void main(String[] args) {
		int arr[][][] = {{{4,5,8}, {8,6,4}}, {{5,8,0}, {2,5,1}}};
		
		System.out.println(arr[0][0][0]);

		for(int i = 0; i < arr.length; i++) {
			System.out.println("Block " + (i + 1) + ";");
			for (int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.println(arr[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("---------");
		}
	}

}
