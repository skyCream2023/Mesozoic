package inheritance;

import java.io.InvalidObjectException;

class Dog{
	public void walk() {System.out.println("Dog::walk");}
	
	public Dog run() {return new Dog();}
	}
	class Terrier extends Dog{
//		public String walk() {return "Walk the Dog";}
//		private void walk() {};		
//		public void walk() throws IOException{}
		public void walk(int metres) {}
		@Override public void walk() {System.out.println("Terrier::walk()");}
//		@Override public Dog run() {return new Dog();}
//		@Override public Terrier run() {return new Terrier();}
		@Override public Dog run() {return new Terrier();}
		}

public class OverideTest {
	public static void main(String[] args) {
		Dog dt = new Terrier();
		dt.walk();
		Dog d = dt.run();
		if(d instanceof Terrier) {
			System.out.println("Terrier Object!");
		}
	}
}
