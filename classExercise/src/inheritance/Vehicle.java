package inheritance;

class Vehicle {
	public void move() {
		System.out.println("Vehicle::move");
	}
}

class Car extends Vehicle {
	@Override
	public void move() {
		System.out.println("Car::move()");
	}

	public void sheels() {
		System.out.println("Car::wheels()");
	}

}

class Boat extends Vehicle {
	@Override
	public void move() {
		System.out.println("Boat::move()");
	}
}

	class Saloon extends Car {
		@Override
		public void move() {
			System.out.println("Saloon::move()");
		}
	}

	class Convertible extends Car {
	}
	
	


