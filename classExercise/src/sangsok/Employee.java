package sangsok;


public class Employee {
	private String name;
	private int age;
	private String position;
	private int grade;
	public Employee(String name, int age, String position, int grade ){
		this.name = name; this.age = age; this.position = position; this.grade = grade;}
	public String getName(){return name;}
	public int getAge() {return age;}
	public String getPosition() {return position;}
	public int getGrade() {return grade;}
	public void data(){System.out.println
		("N a m e :" + name +
		"\nA  g  e : " + age + " years" +
		"\nposition: " + position +
		"\nsafeGrade: " + grade);}
	public boolean equals(Object o) {
		return this.name == ((Employee) o).name && this.age==(((Employee) o).age)
				&& this.position == ((Employee) o).position;}}



class Security extends Employee{
	int grade;
	public Security(String name,int age, String position, int grade) {
		super(name,age,position,grade); this.grade = grade;}
	public int getGrade(){return grade;}
	public void data(){super.data();
		System.out.println("g r a d e: " + grade);}
	public boolean equals(Object o) {return 
			super.equals(o) && this.getGrade() == ((Security) o).getGrade();}}



class Veterinarians extends Employee{
	int cageNum;
	public Veterinarians(String name,int age, String position, int grade, int cageNum) {
		super(name,age,position,grade);}
	public int getCageN(){return cageNum;}
	public void data(){super.data();
		System.out.println("CageNumber: " + cageNum);}
	public boolean equals(Object o) {return 
			super.equals(o) && this.getCageN() == ((Veterinarians) o).getCageN();}}



class Manager extends Employee{
	String department;
	public Manager(String name,int age, String position,int grade, String department) {
		super(name,age,position,grade);}
	public String getDepartment(){return department;}
	public void data(){super.data();
		System.out.println("Department : " + department);}
	public boolean equals(Object o) {return 
			super.equals(o) && this.getDepartment() == ((Manager) o).getDepartment();}}



class Elist{
	public Elist(){}
	public Security[] selist() {
	Security[] selist = new Security[9];
	selist[0] = new Security("jim", 40, "Security", 1);
	selist[1] = new Security("chen", 30, "Security", 2);
	selist[2] = new Security("miura", 25, "Security", 3);
	selist[3] = new Security("catan", 21, "Security", 3);
	selist[4] = new Security("kim", 35, "Security", 1);
	selist[5] = new Security("lee", 19, "Security", 4);
	selist[6] = new Security("sakamoto", 23, "Security", 3);
	selist[7] = new Security("king", 24, "Security", 4);
	selist[8] = new Security("martin", 32, "Security", 4);
	return selist;
	}
	public Veterinarians[] veter() {
		Veterinarians[] veter = new Veterinarians[5];
		veter[0] = new Veterinarians("jery", 38, "Veterinarians", 4, 1);
		veter[1] = new Veterinarians("park", 35, "Veterinarians", 4, 1);
		veter[2] = new Veterinarians("jack", 21, "Veterinarians", 4, 2);
		veter[3] = new Veterinarians("hanna", 38, "Veterinarians", 4, 3);
		veter[4] = new Veterinarians("john", 38, "Veterinarians", 4, 3);
		return veter;
		
	}
	public Manager[] mlist() {
		Manager[] mlist = new Manager[3];
		mlist[0] = new Manager("joke", 30, "Manager", 1, "Security");
		mlist[1] = new Manager("hold", 35, "Manager", 2, "Veterinarians");
		mlist[2] = new Manager("smith", 33, "Manager", 2, "Ticket");
		return mlist;}




}