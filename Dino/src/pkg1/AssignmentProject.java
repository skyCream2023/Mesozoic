package pkg1;

public class AssignmentProject {
//feeding, cleaning, security, and tour guiding
	public static void main(String[] args) {
		int btime = 20;
		String mbti = "e";
		int safetyRating = 8;
		
		
		if(9 <= btime && 19 >= btime) {
			switch(mbti) {
			case "i":
				System.out.println("feeding");
				break;
			case "e":
				System.out.println("tour guiding");
				break;				
			}
		}
		else if((19 <=  btime && 24 >= btime) || (0 <= btime && btime <=  9)) {
			switch(mbti) {
			case "i":
				System.out.println("cleaning");
				break;
			case "e":
				if(safetyRating>=7 && safetyRating<=10) {
					System.out.println("security");
				}
				else if(safetyRating < 7) {
					System.out.println("cleaning");
				}
				break;
			}
				
			
		}
		
	}

}
