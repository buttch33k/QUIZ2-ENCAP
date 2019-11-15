package encapsInherit;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Info a = new Info();
		Payment buy = new Payment();
		Repair repair = new Repair();
		Decoration dec = new Decoration();

		int chevroletCamaro = 3298888;
		int toyotaVios = 738000;
		int mazda6 = 2559500;
		int subaruForester = 1729750;

		int monthlySalary;

		System.out.println("Input Firstname: ");
		String fName = in.nextLine();
		
		System.out.println("Input Middlename: ");
		a.setmName(in.nextLine());
		
		System.out.println("Input Lastname: ");
		a.setlName(in.nextLine());
		
		System.out.println("Input Address: ");
		a.setAddress(in.nextLine());
		
		System.out.println("Input Age: ");
		a.setAge(in.nextInt());
		
		System.out.println("Please select a brand of your car:");
		System.out.println("1.Chevrolet");
		System.out.println("2.toyota");
		System.out.println("3.Mazda");
		System.out.println("4.Sabaru");
		System.out.println("Input the brand number");
		int selectedBrand = in.nextInt();
		int selected2BuyDecorateRepair;
		int selected3decorate;
		if (selectedBrand == 1) {
			System.out.println("Would you like to 1.buy 2.decorate 3.repair?");
			selected2BuyDecorateRepair = in.nextInt();
			if (selected2BuyDecorateRepair == 1) {
				System.out.println("Please Enter your Monthly Salary");
				monthlySalary = in.nextInt();
				buy.MonthSalary(monthlySalary, chevroletCamaro);
			} 
			else if (selected2BuyDecorateRepair == 2) {
				dec.dec();
			} 
			else if (selected2BuyDecorateRepair == 3) {
				repair.Rep();

			}
		} 
		else if (selectedBrand == 2) {
			System.out.println("Would you like to 1.buy 2.decorate 3.repair?");
			selected2BuyDecorateRepair = in.nextInt();
			if (selected2BuyDecorateRepair == 1) {
				System.out.println("Please Enter your Monthly Salary");
				monthlySalary = in.nextInt();
				buy.MonthSalary(monthlySalary, toyotaVios);
			} 
			else if (selected2BuyDecorateRepair == 2) {
				dec.dec();
			} 
			else if (selected2BuyDecorateRepair == 3) {
				repair.Rep();

			}
		} 
		else if (selectedBrand == 3) {
			System.out.println("Would you like to do? 1.buy 2.decorate 3.repair?");
			selected2BuyDecorateRepair = in.nextInt();
			if (selected2BuyDecorateRepair == 1) {
				System.out.println("Please Enter your Monthly Salary");
				monthlySalary = in.nextInt();
				buy.MonthSalary(monthlySalary, mazda6);
			} 
			else if (selected2BuyDecorateRepair == 2) {
				dec.dec();
			}
			else if (selected2BuyDecorateRepair == 3) {
				repair.Rep();

			}
		} 
		else if (selectedBrand == 4) {
			System.out.println("Would you like to 1.buy 2.decorate 3.repair?");
			selected2BuyDecorateRepair = in.nextInt();
			if (selected2BuyDecorateRepair == 1) {
				System.out.println("Please Enter your Monthly Salary");
				monthlySalary = in.nextInt();
				buy.MonthSalary(monthlySalary, subaruForester);
			} 
			else if (selected2BuyDecorateRepair == 2) {
				dec.dec();
			} 
			else if (selected2BuyDecorateRepair == 3) {
				repair.Rep();

			}
		}

	}

	public static boolean Validate(String firstName) {
		return firstName.matches("[A-Z][a-z]*");
	}

}


