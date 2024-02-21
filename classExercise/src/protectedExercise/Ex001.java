package protectedExercise;


class  Vehicle{}

class Car extends Vehicle{
	private int numDoors;
	Car(int numDoors) {
		this.numDoors = numDoors;
	}
	public int getNumDoors() {	return numDoors;}
	public String onRoad() { return "I can move on the road";}
	
}
class Boat extends Vehicle{}

class Train extends Vehicle{}


public class Ex001 {
	
	public static void ex001 (Vehicle v) {
		System.out.println(
			switch(v) {
			   case Boat b -> "It's a Boat";
			   case Train t -> "It's a Train";
			   case Car c when c.getNumDoors() == 4 ->
			          "Saloon" + c.onRoad();
			   case Car c when c.getNumDoors() == 2 ->
			          "Convertivle: " + c.onRoad();
			   case null, default -> "Invalid type";
			}
		);
	}

	public static void main(String[] args) {
		
		ex001(new Car(2));
		ex001(new Car(4));
		ex001(new Boat());
		ex001(new Train());
		

	}

}
