package pkg2;
import java.util.Scanner;

public class MethodExercise02 {
/*	우리의 공룡은 실제로 애완 동물이 아니고- 그들은 크고 
	가끔 왕성한 식욕을 가진 강한 피조물임을 기억하는 것이 
	중요하다. 공룡의 체중을 받아서 그것이 매일 필요로 하는 
	음식량을 계산하는 메서드를 작성하라.
*/
	public static void meal(int weight,int operation) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게를 적어주세요 -->");
		weight = sc.nextInt();
		
		double food = 0.1 * weight;
		System.out.println(food + " Kg의 식사를 준비해주세요");
	}
	
	public static void main(String[] args) {
		meal(0, 0);
	}

}
