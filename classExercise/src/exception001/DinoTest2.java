package exception001;

public class DinoTest2 {

	public static void main(String[] args) {
		
		try {
			Dinasaur dina1 = new Dinasaur("Tirano", "T-Rex", 7, 1000, 5);
			
			dina1.updateDinosaurWeight(-30, dina1);
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		Dinasaur dina2 = new Dinasaur("Tirano", "T-Rex", 7, 1000, 5);
		
		dina2.updateDinosaurWeight(30, dina2);
		
		try {
			dina2.dinoHelth("이상");
		}catch(DinosaurIllException e) {
			e.getMessage();
	    }finally {
	    	System.out.println("완료하였습니다.");
	    }
		
		

	}

}
