package ex0226;


public class DinosaurTest {

	
	static Dinosaur[] dinos = new Dinosaur[4];

	public static void main(String[] args) {
			EmployeeManager em = new EmployeeManager();
					
			dinos[0] = new Dinosaur("T-rex", 10, 1, "eat");
			dinos[1] = new Dinosaur("Tricaratops", 23, 3, "move");
			dinos[2] = new Dinosaur("Vetisaurs", 43, 2, "move");
			dinos[3] = new Dinosaur("Dooly", 2, 1, "eat");
			
			
//			for(Dinosaur dino : dinos) {//배열 순서
//				System.out.println(dino.getAge() + "살" + dino.getName());
//			}
			
			bubbleSort(dinos);
			
			for(Dinosaur dino : dinos) {//나이 순서
				System.out.println(dino.getAge() + "살" + dino.getName());
			}
			
			
		
	}
	
	static void bubbleSort(Dinosaur[] array) {
	int size = array.length;
	for(int i = 0; i < size -1; i++) {
		for(int j = 0; j < size -i-1; j++) {
			if(array[j].compareTo(array[j+1]) > 0) {
				Dinosaur temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				
			
				
				
				}
			}
		}
	}
}