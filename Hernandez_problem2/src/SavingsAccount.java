
public class SavingsAccount {
	private static double annualinterestrate;
	private static double savingsBalance;
	
	
	//constructor
	public SavingsAccount(double annualinterestrate, double savingsBalance){
		this.annualinterestrate = annualinterestrate;
		this.savingsBalance = savingsBalance;
	}
	
	//adds the interest to savings balance
	public static void calculateMonthlyinterest() {
		 savingsBalance +=  (savingsBalance *annualinterestrate) /12;
	}
	
	//changes the interestrate in annualinterestrate
	public static void modifyInterestRate(double interestrate) {
		annualinterestrate = interestrate;
	}
	
	public static double getSavingsBalance() {
		return savingsBalance;
	}
}
