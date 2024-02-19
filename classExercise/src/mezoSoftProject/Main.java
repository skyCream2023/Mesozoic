package mezoSoftProject;
import java.util.Scanner; 

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Main main = new Main();
		main.start();
	}
	
	public void start() {
		while(true) {
			displayMenu();
			int choice = sc.nextInt();
			handlMenuChoice(choice);
		}
	}
	public void displayMenu() {
		System.out.println("Welcome to Mesozoic Eden ParkManager!");
		System.out.println("1. Manage Dinosaurs");
		System.out.println("2. Manage Park Employees");
		System.out.println("3. Manage Tickets");
		System.out.println("4. Check Park Status");
		System.out.println("5. Handle Special Events");
		System.out.println("6. Exit");
		System.out.print("Enter your choice: ");
	}
	
	public void handlMenuChoice(int choice) {
		AmethodTool methods = new AmethodTool();
		switch (choice) {
		case 1: 
			methods.dinopro();
		break;
		case 2: 
			methods.emplyee();
		break;
		case 3:
			
		break;
		case 4:
			
		break;
		case 5:
			
		break;
		case 6:
			
		System.out.println("Exiting...");
		
	    System.exit(0);
		}
	}
}
		
	 
