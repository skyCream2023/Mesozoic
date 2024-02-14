package pkg3;
import java.util.Scanner;
public class Loopexercise0501 {

	public static void main(String[] args) {
		int totTicket = 1000;
		int soldOut = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while(totTicket >= 0 && totTicket <= 1000) {
			System.out.println("팔린 티켓 입력");
			int sold = sc.nextInt();
			int sum = 0;
			
			if(soldOut + sold >= 1000) {
				int sO = soldOut + sold;
				System.out.println("매진되었습니다.");				
			}
			else {
												
			}
		}
	}
}
