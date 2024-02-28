package exception;

class InvalidAgeEx extends Exception {
InvalidAgeEx(){
	super();
}
InvalidAgeEx(String message){
	super(message);
}
InvalidAgeEx(Exception e){
	super(e);
}
}

public class InvalidAge {
	private int age;
	
	InvalidAge(int age){
		this.age = age;
	}

	
	public void setAge(int age) throws InvalidAgeEx{
		if(age < 0 ) throw new InvalidAgeEx("message");
		this.age = age;
	}

}

