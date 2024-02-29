package exception;


public class InvalidAgeTest {

	public static void main(String[] args) {
		InvalidAge invalidAge = new InvalidAge(34);
		
		try {
			invalidAge.setAge(7);
		}catch(InvalidAgeException e) {
			System.out.println("잘못입력하셨습니다.");
			
		}
	}

}
