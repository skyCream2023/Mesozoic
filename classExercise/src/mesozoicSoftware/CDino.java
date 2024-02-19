package mesozoicSoftware;

import java.util.Scanner;

public class CDino {
	private ADinasaur[] dinoPark;

	public ADinasaur[] getDinoPark() {
		return this.dinoPark;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = false;

		ADinasaur triceRatops = new ADinasaur("Triceratops", "Crocodiles", 10, 9000, 12);
		ADinasaur stegoSaurus = new ADinasaur("Stegosaurus", "black dragonfly", 15, 5000, 9);
		ADinasaur scelidoSaurus = new ADinasaur("Scelidosaurus", "a semi-together", 50, 250, 4);
		ADinasaur protoceRatops = new ADinasaur("Protoceratops", "Crocodiles", 5, 180, 1.8);
		ADinasaur brachioSaurus = new ADinasaur("Brachiosaurus", "black dragonfly", 7, 29000, 28);
		ADinasaur tyrannoSaurus = new ADinasaur("Tyrannosaurus", "water paraphernalia", 8, 9, 13);
		ADinasaur velociRaptor = new ADinasaur("Velociraptor", "water paraphernalia", 25, 15, 2);

		DPark park = new DPark();

		park.add(triceRatops);
		park.add(stegoSaurus);
		park.add(scelidoSaurus);
		park.add(protoceRatops);
		park.add(brachioSaurus);
		park.add(tyrannoSaurus);
		park.add(velociRaptor);

		
		 private  ADinasaur[] dino = new ADinasaur[7]; 
		  dino[0] = triceRatops; 
		  dino[1] = stegoSaurus; 
		  dino[2] = scelidoSaurus; 
		  dino[3] = protoceRatops; 
		  dino[4] = brachioSaurus; 
		  dino[5] = tyrannoSaurus; 
		  dino[6] = velociRaptor;
		  
		  		  
		  public ADinasaur[] Dino() {
			  return dino();
		  }
		 
		  
		
		// System.out.println("정보를 원하는 공룡의 이름을 입력해주세요");
		// String d = sc.next();

		// if(!b) {
		// System.out.println("잘못 입력하셨습니다.");
		// }

		park.displayDinoInfo();
	}
}
