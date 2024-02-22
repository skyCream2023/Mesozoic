package sangsok;

import java.util.Arrays;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);	


	public static void main(String[] args) {

		System.out.print("공룡의 이름을 입력하세요 --->");
		String n = sc.next();
		boolean b = false;
		
			FDinosaur[] dinos = new FDinosaur[10];
			 dinos[0] = new FDinosaur("Pteranodon", "carnivorous", 30, 350, 800); 
			 dinos[1] = new FDinosaur("Pterodactylus", "carnivorous", 20, 60, 180); 
			 dinos[2] = new FDinosaur("Quetzalcoatlus", "omnivore", 30, 500, 150);	  
			 dinos[3] = new FDinosaur("Dimorphodon", "carnivorous", 15, 80, 150); 
			 dinos[4] = new FDinosaur("Tapejara", "carnivorous", 15, 200, 350); 
			 dinos[5] = new FDinosaur("Rhamphorhynchus", "carnivorous", 15, 40, 200); 
			 dinos[6] = new FDinosaur("Pterodaustro", "carnivorous", 15, 50, 200); 
			 dinos[7] = new FDinosaur("Tropeognathus", "carnivorous", 30, 350, 750);
			 dinos[8] = new FDinosaur("Raelongus", "carnivorous", 20, 150, 350); 
			 dinos[9] = new FDinosaur("Irdactylus", "carnivorous", 15, 50, 250);

			 
				for(int i = 0 ; i < dinos.length; i++) {					
					if((dinos[i].getName()).equals(n)) {dinos[i].data(); b=true;}
				}if(!b) {System.out.println("올바른 입력이 아닙니다. ");}
	}
	}

		
			
		
		
	/*	
		
		FDinosaur fdino1 = new FDinosaur("Pteranodon", "carnivorous", 30, 350, 500);
		
		for(int i = 0 ; i < dinos.length; i++) {
			if (dinos[i].equals(fdino1)) {
				System.out.println("같은 공룡이 위치: " + i+ "번째에서 발견되었습니다!!");
			} else {
				System.out.println("같지 않다!!!");*/
		

	
