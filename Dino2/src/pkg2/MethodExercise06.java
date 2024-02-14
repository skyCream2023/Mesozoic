package pkg2;

import java.util.Scanner;

public class MethodExercise06 {
	
	public static void safe() {
		int war = 10;
		Scanner sc = new Scanner(System.in);

		int sum =0;
		int count;
		
		while (sum<= war){
			System.out.println("입장인원을 입력해주세요");
			count = sc.nextInt();
			
			if(sum + count <= war) {
				sum += count;
			}
			else {
				System.out.println("정원("+ sum + ")이 초과 되었습니다. 입장이 불가합니다.");
			}

		}
		
	}

	public static void main(String[] args) {
		safe();
	}

}
