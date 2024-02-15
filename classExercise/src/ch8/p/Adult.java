package ch8.p;

public class Adult {
	private String name;
	private int age;
	Adult(String name, int age){
		if(isAgeOK(age)) {
		this.age =age;
		this.name = name;
		}
		else
		{
		   this.name = "Error";
		   this.age = -1;
		}
	}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() { return age;}
	public void setAge(int age){
		
		this.age = age;
	}
	private boolean isAgeOK(int age) {
		return(age >=18)? true : false;
    }
	
}
