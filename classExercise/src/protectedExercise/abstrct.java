package protectedExercise;

abstract class Pencil{
	abstract void write();
}
//class CharcoalPensil extends Pencil{}
abstract class WaterColorPencil extends Pencil{}
class GraphitePencil extends Pencil{
	@Override
	void write() {
		System.out.println("GraphitePencil::write()");
	}
}


public class abstrct{
	public static void main(String[] args) {
		//Pencil pp = new Pencil();
		Pencil pdp = new GraphitePencil();
		pdp.write();
	}

}
