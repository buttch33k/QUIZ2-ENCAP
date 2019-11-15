package encapsInherit;

import java.util.Scanner;

public class Repair {
	
	Scanner scan = new Scanner(System.in);
	
	public void Rep(){
		System.out.println("1. Full Repair 2. Individual Parts? ");
		
		int choice= scan.nextInt();
		if(choice == 1){	
		}
		else if (choice == 2){
			System.out.println("What part would you like to Repair?");
			System.out.println("1.lock 2.horn 3.brakes");
			int parts = scan.nextInt();
			
		if(parts==1){
				System.out.println("1");
			}
			else if (parts == 2){
				System.out.println("2");
			} 
			else if (parts == 3){
				System.out.println("3");
			}
			else{
				System.out.println("Invalid");
			}
		}
		else{
			System.out.println("invalid");
		}
		
		
	}
}
