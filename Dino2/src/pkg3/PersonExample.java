package pkg3;

class Person{
	private String name;
	private int count;
	
	Person(String aName){
		name = aName;
		count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public int getCount() {
		return count;
	}
}

public class PersonExample {
	
	int x;
	public void m() {}

	public static void main(String[] args) {
		
		PersonExample pe1 = new PersonExample();
		pe1.x = 9;
		pe1.m();
		
		//x= 9;
		//this.x = 99;
		//m()1
		//this.m();
		/*
		Person p1 = new Person("Maaike");
		Person p2 = new Person("Sean");
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		p1.setName("Maaike van Puttern");
		p2.setName("Sean Kennedy");
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		*/
	}

}
