package objectLife;

class Dog{}
class Cat{}
public class Instanceof {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		if(dog instanceof Dog) {
			System.out.println("dog referring to a Dog dbject");
		}
		if(cat instanceof Cat) {
			System.out.println("cat referring to a Cat object");
		}
//		if(cat instanceof Dog) {
//			System.out.println("cat referring to a Dog object");
//		}

	}

}
