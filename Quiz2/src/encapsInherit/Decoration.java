package encapsInherit;

import java.util.Scanner;

public class Decoration {
	public void dec() {
		Scanner scan = new Scanner(System.in);
		
		boolean decis =true;
	while(decis){
		
		System.out.println("What part of the car would you like to decorate?");
		System.out.println("1.Color of hood 2.Bumper 3.Mugs");
		int choice = scan.nextInt();
		
		
		
		if (choice == 1) {

			System.out.println("What color would you like");
			System.out.println("1.black, 2.white, 3.blue");
			int choices = scan.nextInt();
			System.out.println("Would you like to decorate it again?");
			System.out.println("Y/N");
			String yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				
			} 
			else {
				System.out.println("Thank You");
				decis=false;
				System.exit(0);
			}
		} 
		else if (choice == 2) {
			System.out.println("What Decals would you like to apply?");
			System.out.println("1.Desert camo 2.Thunder bolt 3. 2joints Logo ");
			int choices = scan.nextInt();
			System.out.println("Would you like to decorate again?");
			System.out.println("Y/N");
			String yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				
			} 
			else {
				System.out.println("Thank You");
				decis=false;
				System.exit(0);
			}
		} 
		else if (choice == 3) {
			System.out.println("What Style of mugs would you like?");
			System.out.println("1.Cross 2.flywire 3.stock");
			int choices = scan.nextInt();
			System.out.println("Would you like to decorate?");
			System.out.println("Y/N");
			String yn = scan.next();
			if (yn.equalsIgnoreCase("y")) {
				
			} 
			else {
				System.out.println("Thank You");
				decis=false;
				System.exit(0);
			}
		} 
		else {
			System.out.println("Invalid");
		}
	
	
	
	}
	
	
	}
}
