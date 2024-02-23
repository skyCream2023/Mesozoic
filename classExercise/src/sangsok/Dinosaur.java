package sangsok;

import java.util.Arrays;
import java.util.Scanner;

public class Dinosaur {
	private String name;
	private String eatingHabits;
	private int lifespan;
	private int size;

	Dinosaur(String name, String eatingHabits, int lifespan, int size) {
		this.name = name; this.eatingHabits = eatingHabits; this.lifespan = lifespan;
		this.size = size;}
	public String getName() {return name;}
	public String getEH() {return eatingHabits;	}
	public int getLifespan() {return lifespan;}
	public int getSize() {return size;}
	public void data() {System.out.println(
				"N a m e  : " + name + "\neatingHabits  : " + eatingHabits + 
				"\nLifespan : " + lifespan + "years" +"\nS i z e  : " + size + "cm");}
	@Override
	public boolean equals(Object o) {return 
			this.name == ((Dinosaur) o).name && this.eatingHabits.equals(((Dinosaur) o).eatingHabits)
			&& this.lifespan == ((Dinosaur) o).lifespan && this.size == ((Dinosaur) o).size;}}


class FDinosaur extends Dinosaur {
	double wingSize;
	FDinosaur(String name, String eatingHabits, int lifespan, int size, double wingSize) {
		super(name, eatingHabits, lifespan, size); this.wingSize = wingSize;}
	public double getWingSize() {return wingSize;}
	public void data() {super.data();
				System.out.println("wingsize : " + wingSize + "cm");}
	@Override
	public boolean equals(Object o) {
		return super.equals(o) && this.getWingSize() == ((FDinosaur) o).getWingSize();}}



class ADinosaur extends Dinosaur {
	String waterType;
	public ADinosaur(String name, String eatingHabits, int lifespan, int size, String waterType) {
		super(name, eatingHabits, lifespan, size); this.waterType = waterType;}
	public String getWaterType() {return waterType;}
	@Override
	public boolean equals(Object o) {
		return super.equals(o) && this.getWaterType() == ((ADinosaur) o).getWaterType();}}


class LDinosaur extends Dinosaur {
	private String lendStyle;
	LDinosaur(String name, String eatingHabits, int lifespan, int size, String lendStyle) {
		super(name, eatingHabits, lifespan, size); this.lendStyle = lendStyle;}
	public String getLendStyle(){return lendStyle;}
	public void data() {super.data();
	System.out.println("Lend Style: " + lendStyle + "cm");}
	@Override
	public boolean equals(Object o) {
		return super.equals(o) && this.getLendStyle() == ((LDinosaur) o).getLendStyle();}}



class Cage{
	int cageNum;
	int cageSize;
	int safeGrade;
	Elist el = new Elist();
	AllList l = new AllList();
	boolean b = false;
	public Cage(int cageNum, int cageSize, int safeGrade){
		this.cageNum = cageNum; this.cageSize = cageSize; this.safeGrade = safeGrade;}
	public int getCageN() {return cageNum;}
	public int getCageS() {return cageSize;}
	public int getCageG() {return safeGrade;}
	
	  public void cc() { Scanner sc = new Scanner(System.in);
	  System.out.println("1. Security" + "\n2. Veterinarians" +
	  "\n3. Manager" + "\nchoice number"); int cg = sc.nextInt();
	  if(cg == 1) { System.out.println("이름을 입력하세요"); String na = sc.next();
	  for(int i = 0; i < AllList.cn().length;i++) {
		  for(int j = 0; j < el.selist().length;j++) {
			  if(el.selist()[j].getName().equals(na)) {
				  if(AllList.cn()[i].getCageG() >= el.selist()[j].getGrade()) {
					  System.out.println(AllList.cn()[i].getCageN() + "Cage 적합합니다.");
					  b=true;
					  break;
				  }
				  if(!b) {System.out.println(AllList.cn()[i].getCageN() + "부적합");}
				  break;
			  }
		  }
		 }}}}
	 
	
	
	
