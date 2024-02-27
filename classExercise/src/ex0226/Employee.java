package ex0226;

import java.util.*;

interface Woker{
	public void meal();
	public void rest();
	public void working();
}

public class Employee implements Woker{
	@Override
	public void meal() {
	System.out.println("식사_중입니다.");	
	}

	@Override
	public void rest() {
	System.out.println("휴식_중입니다.");
	}

	@Override
	public void working() {
	System.out.println("일하는_중입니다.");
	}	
}



class Elist{
	private String name;
	private int age;
	private String job;
	private int safeGrade;
	public Elist(String name, int age, String job, int safeGrade){
		this.name = name;
		this.age = age;
		this.job = job;
		this.safeGrade = safeGrade;}
	public String getName() {return name;}
	public int getAge() {return age;}
	public String getJob() {return job;}
	public int getsafeG() {return safeGrade;}
	
	public static Elist[] El() {
	Elist[] Els = new Elist[17];
	Els[0] = new Elist("jim", 40, "Security", 1);
	Els[1] = new Elist("chen", 30, "Security", 2);
	Els[2] = new Elist("miura", 25, "Security", 3);
	Els[3] = new Elist("catan", 21, "Security", 3);
	Els[4] = new Elist("kim", 35, "Security", 1);
	Els[5] = new Elist("lee", 19, "Security", 4);
	Els[6] = new Elist("sakamoto", 23, "Security", 3);
	Els[7] = new Elist("king", 24, "Security", 4);
	Els[8] = new Elist("martin", 32, "Security", 4);
	Els[9] = new Elist("jery", 38, "Veterinarians", 4);
	Els[10] = new Elist("park", 35, "Veterinarians", 4);
	Els[11] = new Elist("jack", 21, "Veterinarians", 4);
	Els[12] = new Elist("hanna", 38, "Veterinarians", 4);
	Els[13] = new Elist("john", 38, "Veterinarians", 4);
	Els[14] = new Elist("joke", 30, "Manager", 1);
	Els[15] = new Elist("hold", 35, "Manager", 2);
	Els[16] = new Elist("smith", 33, "Manager", 2);
	return Els;
}

class EmployeeManager{
	public EmployeeManager(){}
	Scanner sc = new Scanner(System.in);
	
	public void search() {
		System.out.println("이름을 입력하세요");
		String na = sc.next();
		Elist[] Els = Elist.El();
		for(int i = 0; i < Els.length;i++) {
			if(Els[i].getName().equals(na)) {
				System.out.println(" 이    름  : " + name +
								  "\n 나    이  : " + age + "세" +
								  "\n 직    책  : " + job +
								  "\n 안전등급  : " + safeGrade + " 등급");
				}
			}
		}
//	public void eadd{
	}
}
