package exception;

class DinosaurIllException extends Exception{
	public DinosaurIllException() {super();}
	public DinosaurIllException(String message) {super(message);}
	public DinosaurIllException(Exception e) {super (e);}
}

class EnclosureBreachException extends Exception{
	public EnclosureBreachException() {super ();}
	public EnclosureBreachException(String message) {super(message);}
	public EnclosureBreachException(Exception e) {super(e);}
}



