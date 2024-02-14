package pkg3;

import java.util.Scanner;

public class Loopexercise05 {

	public static void main(String[] args) {
		
		int totTicket = 1000;
		int soldOut = 0;
		int remainTicket = totTicket - soldOut;
		
		while(remainTicket > 0 ) {
			System.out.println("팔이야 할 티켓 수 = " + remainTicket);
			remainTicket--;
			
		}
		System.out.println("모든 티켓이 팔렸습니다!");
		
		/*
		Scanner sc = new Scanner(System.in);		
		for(int ticket = 100; ticket >= 0;) {
			int nt;
			int sum = 0;
			
			while( ticket >= 0) {
				System.out.print("몇장의 티켓이 팔렸나요?");
				int sale  = sc.nextInt();
				sum = ticket - sale;
				 

				
		}
			System.out.println("\n" +"잔여티켓" +  ());
			
			*/
			
	}

}
