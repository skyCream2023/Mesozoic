package ex0226;

interface Car{void travel();}

public class Vehicle implements Car{
	@Override
	public void travel() {System.out.println("Vehicle _ 입니다.");}
}
class Jeep extends Vehicle {
	@Override
	public void travel() {System.out.println("Jeep _ 입니다.");}
}
class Helcopter extends Vehicle{
	@Override
	public void travel() {System.out.println("Helcopter _ 입니다.");}
}