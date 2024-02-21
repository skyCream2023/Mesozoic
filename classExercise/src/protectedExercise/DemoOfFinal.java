package protectedExercise;

//final class Earth{}
//class SubEarth{} extends Earth{}
class Pen{
	final void write() {}
//	final abstract scribble();
}
class FountainPen extends Pen{
	//@Override void write() {}
}
public class DemoOfFinal{
	final int ONE_YEAR = 1;
	void print(final String name, final int age) {
				//age = age + ONE_YEAR;
				System.out.println(name.toUpperCase()+ " 나이:" + age);
				//name = "Alexander";
				//ONE_YEAR = 2;
	}
	
	public static void main(String[] args) {
		
		DemoOfFinal df = new DemoOfFinal();
		
		df.print("smith", 23);
	}
}

