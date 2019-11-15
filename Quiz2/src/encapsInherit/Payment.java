package encapsInherit;

import java.util.Scanner;

public class Payment  {	
	Scanner scan = new Scanner(System.in);
	
	public void MonthSalary(double monthlySalary, int carModel) {
		System.out.println("1. Cash or 2. Installment");
		int selected=scan.nextInt();
		
		
		if(selected==1){
			System.out.println(carModel*.15);
			
		}
		
		else if (selected==2){
			System.out.println("How many years of installment do you prefer?");
			System.out.println("1.3 Years, 2. 5 Years 3. 10 Years");
				int selectedYearsOfInstallment=scan.nextInt();
			
			if(selectedYearsOfInstallment==1){
				int carIntstallment;
				int a=carModel/36;
			System.out.println("total per Month w/o Interest: "+a);
				double Interest=a*.05;
				int totalPayperMonth= (int) (Interest+a);
			System.out.println("Interest: "+a*.05+"pesos");
			System.out.println("Monthly: "+totalPayperMonth);
				
			} 
			else if (selectedYearsOfInstallment==2){
				
			}
			else if (selectedYearsOfInstallment ==3){
				
			}
			else{
				System.out.println("Invalid input");
			}
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}
