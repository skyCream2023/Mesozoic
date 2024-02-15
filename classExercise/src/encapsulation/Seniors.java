package encapsulation;

import java.util.Arrays;

public class Seniors {
	private int[] ages = new int[2];
	private int num;
	

	Seniors() {
		num =2;
		ages[0] = 30;
		ages[1] = 40;


		
	}
	
	public int getNum() {return num;}
	public int[] getAges1() {
		//return ages;
	 return Arrays.copyOf(ages, num);
	}

	public static void main(String[] args) {

	}

}
