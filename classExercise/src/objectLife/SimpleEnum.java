package objectLife;

public class SimpleEnum {

	public static void main(String[] args) {
//		Water stillwater = new Water();
//		Water stillWater = Water.EXTRA_SPARKLING;
		Water stillWater = Water.STILL;
		System.out.println(stillWater == Water.STILL);
		System.out.println(stillWater.equals(Water.STILL));
		switch(stillWater) {
		case STILL:
			System.out.println("Still water");
			break;
//		case Water.STILL:
//		case 0:
		}
//		if(Water.STILL == 0) {}
		Water sparklingWater = Water.valueOf("SPARKLING");
		System.out.println(sparklingWater);
		for(Water water : Water.values()) {
//			Ordinal value of: 0 is STILL
//			Ordinal value of: 1is SPARKLING
			System.out.println("Ordinal value of: " + water.ordinal() + " is " + water.name());
		}
	}

}
