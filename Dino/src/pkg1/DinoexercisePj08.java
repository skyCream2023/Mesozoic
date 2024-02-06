package pkg1;

public class DinoexercisePj08 {

	public static void main(String[] args) {
		int time = 18;
		String days = "sun";

		if ("mon" == days) {
			System.out.println("휴일입니다.");
		} else if("sun" == days||"tue" == days||"wed" == days||"thu" == days||"fri" == days||"sat" == days){
			if (time >= 10 && time <= 19) {
				System.out.println("영업시간입니다.");
			} else if (time > 0 && time < 10) {
				System.out.println("개장 전입니다.");
			} else if (time < 24 && time > 19) {
				System.out.println("폐장 하였습니다.");
			} else if (time > 24) {
				System.out.println("올바르지 않은 입력입니다.");
			}
			
			}
	else{
		System.out.println("올바르지 않은 입력입니다.");
	}
	}

}
