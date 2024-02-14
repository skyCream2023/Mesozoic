package pkg1;

public class Array02 {

	public static void main(String[] args) {
		/*
		double[] results = {7.0, 8.6, 9.0};
		double total = 0;
		for(int i = 0 ; i < results.length; i++) {
			total += results[i];
		}
		double average = total/ results.length;
		System.out.println(average);
		*/
		int[] results = {10, 20, 30, 40, 50};
		for(int i = 0; i<results.length; i++){
		results[i] = results[i]* 2;
		}
		for( int x : results){
			System.out.println(x);
		}
		}
		
	}


