package pkg1;

public class DinoexercisePj05 {

	public static void main(String[] args) {
		String size = "xl";
		String room;
		
		switch(size) {
		case "xs": 
		case "s":
			System.out.println("Small Herbivere Enclosue");
			break;
		case "m":
			System.out.println("Medium Herbivore Enclosure");
			break;
		case "l":
			System.out.println("Large Herbivore Emnclosure");
			break;
		case "xl":
			System.out.println("Carnivore Enclosure");
			break;
			default:
				System.out.println("소문자 입력해주세요. 혹은 잘못된 입력 입니다.");
			
		}
	}

}



//(Small Herbivore Enclosue, Medium Herbivore Enclosure, 
//Large Herbivore Emnclosure, Carnivore Enclosure)를 배정