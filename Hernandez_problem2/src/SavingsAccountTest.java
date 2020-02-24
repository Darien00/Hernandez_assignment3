import java.util.Scanner;

public class SavingsAccountTest {

	public static void main(String[] args) {
		
		//create two objects of class savings accounts 
		//with initialized values
		SavingsAccount saver1 = new SavingsAccount(0.04,2000.00);
		SavingsAccount saver2 = new SavingsAccount(0.04,3000.00);
		
		//display header
		System.out.printf("%s %11s %16s%n","Month", "Saver1", "saver2");
		for(int month =1; month<= 12; ++month) {
			//will continue adding the interest for each call to the object class
			saver1.calculateMonthlyinterest();
			saver2.calculateMonthlyinterest();
			
			//display
			System.out.printf("%d%16.2f%16.2f%n", month ,saver1.getSavingsBalance(), saver2.getSavingsBalance());

	}
		//modifying the interest rate
		saver1.modifyInterestRate(0.05);
		saver2.modifyInterestRate(0.05);
		
		//display header
		System.out.printf("%nInterest rate increase to 5 percent");
		System.out.printf("%n%s %11s %16s%n","Month", "Saver1", "saver2");
		for(int month =1; month<= 12; ++month) {
			//will continue adding the interest for each call to the object class
			saver1.calculateMonthlyinterest();
			saver2.calculateMonthlyinterest();
					
			//display
			System.out.printf("%d%16.2f%16.2f%n", month ,saver1.getSavingsBalance(), saver2.getSavingsBalance());

			}

  }
	
}
