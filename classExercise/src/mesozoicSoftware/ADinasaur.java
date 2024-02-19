package mesozoicSoftware;

import java.util.Arrays;



public class ADinasaur {
	private String name;
	private int age;
	private String species;
	private double weight;
	private double size;


	ADinasaur(String name, String species, int age,double weight, double size ){
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


	public static void main(String[] args) {
		


	}

}
