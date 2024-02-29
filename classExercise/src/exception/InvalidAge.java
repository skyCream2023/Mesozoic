package exception;

class InvalidAgeException extends Exception {
InvalidAgeException(){
	super();
}
InvalidAgeException(String message){
	super(message);
}
InvalidAgeException(Exception e){
	super(e);
}
}

public class InvalidAge {
	private int age;
	
	InvalidAge(int age){
		this.age = age;
	}

	
	public void setAge(int age) throws InvalidAgeException{
		if(age < 0 ) throw new InvalidAgeException("message");
		else {System.out.println(age + "완료되었습니다.");}

		this.age = age;
	}

}

