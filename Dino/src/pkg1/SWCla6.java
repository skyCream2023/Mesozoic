package pkg1;

public class SWCla6 {

	public static void main(String[] args) {
		String name = "Jane";
		int nLetters;
		nLetters = switch(name) {
		case "Jane", "Sean", "Alan", "Paul" -> {
			System.out.println("There are 4 letters in: " + name);
			yield 4;
		}
		case "Janet", "Susan" -> {
			System.out.println("There are 5 letters in: " + name);
			yield 5;
		}
		case "Maaik", "Alison", "Miriam" -> {
			System.out.println("There are 6 letter in: " + name);
			yield 6;
		}
		default -> {
			System.out.println("Unrecognized name: " + name);
			yield -1;
		}
		};
		System.out.println(nLetters);
		}
	}

