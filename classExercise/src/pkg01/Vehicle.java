package pkg01;

public sealed class Vehicle permits Car{
	//public Vehicle() {}
	@Override
	public String toString() {
		return "Vhicle::toString()";
	}
}
sealed class Car extends Vehicle permits Saloon{
	@Override
	public String toString() {
		return "Car::toString()";
	}
}

/*
 * sealed class Truck extends Vehicle{ public String toString() { return
 * "Truck::toString()"; }
 */
non-sealed class Saloon extends Car{
	@Override
	public String toString() {
		return "Saloon::toString()";}
}

/*
 * class Convertible extends Car{ public String toString() { return
 * "Convertible::toString()";} }
 */
class Ford extends Saloon{
	@Override
	public String toString() {
		return "Ford::toString()";}
}
class Volvo extends Saloon{
	@Override
	public String toString() {
		return "Volvo::toString()";}
}

	
	
