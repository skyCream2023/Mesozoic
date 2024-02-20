package inheritance;

public class VehicleTest {

	public static void main(String[] args) {
	    Vehicle v = new Car();
	    doAction(v);
	    doAction(new Boat());
	    doAction(new Saloon());
	    doAction(new Convertible());
	    
	    
	}
	 public static void doAction(Vehicle v) {

	        v.move();
 }

}
