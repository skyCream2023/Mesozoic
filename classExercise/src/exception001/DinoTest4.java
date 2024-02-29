package exception001;

import java.io.FileReader;
import java.io.IOException;

public class DinoTest4 {

	public static void main(String[] args) {
		try {
			FileReader diet = new FileReader("DinoDiet.txt");
			int character;
			
			while((character = diet.read()) != -1) {
				System.out.print((char) character);
			}
			diet.close();
		}catch(IOException e) {e.printStackTrace();
		}

	}

}
