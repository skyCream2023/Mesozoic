package pkg1;

public class DinoexercisePj06 {

	public static void main(String[] args) {
		int weight = 4000;
		
		if(weight >= 1000 && weight<2000 ) {
			System.out.println("1일 5회의 식사가 필요합니다.");
		}
		else if(weight >= 2000 && weight<=3000) {
			System.out.println("1일 3회의 식사가 필요합니다.");
		}
		else {System.out.println("1일 1회의 식사가 필요합니다.");}
		
	}

}
