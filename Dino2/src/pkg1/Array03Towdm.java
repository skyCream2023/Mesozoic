package pkg1;

public class Array03Towdm {

	public static void main(String[] args) {
		int [][]matrix = {{1,2,3,4,}, {5,6,7,8,},{9,10,11,12,}};
		for(int i = matrix.length-1; i < matrix.length; i--) {
			for(int j = matrix[i].length-1; j < matrix[i].length+1; j--) {
			System.out.print(matrix[i][j] + " ");
		}
			System.out.println();

	}

}
}
