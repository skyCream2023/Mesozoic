package exception001;

import java.util.Arrays;



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
	

}
