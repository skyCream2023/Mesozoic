package pkg1;

public class DinoexercisePj04 {

	public static void main(String[] args) {
		int grade = 1;
		
		if( grade<=10 && grade>=8) {
			System.out.print("최상의 안전함 입니다.");
		}
		else if( grade<=7 && grade>=5) {
		System.out.print("안전을 위해 정비가 필요합니다.");
	}
	else if( grade<=4 && grade>=2) {
	System.out.print("위험합니다. 당장 보수가 필요합니다.");
	}
	else {System.out.print("봉쇄가 필요합니다.");}

}
}
