package mesozoicSoftware;

public class EFood {
//	Triceratops / Stegosaurus / Scelidosaurus / 
//	Protoceratops / Brachiosaurus / Tyrannosaurus/ Velociraptor
	private String name;
	private double value;
	private double cost;
	
	EFood(String name, double value, double cost) {
		this.name = name;
		this.value = value;
		this.cost = cost;
	}
	
	public String getname() {
		return this.name;
	}
	public double getvalue() {
		return this.value;
	}
	public double getcost() {
		return this.cost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
