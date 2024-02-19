package mesozoicSoftware;

import java.util.Scanner;

public class CMen {
	private BEmployee[] Men;
	
	public BEmployee[] getMen() {
		return Men;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = false;
		BEmployee john = new BEmployee("john", 45, "Creanin", 6);
		BEmployee mark = new BEmployee("mark", 22, "Guard", 1);
		BEmployee erick = new BEmployee("erick", 22, "Guard", 1);
		BEmployee kim = new BEmployee("kim", 35, "engineer", 5);
		BEmployee hope = new BEmployee("hope", 40, "CEO", 20);
		BEmployee hof = new BEmployee("hof", 7, "moder", 2);
		
		BEmployee[] men =  new BEmployee[6];
		men[0] = john;
		men[1] = mark;
		men[2] = erick;
		men[3] = kim;
		men[4] = hope;
		men[5] = hof;
		
		System.out.println("직원의 이름을 입력해주세요");
		String d = sc.next();
		for(int i = 0; i<men.length;i++) {
			if(men[i].getName().equals(d)) {
				b = true;
				System.out.println("이  름 : " + men[i].getName() +
									"\n나  이 : " + men[i].getAge() + "세" +
									"\n직  책 : " + men[i].getJob() + 
									"\n경  력 : " + men[i].getYears() + "년 근속");	
				
			}
		}
		if(!b) {System.out.println("당사 직원이 아닙니다.");
		}
		}
	}
