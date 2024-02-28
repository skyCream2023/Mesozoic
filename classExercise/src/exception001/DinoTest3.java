package exception001;

public class DinoTest3 {

	public static void main(String[] args) {
		try {
			medical();
		}catch(Exception e) {
			System.out.println("건강검사중 오류가 발생했습니다." + e.getMessage());
		}finally{
			System.out.println("검사완료");
		}
	}
	public static void medical() throws Exception {
		if(lowWeight()) {
			throw new Exception("저체중 증상이 발견되었습니다.");
		}
		updateMedical();
	}
	public static boolean lowWeight() {
		return true;
	}
	public static void updateMedical() {
		System.out.println("건강 레코드를 업데이트 합니다.");
	}


}
