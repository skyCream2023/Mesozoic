package pkg3;

public class Project1 {

	public static void main(String[] args) {
		int time = 0;
		String dino1 = "T-rex";
		String dino2 = "Brachiodaurus";
		int tf = 100;
		int bf = 250;
//1-------------------------------------------------------------------------		
/*		while(time<= 23) {
			switch(time) {
			case 8:
			case 14:
			case 22:
				System.out.println(time + "시 입니다. \n T-rex 식사 시간입니다." + tr + " Kg의 식사를 제공해 주세요.);
				break;
			case 7:
			case 11:
			case 15:
			case 19:
				System.out.println(time + "시 입니다. \n Vrachiodaurus 식사시간입니다." + bf + " Kg의 식사를 제공해 주세요.);
				break;
			}
			break;
			
		}
//2--------------------------------------------------------------------------------
		
		int [] tr = {8, 14, 22};
		int [] br = {7, 11, 15, 19};
		while(time<=23) {
		if(tr[0]== time ||tr[1] == time || tr[2]== time) {
			System.out.println(time + " 시는 \n T-rex 식사시간입니다.\n" + tf + "Kg의 식사를 준비해 주세요");
		}
		if(br[0]== time ||br[1] == time || br[2]== time || br[3]== time) {
			System.out.println(time + " 시는 \n Brachiosaurus 식사시간입니다.\n" + bf + "Kg의 식사를 준비해 주세요");
		}
		time++;
		}
*/
//3-------------------------------------------------------------
		while( 0<= time && time<= 23) {
		
		if(time==8 || time == 14 || time==22) {
			System.out.println(time + "시는 " + dino1 + " 식사시간입니다. \n" + tf + " Kg의 음식을 준비해 주세요.");
			
		} else if(time==7 || time == 11 || time==15 || time==19) {
			System.out.println(time + "시는 " + dino2 + " 식사시간입니다. \n" + bf + " Kg의 음식을 준비해 주세요.");}
			time++;	
			System.out.println();
		}
		
	}
	
}
