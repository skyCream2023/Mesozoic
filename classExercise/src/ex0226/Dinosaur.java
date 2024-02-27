package ex0226;

interface action{
	void move();
	void eat();
}

interface CarAndHer{
	void Carnivore();
	void Herbivore();
}

public class Dinosaur implements action, Comparable<Dinosaur>{
	private String acting;
	private int age;
	private String name;
	private int cage;
	
	public Dinosaur(String name, int age,  int cage, String acting){	
		this.acting = acting;
		this.age = age;
		this.name = name;
		this.cage = cage;
		}
	
	public String getActing() {return acting;}
	public String getName() {return name;}
	public int getAge() {return age;}
	public int getCage() {return cage;}
	public void move() {System.out.println("운동_하고 있어");}
	public void eat() {System.out.println("밥을_먹고 있어");}
	
	
	@Override
	public int compareTo(Dinosaur o) {
		
		if(this.getAge() < o.getAge()) {
			return -1;
		}else if(this.getAge()==o.age) {
			return 0;
		}else  {
			return 1;
			}
		}
}
	
	
class Manage implements CarAndHer{
	@Override
	public void Carnivore() {
		System.out.println("육식공룡 입니다.");
	}
	@Override
	public void Herbivore() {
		System.out.println("초식공룡 입니다.");
	}
}
		
