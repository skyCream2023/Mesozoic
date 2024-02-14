package pkg2;

import java.util.Scanner;

public class MethodProject {
	
	Scanner sc = new Scanner(System.in);
	String[] dinoNames = new String[10];
	int dinoCount = 0;
	
	public void like() {
		//String[] dinoname = new String[10];
		//for(int i= 0;i<dinoname.length;i++) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("추가하고 싶은 공룡의 이름을 적어주세요. \n완료되었으면 \"끝\"을 입력해주세요");
		System.out.print("추가하고 싶은 공룡의 이름을 적어주세요..");
		String dinoName = sc.next();	
		dinoNames[dinoCount++] = dinoName;	
		System.out.println(dinoName + "입력하셨습니다.");
		System.out.println();
		
		System.out.println("메뉴로 넘어가려면 \"m\"을 눌러주세요!");
		sc.next("m");
	}


	
	
	
	public void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요-->");
		String index = sc.next();
		String[] name = {"dino1", "dino2", "dino3", "dino4", "dino5", "dino6", "dino7", "dino8", "dino9", "diino10"};
		int[] age = {23, 24, 52,12,32,12,7,9,13,19};
		boolean found = false;

		
		for(int i = 0 ; i<name.length;i++) {
			if(name[i].equals(index)) {
				System.out.println("이름 : " + name[i] + "\n나이 : " +  age[i]);
				found = true;
				break;
				
			}			
			}
		if(!found) {
			System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
		}
		System.out.println();
		
		System.out.println("메뉴로 넘어가려면 \"m\"을 눌러주세요!");
		sc.next("m");
}
		
	
	
	
	
	public void time() {
		Scanner sc = new Scanner(System.in);
		System.out.println("시간을 적어주세요");
		int now = sc.nextInt();
		
		if(9 <= now && now<= 21) {
			System.out.println("오픈시간입니다.");
			System.out.println("오픈시간은 9시~21시 입니다.");
		}
		else {
			System.out.println("영업시간이 아닙니다.");
			System.out.println("오픈시간은 9시~21시 입니다.");
		}
		System.out.println();
		
		System.out.println("메뉴로 넘어가려면 \"m\"을 눌러주세요!");
		sc.next("m");
		
		
}
	
	public void insa() {
		System.out.println("안녕하세요. Mesozoic Eden Park 입니다. 환영합니다.");
		
		System.out.println();
		
		System.out.println("메뉴로 넘어가려면 \"m\"을 눌러주세요!");
		sc.next("m");
	}
	


	

	public static void main(String[] args) {
		
		MethodProject methodProject = new MethodProject();
		methodProject.start();
	}
	
	public void start() {
		while(true) {
			displayMenu();
			int choice = sc.nextInt();
			handleMenuChoice(choice);
		}
	}
	
	public void displayMenu() {
		System.out.println("Welcome to Mesozoic Eden Assistant");
        System.out.println("1. Add Dinosaur");
		System.out.println("2. Check Park Hours");
		System.out.println("3. Greet Guest");
		System.out.println("4. Check Visitors Count");
		System.out.println("5. Manage Staff");
		System.out.println("6. Exit");
		System.out.print("Enter your choice: ");
	}
		
		
	public void handleMenuChoice(int choice) {	
		//System.out.println("환영합니다. 원하시는 서비스의 번호를 입력해주세요");
		

		//System.out.println("1. 공룡추가 \n2. 공원개방시간정보 \n3. 인삿말 \n4. 공룡소개");
		//int number = sc.nextInt();
		switch(choice) {
		case 1:
			like();
			break;
		case 2:
			time();
			break;
		case 3:
			insa();
			break;
		case 4:
			add();
			break;
		case 5:
			System.out.println("Exiting...");
			System.exit(0);
			
		}


	}

}
