package pkg2;


public class MethodExercise03 {
	/* 공룡의 평균 나이를 바탕으로 우리는 미래 계획을 세운다. 
	   공룡 나이 배열을 받아서 평균 나이를 계산하는 메서드를 
	   생각해 내라.
	 */
	public static void average(int aver) {
		int[] ages = {45,84,64,51,35,24,54,15,35};
		int sum = 0;

		for(int i = 0; i < ages.length;i++) {
			sum += ages[i];			
		}
		aver = sum/ages.length;
		System.out.println("평균 나이는" + (aver +"세 입니다."));
		
	}

	public static void main(String[] args) {
		average(0);

	}

}
