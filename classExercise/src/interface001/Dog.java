package interface001;

interface I1 {
	public abstract void m1();
	void m2();
	private void m3() {};
//	protected void m4(); 프로텍트 는 사용 불가

}

interface I2 {
	public static final int VALUE1 = 1;
	int VALUE2 = 2;
}
interface Moveable{
	String HOW = "walk";
	void move();
}
public class Dog implements Moveable{
	@Override
	public void move() {
		System.out.println("DOg::move()");
	}
	public static void main(String[] args) {
		System.out.println(Moveable.HOW);
		System.out.println(HOW);
		new Dog().move();
	}
}