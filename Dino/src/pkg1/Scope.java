package pkg1;

public class Scope {

	public static void main(String[] args) {
		int x = 1;
		x++;
		
		{
			int y = 2;
			y++;
			x++;
		}
		x++;	
	}

}
