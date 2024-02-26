package interface002;

interface I{
//	static void m0();
	static int m1() {return 3;}
}

public class TestStaticMethods {

	public static void main(String[] args) {
		System.out.println(m1());
		System.out.println((I.m1()));
	}
	public static int m1() {
		return 4;
	}

}
