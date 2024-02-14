package pkg1;

public class Array0101 {

	public static void main(String[] args) {
		int index = 0;
		String[] name = {"daja", "dock", "fainal"};
		if(index >= 0 && index < name.length) {
			System.out.println("Element at index " + index + ":" + name[index]);
		} 
		else {
			System.out.println("Invalid index." + index);
		}
		
		int[] results = {10, 20, 30, 40 ,50};
		for(int i = 0; i < results.length; i++) {
			System.out.println("Element at " + i + ": " + results[i]);
		}
	}	

	}

