package pkg3;
import java.util.Scanner;

public class Loopexercise06 {

	public static void main(String[] args) {
		
		int ag = 11;
		int bg = 4;
		int cg = 8;
		int dg = 8;
		do {
			if(10 >= ag && ag>6) {
				if(10 >= bg && bg>6) {
					if(10 >= cg && cg>6) {
						if(10 >= dg && dg>6) {
							System.out.print("적합!");
							break;
					}
						else{System.out.print("적합하지 않습니다.");}
				}
					else{System.out.print("적합하지 않습니다.");}

			}
				else{System.out.print("적합하지 않습니다.");}
			
		}						else{System.out.println("     " + "적합하지 않습니다.");}


		}
		while((ag >= 6 && bg >= 6 )&& (cg >= 6 && dg >= 6));
		System.out.println("\n 완료되었습니다.");
	}
}
//