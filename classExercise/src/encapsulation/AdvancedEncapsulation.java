package encapsulation;

public class AdvancedEncapsulation {

	public static void main(String[] args) {
		Seniors seniors = new Seniors();
		
		int num = seniors.getNum();
		System.out.println(num);
		num = -100;
		num = seniors.getNum();
		System.out.println(num);
		
		int[] copyAges = seniors.getAges1();
		System.out.println(copyAges[0] + "," + copyAges[1]);
		copyAges[0]= -9;
		copyAges[1]= -19;
		int[] copyAges2 = seniors.getAges1();
		System.out.println(copyAges2[0] + "," + copyAges2[1]);
	}

}
