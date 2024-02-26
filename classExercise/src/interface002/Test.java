package interface002;

interface Driveable{
	public static void drive() {System.out.println("Driveable::drive");}
}

sealed class Vehicle implements Driveable permits Car{
	private int wheelMode;
	public void drive() {System.out.println("Vehicle::drive()");}
	Vehicle(int wheelmode){this.wheelMode = wheelmode;}
	public int getwheelmode() {return wheelMode;}
	public void setwheelmode(int wheelMode) {this.wheelMode = wheelMode;}
}

sealed class Car extends Vehicle permits Saloon{
	Car(int wheelmode) {super(wheelmode);}
	@Override
	public void drive() {System.out.println("car::drive()");}
}

non-sealed class Saloon extends Car {
	Saloon(int wheelmode) {super(wheelmode);}
	@Override
	public void drive() {System.out.println("Saloon::drive()");}
}

class Volvo extends Saloon{
	Volvo(int wheelmode) {super(wheelmode);}
	@Override
	public void drive() {System.out.println("Volvo::drive()");}
}

class Ford  extends Saloon{	
	Ford(int wheelmode) {super(wheelmode);}
	@Override
	public void drive() {System.out.println("Ford::drive()");}
}
	
public class Test{
	public static void main(String[] args) {
	      Vehicle[] ves = new Vehicle[5];
	      ves[0] = new Vehicle(4);
	      ves[1] = new Car(2);
	      ves[2] = new Saloon(1);
	      ves[3] = new Ford(3);
	      ves[4] = new Volvo(4);
	      
	      for(Vehicle vehicle : ves ) {
	    	  System.out.println(vehicle.getwheelmode());
	    	  vehicle.drive();
	      }
	      
	      
	      
	      
	
	
	}
}
