package pkg1;

public class SWCla8 {

	public static void main(String[] args) {
		int nLetters;
		String name = "Paul";
		nLetters = switch(name) {
		case "Jane": case "Sean": case "Alan": case "Paul":
			System.out.println("There are 4 letters in: " + name);
			yield 4;
		case "Janet": case "Susan":
			System.out.println("There are 5 letters in: " + name);
			yield 5;
		case "Maaike": case "Alison": case "Miriam":
			System.out.println("There are 6 letters in: "  + name);
			yield 6;
			default:
				System.out.println("unrecognized" +  name);
				yield -1;
		};
		System.out.println(nLetters);
		}
	}

