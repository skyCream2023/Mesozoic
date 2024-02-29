package exception001;

class DinosaurIllException extends Exception{
	public DinosaurIllException() {super();}
	public DinosaurIllException(String message) {super(message);}
	public DinosaurIllException(Exception e) {super (e);}
	
	
	}
	
class CriticalHealthException extends Exception{
	public CriticalHealthException() {super();}
	public CriticalHealthException(String message) {super(message);}
	public CriticalHealthException(Exception e) {super(e);}
    int score;
    
    
}

class Dinasaur {
	private String name;
	private int age;
	private String species;
	private double weight;
	private double size;


	Dinasaur(String name, String species, int age,double weight, double size ){
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
	
	public void updateDinosaurWeight(int weight, Dinasaur dino) throws IllegalArgumentException{
		if(weight < 0) {
			throw new IllegalArgumentException("Weight must br over zero!");
		} else {
			System.out.println("Weight updated successfully!");
		}
		
	}
	
	 public void dinoHelth(String h) throws DinosaurIllException{
	      if(h.equals("이상")) {
	    	  System.out.println("Hello!");
	    	  
	    	  throw new DinosaurIllException("이상이 감지 되었습니다.");
	      } else {
	    	  System.out.println("이상 없이");
	      }
	 }
	      
   

}
