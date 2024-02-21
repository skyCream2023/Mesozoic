package pkg01;

public class SealedClassesTest {

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Car();
		Vehicle v3 = new Saloon();
		Vehicle v4 = new Ford();
		Vehicle v5 = new Volvo();
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
	}

}
