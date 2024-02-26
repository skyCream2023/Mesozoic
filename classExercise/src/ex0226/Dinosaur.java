package ex0226;

interface action{
	void move();
	void eat();
}

interface comparable{}

public class Dinosaur implements action{
	private String acting;
	public Dinosaur(String acting){	this.acting = acting;}
	public void move() {System.out.println("운동_하고 있어");}
	public void eat() {System.out.println("밥을_먹고 있어");}
}


