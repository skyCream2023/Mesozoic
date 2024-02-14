package pkg2;

import java.util.Scanner;

public class DowhiCla {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age --> ");
		int age = sc.nextInt();
		
		do {
			System.out.println("as you are " + age + "years of age , " + "you can purchase alcohol.");
			System.out.println("Please enter you age --> ");
			age = sc.nextInt();
					}while(age >= 18);
	}
		}
