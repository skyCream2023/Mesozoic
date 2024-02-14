package pkg1;
import java.util.Arrays;
public class Array06system {

	public static void main(String[] args) {
		int[] results = {30, 10, 30, 20, 40, 50};
		int target = 40;
		int index = Arrays.binarySearch(results, target);
		Arrays.sort(results);
		System.out.println("index of" + target + ":" +index);
	}

}