class AllList{
	public AllList() {}
	public static FDinosaur[] fd() {
		FDinosaur[] fdinos = new FDinosaur[10];
		fdinos[0] = new FDinosaur("Pteranodon", "carnivorous", 30, 350, 800); 
		fdinos[1] = new FDinosaur("Pterodactylus", "carnivorous", 20, 60, 180); 
		fdinos[2] = new FDinosaur("Quetzalcoatlus", "omnivore", 30, 500, 150);	  
		fdinos[3] = new FDinosaur("Dimorphodon", "carnivorous", 15, 80, 150); 
		fdinos[4] = new FDinosaur("Tapejara", "carnivorous", 15, 200, 350); 
		fdinos[5] = new FDinosaur("Rhamphorhynchus", "carnivorous", 15, 40, 200); 
		fdinos[6] = new FDinosaur("Pterodaustro", "carnivorous", 15, 50, 200); 
		fdinos[7] = new FDinosaur("Tropeognathus", "carnivorous", 30, 350, 750);
		fdinos[8] = new FDinosaur("Raelongus", "carnivorous", 20, 150, 350); 
		fdinos[9] = new FDinosaur("Irdactylus", "carnivorous", 15, 50, 250);
		return fdinos;}
	public static ADinosaur[] ad() {
		ADinosaur[] adinos = new ADinosaur[2];
		adinos[0] = new ADinosaur("Mosasaurus", "carnivore", 30, 17, "see");
		adinos[1] = new ADinosaur("Elasmosaurus", "carnivore", 40, 12, "see");
		return adinos;}
	public static LDinosaur[] ld() {
		LDinosaur[] ldinos = new LDinosaur[5];
		ldinos[0] = new LDinosaur("T-rex", "carnivore", 30, 1300, "Jungle");
		ldinos[1] = new LDinosaur("Velociraptor", "carnivore", 20, 180, "plain");
		ldinos[2] = new LDinosaur("Triceratops", "carnivore", 20, 900, "plain");
		ldinos[3] = new LDinosaur("Allosaurus", "carnivore", 30, 1000, "wilderness");
		ldinos[4] = new LDinosaur("Ankylosaurus", "hubivore", 30, 700, "Jungle");
		return ldinos;}
	public static Cage[] cn() {
		Cage[] cages = new Cage[3];
		cages[0] = new Cage(1, 2300, 2);
		cages[1] = new Cage(2, 400, 3);
		cages[2] = new Cage(3, 1500, 2);
		return cages;}}



class Surch{
	Scanner sc = new Scanner(System.in);
	public Surch() {}
	public void fs() {
	System.out.println("1.Pteranodon\n2.Pterodactylus\n3.Quetzalcoatlus"
			+ "\n4.Dimorphodon\n5.Tapejara\n6.Rhamphorhynchus\n7.Pterodaustro"
			+ "\n8.Tropeognathus\n9.Raelongus\n10.Irdactylus");
	System.out.print("공룡의 이름을 입력하세요 --->");
	String n = sc.next();
	boolean b = false;
	for(int i = 0 ; i < AllList.fd().length; i++) {					
		if((AllList.fd()[i].getName()).equals(n)) {System.out.println(""); AllList.fd()[i].data(); b=true;}
			}if(!b) {System.out.println("올바른 입력이 아닙니다. ");}}
	public void as() {
	System.out.println("1.Mosasaurus\n2.Elasmosaurus");
	System.out.print("공룡의 이름을 입력하세요 --->");
	String n = sc.next();
	boolean b = false;
	for(int i = 0 ; i < AllList.ad().length; i++) {					
		if((AllList.ad()[i].getName()).equals(n)) {System.out.println(""); AllList.ad()[i].data(); b=true;}
			}if(!b) {System.out.println("올바른 입력이 아닙니다. ");}}
	public void ls() {
	System.out.println("1.T-rex\n2.Velociraptor\n3.Triceratops\n4.Allosaurus\n5.Ankylosaurus");
	System.out.print("공룡의 이름을 입력하세요 --->");
	String n = sc.next();
	boolean b = false;
	for(int i = 0 ; i < AllList.ld().length; i++) {					
		if((AllList.ld()[i].getName()).equals(n)) {System.out.println(""); AllList.ld()[i].data(); b=true;}
			}if(!b) {System.out.println("올바른 입력이 아닙니다. ");}}}
	