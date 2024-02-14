package pkg1;

import java.util.Arrays;

public class Array08 {

	public static void main(String[] args) {
		int[] result = { 10, 20, 30, 40, 50};
		int[] copiedResults = Arrays.copyOf(result,result.length);
		System.out.println(Arrays.toString(copiedResults));
	}

}
