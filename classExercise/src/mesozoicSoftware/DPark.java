package mesozoicSoftware;
import java.util.Scanner;
public class DPark {
	ADinasaur[] dinasaurs;
	BEmployee[] employees;
	Scanner sc = new Scanner(System.in);
	String[] nam = new String[10];
	int dinoCount = 0;
	int empCount = 0;



	public DPark() {
		this.dinasaurs = new ADinasaur[7];
		this.employees = new BEmployee[7];
	}
	
	public void start() {
		while(true) {
		menu();
		int c = sc.nextInt();
		choice(c);
		}
		
		}
	public void menu() {
		System.out.println("1. On/Off ");
		System.out.println("2. 공룡추가 ");
		System.out.println("3. 담당공룡 ");
	}
	public void choice(int c) {
		switch(c) {
		case 1:
			onoff();
		
		}
	}

	
	public void onoff(){
			System.out.println("on/off를 적어주세요");
			String choi = sc.next();
			String on = "on";
			String off = "off";
			
			if(on.equals(choi)) {
				System.out.println("영업이 시작되었습니다.");
			}
			else if(off.equals(choi)) {
				System.out.println("영업이 종료되었습니다.");
			}
				
		}
		
		
	

	public void add(ADinasaur dina) {

			if(this.dinoCount < this.dinasaurs.length) {
			      this.dinasaurs[dinoCount++] = dina;
			}



		}
	
		
		
	public void displayDinoInfo() {
		for(int i = 0; i < this.dinasaurs.length;i++) {			
				System.out.println("이  름 : " + this.dinasaurs[i].getName() + 
									"\n나  이 : " + this.dinasaurs[i].getAge() + "살"	+
									"\n종  류 : " + this.dinasaurs[i].getSpecies() + 
									"\n몸무게 : " + this.dinasaurs[i].getWeight() + "Kg" + 
									"\n크  기 : " + this.dinasaurs[i].getSize() + "m");
		}	
		
	}

}