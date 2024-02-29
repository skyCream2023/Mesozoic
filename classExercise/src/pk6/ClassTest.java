package pk6;

class Person{
	private String name;
	private boolean sex;
	private int age;
	
	Person(String name, boolean sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getName() {return this.name;}
	public boolean getSex() {return this.sex;}
	public int getAge() {return this.age;}
}

class Student extends Person{
	private String course;
	private int st_Num;
	Student(String name, boolean sex, int age, String course, int st_Num){
		super(name, sex, age);
		this.course = course;
		this.st_Num = st_Num;
	}
	
	public String getCourse() {
		return course;
	}
	public int getSt_Num() {
		return st_Num;
	}
}

public class ClassTest {

	public static void main(String[] args) {
		Person p = new Person("jim",true,40);
		
		System.out.println(p.toString());
		
		Student s = new Student("이원재", true, 31, "java", 16);
	}

}
