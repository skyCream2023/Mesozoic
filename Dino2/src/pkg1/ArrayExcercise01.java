package pkg1;

import java.util.Arrays;
public class ArrayExcercise01 {

	public static void main(String[] args) {
		
//                                        연습 1
//		String[] dino = {"T-rex", "brachiosaurus", "velociraptor", "stegosaurus", "reiceratops"}; 

//                                        연습 2
//	모든 방문자에게는 그들이 좋아하는 공룡이 있다.  많은 사람에게 그것은 가장 무거운 공룡이다.  
//	공룡 무게 배열에서 이 스타의 무게를 찾는 프로그램을 만들어라. 
//	이 정보는 투어에 활용되고 교육적으로 쓰일 수 있다.
//		int[] weight = {3500,4700, 2545, 4587, 1235};
//		int max=5000;
		
/*//적용시 max = 0 으로 바꾸어줘야함.	
 * 	for(int i = 0;i < weight.length;i++) {
			if(max< weight[i]) {
				max= weight[i];
			}
		}	
		System.out.println(max);
		}
*/
		
//                                      연습 3
//	공룡의 사이즈는 아주 다양하다.  
//  그 중에서 가장 작은 것은 어린이들 가슴 속에 있다.  
//  공룡 무게 배열에서 이 가장 작은 공룡을 찾는 프로그램을 작성하라.
		
//적용시 max = 높은 숫자로 바꾸어줘야함.
/*		
	for(int i = 0;i < weight.length;i++) {
		if(max> weight[i]) {
			max= weight[i];
		}
	}	
	System.out.println(max);
	}
*/	
//                                      연습 4
//	공룡 공원을 운영하는 것은 혼자서 하는 것이 아니고, 헌신적인 직원의 팀을 요구한다. 
//	직원 이름의 배열을 만들고 이것을 향상된 for-each 문으로 출력하는 프로그램을 작성하라. 
//	이것은 직원을 효과적으로 평가하고 관리하는 것을 도와준다.
/*		
		String[] name = {"Kim", "Lee", "Jee", "Boo", "jame", "Matin"};
		for(String n : name) {
			System.out.println("이름 : " + n);
		}
		
		
*/	
//연습 5
//	우리 공룡의 복지를 보장하기 위해서 , 그들의 평균 나이를 모니터하는 것은 필수이다. 
//		이 데이터는 돌봄과 급식 프로그램에게 우리 공룡의 나이 프로파일에 더 잘 맞게 정보를 
//		제공하는 것을 도울 수 있다. 공룡 나이 배열을 사용하여 이것을 계산하는 프로그램을 작성하라.
/*		int[] year = {15, 17, 54, 67, 2};
		int young = 100;
		
		for(int i =0;i<year.length;i++) {
			if(young>year[i]) {
				young = year[i];
			}
		} System.out.println(young);

		
		
*/		
		
//연습 6
//	우리 공원은 방문객 이동과 공룡 주거 공급을 원할하게 하기 위해서 꼼꼼하게 분할되어 있다. 
//	이차원 배열을 만들어서 공원 지도를 표시하게 하라. 각 셀이 어떤 지구에 있는 우리나 시설물을 
//	지칭하는 문자열의 배열이 되도록 만들어라.
/*		String[][] map1 = {{"toilet", "office", "entrance", "wareHouse", null}, {"Trex", "bar", "tiger", "hippo", "bird"}};		
		String target = "wareHouse";		
		for(int i = 0; i < map1.length; i++) {
			for(int j =0; j < map1[i].length; j++) {
				if(map1[i][j] == target) {
					System.out.println("map1["+i+"]["+j+"]");
				}
			}
		}
		
*/		
		
		

		
//연습 7
//	공원 투어의 기쁨은 의자 배치에 매우 깊게 의존한다. 중복 루프를 사용하여 공원 투어 버스를 
//	위한 의자 차트를 이차원 배열에서 출력하라. 이것은 모든 손님이 공원에서 즐거운 여행을 
//	갖도록 하는 것을 도울 것이다.
		
		
		String[][] seat= {{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}, {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"}};
		for(int i = 0; i < seat.length;i++) {
			System.out.print("seat " + (i+1) + " ");
			for(int j = 0; j < seat[i].length;j++) {
				System.out.print(seat[i][j] +" ");
			}
			System.out.println();
		}
		
		
	
	}
}
