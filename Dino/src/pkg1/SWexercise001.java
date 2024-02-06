package pkg1;

import java.util.Scanner;

public class SWexercise001 {

	public static void main(String[] args) {
/*   //문제1번
		int num = 1;
		switch(num) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
			default:
				System.out.println("잘못 된 숫자입니다.");
				*/
/*	
		char ch = 'a';
				switch(ch){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			
				System.out.println(ch + " 는 모음입니다.");
				break;
			default :
				System.out.println(ch + " 는 자음입니다.");
//------------------------------------------------------------------------------------------------				
		String se = "summer";
		switch(se) {
		case "spring ":
			System.out.println(se + "에 해당되는 달은 3, 4, 5 월 입니다.");
			break;
		case "summer":
			System.out.println(se + "\"에 해당되는 달은 6, 7 , 8, 월 입니다.");
			break;
		case "autumn":
			System.out.println(se + "에 해당되는 달은 9, 10, 11 월 입니다.");
			break;
		case "winter" :
			System.out.println(se + "에 해당되는 달은 12, 1, 2 월 입니다.");
			break;
			default:
				System.out.println("잘못된 계절입니다.");	
//---------------------------------------------------------------------------------------------------						
		int a = 2;
		int b = 4;
		String  c = "/";
		
		switch(c) {
		case "+":
			System.out.println("답 = " + (a + b) );
			break;
		case "-":
			System.out.println("답 = " + (a - b) );
			break;
		case "*":
				System.out.println("답 = " + (a * b) );
				break;
		case "/":
			System.out.println("답 = " + (a / b) );
			break;
			
		
//------------------------------------------------------------------------------------------------		
		int month = 12;
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월 은 봄 입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월 은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월 은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "월 은 겨울입니다.");
			break;
			default:
				System.out.println("잘못 입력 하셨습니다.");
//-----------------------------------------------------------------------------------------------				
			String shape = "원";
			int a = 4;
			int b = 5;
			double c = 4;
			double d = 3.14;
			
			switch(shape) {
			case "삼각형":
				System.out.println(shape + "의 넓이는 " + ((a*b)/2) + "cm 입니다.");
				break;
			case "사각형":
				System.out.println(shape + "의 넓이는 " + (a*b) + "cm 입니다.");
				break;
			case "원":
			case "동그라미":
				System.out.println(shape + "의 넓이는 " + (c*(c*d)) + "cm 입니다.");
				break;
				default:
					System.out.println("지원하지 않는 도형입니다.");
					
					*/
		Scanner sc = new Scanner(System.in);
		System.out.println("달을 입력하세요.-->");
		int month = sc.nextInt();

		
		switch(month) {
		case 2:
			System.out.println(month + "월은 28일 까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일 까지 있습니다.");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(month + "월은 31일 까지 있습니다.");
			break;
			default:
				System.out.println("잘못 입력하셨습니다.");
		
				
		}
	}

}
