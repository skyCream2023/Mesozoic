package pkg1;

import java.util.Scanner;

public class DinoexercisePj01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("치아가 날카로로우면 1 / 둥글면 2 -->");
		int tooth  = sc.nextInt();
		
		if(tooth==1) {
			System.out.print("손톱이 크고 날카롭다면 1 / 작고 각반이 있다면 2-->");
			int nail = sc.nextInt();
			if(nail ==1) {
				System.out.print("두발로 뛸 수 있다면 1 / 두발로 뛸 수 없다면 2-->");
				int rum = sc.nextInt();
				if(rum==1) {System.out.println("육식 동물입니다.");}
				else {System.out.println("초식공룡 입니다.");};
			}
			else {System.out.println("초식공룡 입니다.");};

		}
				else if(tooth==2){
					System.out.print("손톱이 크고 날카롭다면 1 / 작고 각반이 있다면 2-->");
				}
				int nail = sc.nextInt();
				if(nail ==2) {
					System.out.print("두발로 뛸 수 있다면 1 / 두발로 뛸 수 없다면 2-->");
					int rum = sc.nextInt();
					if(rum==2) {System.out.println("초식공룡 입니다.");}
					else {System.out.println("육식공룡 입니다.");};
				}
				else {System.out.println("육식공룡 입니다.");};

				}

}
