package mezoSoftProject;

import mesozoicSoftware.CDino;
import mesozoicSoftware.ADinasaur;
import mesozoicSoftware.BEmployee;
import mesozoicSoftware.CMen;
import mesozoicSoftware.HTicket;
import  java.util.Scanner;



public class AmethodTool {
	Scanner sc = new Scanner(System.in);
//                             1. 문제
	public void dinopro(){
		System.out.println("공룡이름을 입력해주세요");
		String dn = sc.next();
		
		System.out.println();
		/*
		 * for(int i = 0; 0<= park.length;i++) { System.out.println(park.length);
		 * if(dn.equals(park)) { System.out.println(park[i].getName() +
		 * park[i].getSpecies()); } }
		 */
	}
	
//	종업원프로파일 메소드
	
	public void  emplyee() {
		System.out.println("직원이름을 입력해주세요");
		String na = sc.next();
		
		CMen cm = new CMen();
		BEmployee[] men =  cm.getMen();
		for(int i = 0; 0<= men.length;i++) {
			if(na.equals(men)) {
				System.out.println(men[i].getName() + men[i].getJob());
				}
			}
		}
	
	
// 티켓 관련 메소드
	public void ticket() {
//		HTicket ticket = new HTicket(가격, 이름, 방문일자);
		HTicket ticket = new HTicket(0, null, 0);
		
		
	}
	
	
	
//	                           2. 추적시스템
//           공원 안에 있는 공룡의 위치와 상태를 감시하는 실시간 추적 시스템
	
	public void tracer() {
		
	}


		
	
}
