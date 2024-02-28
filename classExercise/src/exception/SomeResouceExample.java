package exception;

class SomeResouce implements AutoCloseable{
	public void doSomeThing() {
		System.out.println("Doing something...");
	}
	@Override
	public void close() {
		System.out.println("Resource closed");
	}
}
	
public class SomeResouceExample{

	public static void main(String[] args) {
		try(SomeResouce resource = new SomeResouce()){
			resource.doSomeThing();
		}
	}

}
