package pkg2;

import java.util.Scanner;

public class MethodExercise05 {
	public static void wel(String name, String operation) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		name = sc.next();
		System.out.println("좋아하는 공룡의 이름을 입력해주세요");
		String dino = sc.next();
		
		System.out.println(name + "씨는 " + dino + "를 닮았어요" );

		
		
	}
	

	public static void main(String[] args) {
		wel(null,null);
	}

}
