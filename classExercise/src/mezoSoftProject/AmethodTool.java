package mezoSoftProject;

import mesozoicSoftware.CDino;
import mesozoicSoftware.ADinasaur;
import mesozoicSoftware.BEmployee;
import mesozoicSoftware.CMen;


public class AmethodTool {
//	공룡프로파일
	CDino dino = new CDino();	
	public void dinopro(String dn){
		ADinasaur[] park = dino.getDinoPark();
		for(int i = 0; 0<= park.length;i++) {
			if(dn.equals(park)) {
				System.out.println(park[i].getName() + park[i].getSpecies());
			}
		}
	}
	
//	종업원프로파일
	
	public void  emplyee(String na) {
		CMen cm = new CMen();
		BEmployee[] men =  cm.getMen();
		for(int i = 0; 0<= men.length;i++) {
			if(na.equals(men)) {
				System.out.println(men[i].getName() + men[i].getJob());
				}
			}
		}
	}
	
