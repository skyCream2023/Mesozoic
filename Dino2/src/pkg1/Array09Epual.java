package pkg1;
import java.util.Arrays;
public class Array09Epual {

	public static void main(String[] args) {
		int[] results1 = {10, 20, 30, 40, 50};
		int[] results2 = {10, 20, 30, 40, 50};
		boolean arraysEqual = Arrays.equals(results1,results2);
		System.out.println("Are the arrays equal?" + arraysEqual);
		
	}

}
