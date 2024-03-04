package exception;



class Dinosaur {
	private String name;
	private int age;
	private String species;
	private double weight;
	private double size;


	Dinosaur(String name, String species, int age,double weight, double size ){
	    this.name = name;
	    this.species = species;
	    this.age = age;
	    this.weight = weight;
	    this.size = size;
	
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getSpecies() {
		return this.species;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getSize() {
		return this.size;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void updateDinosaurWeight(int weight, Dinosaur dino) throws IllegalArgumentException{
		if(weight < 0) {
			throw new IllegalArgumentException("Weight must br over zero!");
		} else {
			System.out.println("Weight updated successfully!");
		}
		
	}

    public void dinoHelth(String h) throws DinosaurIllException{
	    if(h.equals("이상")) { throw new DinosaurIllException("이상이 감지 되었습니다.");
	    } else if(h.equals("양호")){System.out.println("이상 없이");}
	    else if(h.equals ("건강")){System.out.println("이상 없이");}
	    else if(h.equals("비정상")) {System.out.println("정밀 검사를 진행해주세요");}
	    else {System.out.println("잘못 입력하셨습니다.");}
	    }
    
    public void Enclosure(int con ) throws EnclosureBreachException{
    	if(con == 0) {throw new EnclosureBreachException("이상이 없습니다.");}
    	else if(con == 1) {throw new EnclosureBreachException("케이지에 문제가 생겼습니다");}
    	else {System.out.println("시스템에 오류가 생겼습니다. 점검이 필요합니다.");}
    }
}  

