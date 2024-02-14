package pkg1;

public class ArrayProject {

	public static void main(String[] args) {
		
		String[] name  = {"dino1", "dino2","dino3", "dino4", "dino5", "dino6", "dino7", "dino8", "dino9", "dino10"};
		int[] age = {45, 12, 14, 13, 11, 1, 21, 2, 31, 1, 4};
		String[] species = {"T-rex","tricaratops", "gorani", "tiger", "fairee", "dog", "cat", "mongky", "snack", "chip"};
		int[] weight = {4900,1233, 1234,31213,34123,2341,2343,2342,3234,4528};
		
		for(int i= 0;i<name.length;i++) {
			System.out.println("이름 : " +name[i]);
			System.out.println("나이 : "+age[i]);
			System.out.println("종류 : "+species[i]);
			System.out.println("몸무개: "+weight[i]);
			System.out.println();

		}
				
				}

	}


