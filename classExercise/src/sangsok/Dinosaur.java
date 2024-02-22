package sangsok;

//import java.util.Scanner;

public class Dinosaur {
	private String name;
	private String eatingHabits;
	private int lifespan;
	private int size;

	Dinosaur(String name, String eatingHabits, int lifespan, int size) {
		this.name = name;
		this.eatingHabits = eatingHabits;
		this.lifespan = lifespan;
		this.size = size;

	}

	public String getName() {
		return name;
	}

	public String getEH() {
		return eatingHabits;
	}

	public int getLifespan() {
		return lifespan;
	}

	public int getSize() {
		return size;
	}

	public void data() {
		System.out.println(
				"N a m e  : " + name + "\neatingHabits  : " + eatingHabits + "\nLifespan : " + lifespan + "years" +

						"\nS i z e  : " + size + "cm");
	}

	@Override
	public boolean equals(Object o) {
		// System.out.print("원하는 공룡 숫자를 선택하세요 --> ");
		// Scanner sc = new Scanner(System.in);
		// String n = sc.next();
		// if(name.equals(n)){
		// data();
		// }
		// else {System.out.println("다시 입력해주세요");
		return this.name == ((Dinosaur) o).name && this.eatingHabits.equals(((Dinosaur) o).eatingHabits)
				&& this.lifespan == ((Dinosaur) o).lifespan && this.size == ((Dinosaur) o).size;
	}

}

class FDinosaur extends Dinosaur {
	double wingSize;

	FDinosaur(String name, String eatingHabits, int lifespan, int size, double wingSize) {
		super(name, eatingHabits, lifespan, size);
		this.wingSize = wingSize;

	}

	public double getWingSize() {
		return wingSize;
	}

	public void data() {
		super.data();
		System.out.println("wingsize : " + wingSize + "cm");
	}

	@Override
	public boolean equals(Object o) {
		return super.equals(o) && this.getWingSize() == ((FDinosaur) o).getWingSize();
	}

	/*
	 * @Override public boolean equals(Object o) { return this.getWingSize() ==
	 * ((FDinosaur)o).getWingSize(); }
	 */
}

class ADinosaur extends Dinosaur {
	String waterType;

	public ADinosaur(String name, String eatingHabits, int lifespan, int size, String waterType) {
		super(name, eatingHabits, lifespan, size);
	}
}

class LDinosaur extends Dinosaur {
	private String lendStyle;

	LDinosaur(String name, String eatingHabits, int lifespan, int size, String lendStyle) {
		super(name, eatingHabits, lifespan, size);
	}

	public void data() {
		super.data();
		System.out.println("Lend Style: " + lendStyle + "cm");
	}
}
/*
 * 
 * class AddADino { herdivore / carnivorous / omnivore FDinosaur Pteranodon =
 * new FDinosaur("Pteranodon", "carnivorous", 30, 350, 800); FDinosaur
 * Pterodactylus = new FDinosaur("Pterodactylus", "carnivorous", 20, 60, 180);
 * FDinosaur Quetzalcoatlus = new FDinosaur("Quetzalcoatlus", "omnivore", 30,
 * 500, 150); FDinosaur Dimorphodon = new FDinosaur("Dimorphodon",
 * "carnivorous", 15, 80, 150); FDinosaur Tapejara = new FDinosaur("Tapejara",
 * "carnivorous", 15, 200, 350); FDinosaur Rhamphorhynchus = new
 * FDinosaur("Rhamphorhynchus", "carnivorous", 15, 40, 200); FDinosaur
 * Pterodaustro = new FDinosaur("Pterodaustro", "carnivorous", 15, 50, 200);
 * FDinosaur Tropeognathus = new FDinosaur("Tropeognathus", "carnivorous", 30,
 * 350, 750); FDinosaur Raelongus = new FDinosaur("Raelongus", "carnivorous",
 * 20, 150, 350); FDinosaur Irdactylus = new FDinosaur("Irdactylus",
 * "carnivorous", 15, 50, 250);
 * 
 * FDinosaur[] dinos = new FDinosaur[10];
 * 
 * public AddADino() { dinos[0] = new FDinosaur("Pteranodon", "carnivorous", 30,
 * 350, 800); dinos[1] = new FDinosaur("Pterodactylus", "carnivorous", 20, 60,
 * 180); dinos[2] = new FDinosaur("Quetzalcoatlus", "omnivore", 30, 500, 150);
 * dinos[3] = new FDinosaur("Dimorphodon", "carnivorous", 15, 80, 150); dinos[4]
 * = new FDinosaur("Tapejara", "carnivorous", 15, 200, 350); dinos[5] = new
 * FDinosaur("Rhamphorhynchus", "carnivorous", 15, 40, 200); dinos[6] = new
 * FDinosaur("Pterodaustro", "carnivorous", 15, 50, 200); dinos[7] = new
 * FDinosaur("Tropeognathus", "carnivorous", 30, 350, 750); dinos[8] = new
 * FDinosaur("Raelongus", "carnivorous", 20, 150, 350); dinos[9] = new
 * FDinosaur("Irdactylus", "carnivorous", 15, 50, 250);
 * 
 * }}
 */