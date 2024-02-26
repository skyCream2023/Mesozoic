package interface002;

interface Moveable{
	//default void m();
	default void move() { System.out.println("Moving");}
}

	class Cheetah implements Moveable{
		@Override
		public void move() {System.out.println("Moving very fast!");}
	}
		
		class Elephant implements Moveable{}
public class TestAnimal {

	public static void main(String[] args) {
		Moveable cheetah = new Cheetah();
		cheetah.move();
		Moveable elephant = new Elephant();
		elephant.move();
	}
}
