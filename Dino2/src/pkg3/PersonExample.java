package pkg3;

class Person{
	private String name;
	private int count;
	
	Person(String Name){
		name = Name;
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

	public static void main(String[] args) {
		Person p1 = new Person("Maaike");
		Person p2 = new Person("Sean");
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		p1.setName("Maaike van Puttern");
		p2.setName("Sean Kennedy");
		System.out.println(p1.getName());
		System.out.println(p2.getName());
	}

}
