package mesozoicSoftware;

public class BEmployee {
	
	private String name;
	private int age;
	private String jobTitle;
	private int years;
	
	BEmployee(String name, int age, String jobTitle, int years){
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.years = years;
	}
	public BEmployee() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getJob() {
		return this.jobTitle;
	}
	public int getYears() {
		return this.years;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	}


