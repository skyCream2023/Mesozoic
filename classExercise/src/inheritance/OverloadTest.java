package inheritance;

class Animal{
	public void eat() {}
}
class Cow extends Animal{
	public void eat() {}
	public void eat(String s) {}
}

public class OverloadTest {
	public void calc(int x, double y) {}
	public void calc(int x) {}
	public void calc(double y) {}
	public void calc(double y, int x) {}
//	public void calc(int a, double d) {}
//	public int calc(int a, double d) {return 1;}

	public static void main(String[] args) {
		Animal aa = new Animal();
		aa.eat();
//		aa.eat("Grass");
		Animal ac = new Cow();
		ac.eat();
//		ac.eat("Grass");
		Cow cc = new Cow();
		cc.eat();
		cc.eat("Grass");

	}

}
