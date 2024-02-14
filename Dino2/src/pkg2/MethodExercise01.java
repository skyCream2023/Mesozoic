package pkg2;

import java.util.Scanner;
public class MethodExercise01 {
	public static void ageline(int age,String operration){
		Scanner sc= new Scanner(System.in);
		System.out.println("나이를 입력하시오.--->");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.println("성체입니다.");
		}
		else if(13 <= age && age <= 19) {
			System.out.println("청소년기 입니다.");
		}
		else if(0 <= age && age <= 12) {
			System.out.println("유아기 입니다.");
		}
	}

	public static void main(String[] args) {
		/*어떤 공룡이 생애 어떤 단계에 있느냐는 그것의 행동과 
		필요로 하는 것에 심대한 영향을 미칠 수 있다. 공룡의 나이를 
		받아서 그것이 갓 부화한 것(hatchling)인지, 
		청소년기인지, 또는 성체인지를 반환하는 메서드를 작성하라.
*/
		
		ageline(0, null);
	
	}

}
