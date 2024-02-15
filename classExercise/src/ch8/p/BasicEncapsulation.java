package ch8.p;

public class BasicEncapsulation {
	
	public static void main(String[] args) {
			
		Adult john = new Adult("John",20);
		System.out.println(john.getName() + "" + john.getAge());
		
		Adult mary = new Adult("Mary",17);
		System.out.println(mary.getName() + "" + mary.getAge());
		
		Adult peter = new Adult("Peter",21);
		Adult jack = new Adult("Jack",23);
		Adult hoby = new Adult("Hoby",32);
		
		Adult[] adults = new Adult[5];
		
		adults[0] = john;
		adults[1] = mary;
		adults[2] = peter;
		adults[3] = jack;
		adults[4] = hoby;
		
		
		for(int i = 0; i < adults.length; i++) {
			System.out.println(adults[i].getName() + " " 
		+ adults[i].getAge());
		}

	}

}
