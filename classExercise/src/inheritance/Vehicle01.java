package inheritance;

class Vehicle00{
	double cost =  100.0;
	static int age =1;
	public void move() {
		System.out.println("Vehicle::move()");
	}
	public static void sm() {
			System.out.println("Vehicle::sm()");
	}
}
	class Car0 extends Vehicle00{
		double cost = 20_000.0;
		static int age =2;
		@Override public void move() {
			System.out.println("Car::move()");
		}
		public static void sm() {
			System.out.println("Car::sm()");
		}
	}

public class Vehicle01 {

	public static void main(String[] args) {
		Vehicle00 v = new Car0();
		System.out.println(v.cost);
		System.out.println(Vehicle00.age);
		Vehicle00.sm();
		v.move();
		
	}

}
