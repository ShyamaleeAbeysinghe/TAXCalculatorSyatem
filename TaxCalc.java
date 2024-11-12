import java.util.*;
public class TaxCalc{
	public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	printHomepage(input);

	}
	public static void printHomepage(Scanner input){
		System.out.println("                                     __  _______  ________ ________");
		System.out.println("                                    |  \\/       \\|        |        \\");
		System.out.println("                                     \\$$|  $$$$$$| $$$$$$$$\\$$$$$$$$");
		System.out.println("                                    |  \\| $$   \\$| $$__      | $$");
		System.out.println("                                    | $$| $$     | $$  \\     | $$");
		System.out.println("                                    | $$| $$   __| $$$$$     | $$");
		System.out.println("                                    | $$| $$__/  | $$_____   | $$");
		System.out.println("                                    | $$ \\$$    $| $$     \\  | $$");
		System.out.println("                                     \\$$  \\$$$$$$ \\$$$$$$$$   \\$$");
		System.out.println("");
		System.out.println("");
		System.out.println("  _______            __    __     ______              _         ______   _     _   _                  _______    ____    _____");
		System.out.println(" |__   __|    /\\     \\ \\  / /    / _____|     /\\     | |       / _____| | |   | | | |          /\\    |__   __|  / __ \\  |  __ \\");
		System.out.println("    | |      /  \\     \\ \\/ /    | |          /  \\    | |      | |       | |   | | | |         /  \\      | |    | |  | | | |__) |");
		System.out.println("    | |     / /\\ \\     >  <     | |         / /\\ \\   | |      | |       | |   | | | |        / /\\ \\     | |    | |  | | |  _  /");
		System.out.println("    | |    / ____ \\   / /\\ \\    | |_____   / ____ \\  | |____  | |_____  | |___| | | |____   / ____ \\    | |    | |__| | | | \\ \\");
		System.out.println("    |_|   /_/    \\_\\ /_/  \\_\\    \\______| /_/    \\_\\ |______|  \\______|  \\_____/  |______| /_/    \\_\\   |_|     \\____/  |_|  \\_\\");
		System.out.println("");
		System.out.println("========================================================================================================================================");
		System.out.println("");
		System.out.println("");
		System.out.println("               [01] Withholding Tax");
		System.out.println("");
		System.out.println("               [02] Payable Tax");
		System.out.println("");
		System.out.println("               [03] Income Tax");
		System.out.println("");
		System.out.println("               [04] Social Security Contribution Levy (SSCL) Tax");
		System.out.println("");
		System.out.println("               [05] Leasing Payment");
		System.out.println("");
		System.out.println("               [06] Exit");
		System.out.println("");
		System.out.print("Entre an option to continue -> ");
		int option=input.nextInt();

		if(option==1){
			withholdingTax(input);	
		}
		else if (option==2){
			payableTax(input);		
		}
		else if (option==3){
			incomeTax(input);
		}
		else if (option==4){
			ssclTax(input);
		}
		else if (option==5){
			leasingPayment(input);
		}
		else if (option==6){
			
		}

	}


	public static void withholdingTax(Scanner input){
		System.out.println("");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                           WITHOLDING TAX                          |");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("");
		System.out.println("");
		System.out.println("     [01] Rent Tax");
		System.out.println("");
		System.out.println("     [02] Bank Interest Tax");
		System.out.println("");
		System.out.println("     [03] Devident Tax");
		System.out.println("");
		System.out.println("     [04] Exit");
		System.out.println("");
		System.out.println("");
		System.out.print("Entre an option to continue -> ");
		int option=input.nextInt();
		if(option==1){
			rentTax(input);	
		}
		else if (option==2){
			bankInterestTax(input);		
		}
		else if (option==3){
			dividentTax(input);
		}
		else if (option==4){
			
		}
	}


	public static void rentTax(Scanner input){
		System.out.println("");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                              RENT TAX                             |");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("");			
		System.out.print("Enter your rent : ");
		double rent=input.nextDouble();
		boolean valid=true;
		if(rent<0){
			System.out.println("      Invalid input...");
			valid=false;
		}else if(rent<100000){
			System.out.println("You don't have to pay Rent tax");
		}else{
			double tax=(rent*10)/100;
			System.out.println("You have to pay Rent Tax : "+tax);
		}
		
		
		if(valid==true){
			System.out.println("");	
			System.out.print("Do You want to calculate another Rent Tax(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				rentTax(input);
			}
			else{
				printHomepage(input);
			}
		}else{
			System.out.println("");	
			System.out.println("");	
			System.out.print("Do You want to enter the correct value again(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				rentTax(input);
			}
			else{
				printHomepage(input);
			}
		}

	}


	public static void bankInterestTax(Scanner input){
		System.out.println("");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                         BANK INTEREST TAX                         |");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("");			
		System.out.print("Enter your Bank Interest per year : ");
		double interest=input.nextDouble();
		boolean valid=true;
		
		if(interest<0){
			System.out.println("      Invalid input...");
			valid=false;
		}else{
			double tax=(interest*5)/100;
			System.out.println("You have to pay Bank Interest Tax : "+tax);
		}
		
		
		if(valid){
			System.out.println("");	
			System.out.print("Do You want to calculate another Bank Interest Tax(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				bankInterestTax(input);
			}
			else{
				printHomepage(input);
			}
		}else{
			System.out.println("");	
			System.out.println("");	
			System.out.print("Do You want to enter the correct value again(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				bankInterestTax(input);
			}
			else{
				printHomepage(input);
			}
		}
	}


	public static void dividentTax(Scanner input){
		System.out.println("");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                              DEVIDENT TAX                             |");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("");			
		System.out.print("Enter your total devident per year : ");
		double devident=input.nextDouble();
		boolean valid=true;
		if(devident<0){
			System.out.println("      Invalid input...");
			valid=false;
		}else if(devident<100000){
			System.out.println("You don't have to pay Devident tax");
		}else{
			double tax=(devident*14)/100;
			System.out.println("You have to pay Devident Tax : "+tax);
		}
		
		
		if(valid){
			System.out.println("");	
			System.out.print("Do You want to calculate another Devident Tax(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				dividentTax(input);
			}
			else{
				printHomepage(input);
			}
		}else{
			System.out.println("");	
			System.out.println("");	
			System.out.print("Do You want to enter the correct value again(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				dividentTax(input);
			}
			else{
				printHomepage(input);
			}
		}
	}





	public static void payableTax(Scanner input){
		System.out.println("");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                              PAYABLE TAX                             |");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("");			
		System.out.print("Enter your employee payment per month : ");
		double salary=input.nextDouble();
		boolean valid=true;
		double tax=0,difference=0;
		
		if(salary<0){
			System.out.println("      Invalid input...");
			valid=false;
		}
		if(salary>0 && salary<100000){
			System.out.println("You don't have to pay payable tax");
		}
		if(salary>100000){ //6%
			if(salary>=141667){
				difference=41667;
			}else{
				difference=salary-100000;
			}
		
			tax+=(difference*6)/100;
		}
		if(salary>141667){ //12%
			if(salary>=183333){
				difference=41667;
			}else{
				difference=salary-141667;
			}
		
			tax+=(difference*12)/100;
		}
		if(salary>183333){//18%
			if(salary>=225000){
				difference=41667;
			}else{
				difference=salary-183333;
			}
		
			tax+=(difference*18)/100;
		}
		if(salary>225000){//24
			if(salary>=266667){
				difference=41667;
			}else{
				difference=salary-225000;
			}
			tax+=(difference*24)/100;
		}
		if(salary>266667){//30
			if(salary>=308333){
				difference=41667;
			}else{
				difference=salary-266667;
			}
			tax+=(difference*30)/100;
		}
		if(salary>308333){
			difference=salary-308333;
			tax+=(difference*36)/100;
		}
		
		
		
		if(valid){
			if(tax!=0){
				System.out.println("You have to pay Payable tax per month : "+Math.round(tax));	
			}
			System.out.println("");	
			System.out.print("Do You want to calculate another Payable Tax(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				payableTax(input);
			}
			else{
				printHomepage(input);
			}
		}else{
			System.out.println("");	
			System.out.println("");	
			System.out.print("Do You want to enter the correct value again(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				payableTax(input);
			}
			else{
				printHomepage(input);
			}
		}

	}




	public static void incomeTax(Scanner input){
		System.out.println("");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                              INCOME TAX                             |");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("");			
		System.out.print("Enter your total income per year : ");
		double salary=input.nextDouble();
		boolean valid=true;
		double tax=0,difference=0;
		
		if(salary<0){
			System.out.println("      Invalid input...");
			valid=false;
		}
		if(salary>0 && salary<1200000){
			System.out.println("You don't have to pay Income tax");
		}
		if(salary>1200000){ //6%
			if(salary>=1700000){
				difference=500000;
			}else{
				difference=salary-1200000;
			}
		
			tax+=(difference*6)/100;
		}
		if(salary>1700000){ //12%
			if(salary>=2200000){
				difference=500000;
			}else{
				difference=salary-1700000;
			}
		
			tax+=(difference*12)/100;
		}
		if(salary>2200000){//18%
			if(salary>=2700000){
				difference=500000;
			}else{
				difference=salary-2200000;
			}
		
			tax+=(difference*18)/100;
		}
		if(salary>2700000){//24
			if(salary>=3200000){
				difference=500000;
			}else{
				difference=salary-2700000;
			}
			tax+=(difference*24)/100;
		}
		if(salary>3200000){//30
			if(salary>=3700000){
				difference=500000;
			}else{
				difference=salary-3200000;
			}
			tax+=(difference*30)/100;
		}
		if(salary>3700000){
			difference=salary-3700000;
			tax+=(difference*36)/100;
		}
		
		
		
		if(valid){
			if(tax!=0){
				System.out.println("You have to pay Income tax per month : "+Math.round(tax));	
			}
			System.out.println("");	
			System.out.print("Do You want to calculate another Income Tax(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				incomeTax(input);
			}
			else{
				printHomepage(input);
			}
		}else{
			System.out.println("");	
			System.out.println("");	
			System.out.print("Do You want to enter the correct value again(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				incomeTax(input);
			}
			else{
				printHomepage(input);
			}
		}
	}



	public static void ssclTax(Scanner input){

		System.out.println("");
		System.out.println("+--------------------------------------------------------------------------------------------+");
		System.out.println("|                             SOCIAL SECURITY CONTRIBUTION LEVY (SSCY) TAX                   |");
		System.out.println("+--------------------------------------------------------------------------------------------+");
		System.out.println("");			
		System.out.print(" Enter value of Good or Service  : ");
		double value=input.nextDouble();
		boolean valid=true;
		double saleTax=0,afterSaleTax=0,afterVat=0,total=0;

		saleTax=(value*2.5)/100;
		afterSaleTax=value+saleTax;
		afterVat=(afterSaleTax*15)/100;
		total=saleTax+afterVat;
		
		if(valid){
			if(value!=0){
			System.out.println("");
			System.out.println(" You have to pay SSCL tax  :"+ total);	
			}
			System.out.println("");	
			System.out.print(" Do You want to calculate another  SSCL Tax(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				ssclTax(input);
			}
			else{
				printHomepage(input);
			}
		}
		

	}


	public static void leasingPayment(Scanner input){

		System.out.println("");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("|                           Leasing Payment                         |");
		System.out.println("+-------------------------------------------------------------------+");
		System.out.println("");
		System.out.println("");
		System.out.println("     [01] Calculate Monthly Installment");
		System.out.println("");
		System.out.println("     [02] Search Leasing Category");
		System.out.println("");
		System.out.println("     [03] Find Leasing Amount");
		System.out.println("");
		System.out.println("     [04] Exit");
		System.out.println("");
		System.out.println("");
		System.out.print("Entre an option to continue -> ");
		int option=input.nextInt();
		if(option==1){
			monthlyInstallment(input);	
		}
		else if (option==2){
			LeasingCategory(input);		
		}
		else if (option==3){
			leasingAmount(input);
		}
		else if (option==4){
			
		}
	}

	public static void monthlyInstallment(Scanner input){

		System.out.println("");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                             Calculate Leasing Payment                        |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("");			
		System.out.print(" Enter lease amount  : ");
		double a=input.nextDouble();

		System.out.println("");
		System.out.print(" Enter annual interest rate  : ");
		double interestRate=input.nextDouble();
		
		
		double year=validateYear(input);


		
		double monthlyInstalment=0,n=0,i=0,x=0;
		
		
		 if(a>0 && year<=5 ){

		n=year*12;
 		
		i=(interestRate/12)/100;
		
		x=Math.pow((1+i),n);
		

		monthlyInstalment=(a*i)/(1-(1/x));

		

			System.out.println("");
			System.out.println(" Your monthly instalment : "+monthlyInstalment);
		}
		
		
		
			System.out.println("");	
			System.out.print("Do You want to calculate another monthly instalment(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				monthlyInstallment(input);
			}
			else{
				printHomepage(input);
			}
		




	}

	public static double validateYear(Scanner input){
			double year=getYear(input);	
			boolean repeat=true;
			while(repeat){
				if(year>5){
				System.out.println("");
				System.out.println("      Invalid number of year...Enter the correct value again...");
				year=getYear(input);
			
				}
				else{
				repeat=false;
				}	
			}
			return year;
				

	}
	public static double getYear(Scanner input){
			System.out.println("");
			System.out.print(" Enter number of year  : ");
			double year=input.nextDouble();

			
			return year;
				

	}

	public static void LeasingCategory(Scanner input){
		System.out.println("");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                             Search Leasing category                          |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("");			
		System.out.print(" Enter lease amount  : ");
		double a=input.nextDouble();

		System.out.println("");
		System.out.print(" Enter annual interest rate  : ");
		double interestRate=input.nextDouble();

		boolean valid=true;
		double monthlyInstalment=0,n=0,i=0,x=0,year;


		for(year=3;year<=5;year++){
			n=year*12;
 		
			i=(interestRate/12)/100;
		
			x=Math.pow((1+i),n);
		

			monthlyInstalment=(a*i)/(1-(1/x));

		

			System.out.println("");
			System.out.println(" Your monthly instalment for "+(int)year+ " year leasing plan : "+monthlyInstalment);
		}
		
		
		
		
		if(valid){
			System.out.println("");	
			System.out.print("Do You want to calculate another monthly instalment(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				LeasingCategory(input);
			}
			else{
				printHomepage(input);
			}

		}



	}

	public static void leasingAmount(Scanner input){
	
		System.out.println("");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("|                             Find Leasing Amount                              |");
		System.out.println("+------------------------------------------------------------------------------+");
		System.out.println("");			
		System.out.print(" Enter the monthly lease payment amount you can afford  : ");
		double monthlyLeasePayment=input.nextDouble();

		System.out.println("");
		System.out.print(" Enter number of year  : ");
		double year=input.nextDouble();

		System.out.println("");
		System.out.print(" Enter annual interest rate  : ");
		double interestRate=input.nextDouble();
		
		double leaseAmount=0;
		boolean valid=true;
		double n=0,i=0,x=0;
		 if(monthlyLeasePayment>0 && year<=5 ){

		n=year*12;
 		
		i=(interestRate/12)/100;
		
		x=Math.pow((1+i),n);
		

		leaseAmount=monthlyLeasePayment*(1-(1/x))/i;

		

			System.out.println("");
			System.out.println(" You can get Lease Amount : "+Math.round(leaseAmount));
		}
		
		
		if(valid){
			System.out.println("");	
			System.out.print(" Do You want to calculate another monthly instalment(Y/N)->");
			String home=input.next();
			if(home.equals("Y")){
				monthlyInstallment(input);
			}
			else{
				printHomepage(input);
			}

		}





	}






	
	
	
	
	
	
	
}