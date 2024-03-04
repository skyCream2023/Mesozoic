package exception;

public class app {

	public static void main(String[] args) {
		
		Dinosaur dino = new Dinosaur("Tirano",  "T-Rex", 6, 1000.0, 6.0);
		
		/*     프로젝트 1번
		try {
			dino.dinoHelth("비정상");
		}catch(DinosaurIllException e) {
			System.out.println(e.getMessage());
	    }finally {
	    	System.out.println("완료하였습니다.");
	    }
	    */
		
		try {
			dino.Enclosure(5);
		}catch(EnclosureBreachException e) {
			System.out.println(e.getMessage());
		}finally {System.out.println("점검이 완료 되었습니다.");
		}
	}
}
