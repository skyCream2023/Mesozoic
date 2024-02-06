package pkg1;

public class SWCla7 {

	public static void main(String[] args) {
		String name = "Paul";
		int nLetters;
		switch(name) {
		case "Jane", "Sean", "Alan", "Paul" -> nLetters = 4;
		case "Janet", "Susan" -> nLetters = 5;
		case "Maaike", "Alison", "Miriam" -> nLetters =6;
		default -> {
			System.out.println("Unrecognized name: " + name);
			nLetters = -1;
		}
		}
		System.out.println(nLetters);
		}
	}
