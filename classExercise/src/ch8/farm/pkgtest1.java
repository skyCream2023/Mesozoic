package ch8.farm;

import ch8.animals.Dog;

public class pkgtest1 {

	public static void main(String[] args) {
		Dog dog = new Dog("Rex");
		Pig pig = new Pig();
		
		System.out.println(dog.getDogName());
		System.out.println(pig.testDog());
		
		//Rex
		//shed

	}

}
