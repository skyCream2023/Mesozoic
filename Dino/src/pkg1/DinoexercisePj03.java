package pkg1;

public class DinoexercisePj03 {

	public static void main(String[] args) {
		String man = "Mark";
		String name = "T-rex";
		int years = 6;
		
		if(name=="T-rex" && years>=4 ) {
			System.out.println(man + "당신은" + name + "을 사육 하기에 적합합니다.");
			System.out.println(name  +  " 사육 기준 : 4년 이상의 숙련자가 담당하기 적합합니다. 3년의 담장자 교체 주기가 적당합니다.");
		}
		else if (name=="Velocriraptor"&& years>=1) {
			System.out.println(man + "당신은" + name + "을 사육 하기에 적합합니다.");
			System.out.println(name  +  " 사육 기준 :  1년 이상의 숙련자가 담당하기 적합합니다. 4년의 담장자 교체 주기가 적당합니다.");
		}
		else {System.out.print(man + "당신은" + name + "을 사육 하기에 부적합합니다.");}
	}
}


