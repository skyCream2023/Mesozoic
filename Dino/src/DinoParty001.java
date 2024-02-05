
public class DinoParty001 {

	public static void main(String[] args) {
		//연습 1. 공룡의 평균 몸무게
				System.out.println("  건강을 위한 평균 뭄무게 ");

				int d1Weight = 300;
				int d2Weight = 465;
				int averwhight = (d1Weight+d2Weight)/2;
				System.out.println("평균 몸무게는 : " + averwhight + " Kg");
				System.out.println(" ");

				
		//연습 2. 공룡의 권장 식사량 (권장 : encouragement)
				System.out.println("   2. 권장 식사량 ");

				int a = 70;
				double b = 2.31;
				double kgaver = b/a;
				System.out.println("1Kg당" + kgaver + "Kg");
				double encouragement = kgaver*averwhight;
				System.out.println("하루 평균 권장 식사량 : " + encouragement + " Kg");
				double d1plus = (averwhight-d1Weight)*kgaver;
				double d2minor = (d2Weight-averwhight)*kgaver;
				System.out.println("dino1은 식사량을" + d1plus + "증가 시킵니다.");
				System.out.println("dino2는 식사량을" + d2minor + "증감 시킵니다.");
				System.out.println(" ");

				
		//연습 3. 윤년 확인
				System.out.println("   3. 윤년  확인");
				int tY = 2024;
				int leepY = 4;
				if(tY% leepY == 0);{
					System.out.println(tY + "년은 윤년입니다."); 
		//-----------------------------------------------------------------------------------------
				int currentYear = 2024;
				boolean oneplus = currentYear % 4 == 0 && (currentYear % 100 != 0 || currentYear % 400 == 0);
				//System.out.println(currentYear + "년 윤년 실화냐?" + oneplus);
				System.out.println("올해 " + currentYear + "은 " +(oneplus ? "윤년입니다!" : "평년입니다!"));
				System.out.println(" ");


		//연습 4. 최대 관람인원 목표치 도달 여부 (목표 : Objective 방문자 : visitor)
					System.out.println("   4. 목표치 달성 여부  ");
				int objective = 17765421;
				int visitor = 17765430;
				if(visitor>=objective) {
					System.out.println("축하합니다. 목표치를 달성하였습니다.");
					System.out.println(" ");

		//연습 5. dino1,2의 나이 비교 gap
					System.out.println("   5. 두 공룡의 나이 차이는");

				int dino1A = 35;
				int dino2A = 20;
				int gap = dino1A-dino2A;
				System.out.println("dino1 과 dini2의 나이 차이는  " + gap + "세 입니다.");
				System.out.println(" ");

		//연습6. 공원 등급의 도달치 (safely,clean,werfare,healthy)
				System.out.println("   6. 공원 등급의 도달치");
				String ca = "A";
				String cb = "B";
				String cc = "C";
				int safely = 1;
				int clean = 1;
				int werfare = 2;
				int healthy = 2;
				int sum = safely + clean + werfare + healthy;
				System.out.println("점수 : " + sum);
				
				if(sum>6) {System.out.println("등급 : " + ca + " 도달했습니다.");}
				if(sum>=5 && sum<=6) {System.out.println("등급 : " + cb + " 도달했습니다.");}
				if(sum<5) {System.out.println("등급 : " + cc + " 도달했습니다.");
		

	}

				}
				}
	}}

