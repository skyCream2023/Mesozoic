package pkg2;

import java.util.Scanner;

public class MethodExercise04 {
	
	public static void ot(int now,String answer) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 적어주세요");
		now = sc.nextInt();
		
		if(9 <= now && now<= 21) {
			System.out.println("오픈시간입니다.");
		}
		else {
			System.out.println("영업시간이 아닙니다.");
		}
		
		
	}

	public static void main(String[] args) {
		ot(0, null);
	}

}
