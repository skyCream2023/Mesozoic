package pkg1;

public class ClassDangling {

	public static void main(String[] args) {
		boolean flag=false;
		if (flag)
		System.out.println("True True");
		else
			System.out.println("True False");
		
		if (flag) {
			System.out.append("True True");
		}
		else {
			System.out.println("True True");
		}
	}

}
