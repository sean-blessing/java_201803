
public class AccountBalanceCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Balance Calculator App!");
		
		CheckingAccount ca = new CheckingAccount(1.0);
		ca.setBalance(1000.0);
		SavingsAccount sa = new SavingsAccount(.01);
		sa.setBalance(1000.0);
		System.out.println("Starting Balances");
		displayBalances(ca, sa);
		
		System.out.println("Enter the transactions for the month");
		
		String choice = "y";
		Console console = new Console();
		while (choice.equalsIgnoreCase("y")) {
			String transType = console.getString("Withdrawal or deposit? (w/d): ");
			String acctType = console.getString("Checking or savings? (c/s): ");
			double amount = console.getDouble("Amount?: ");
			
			//update balances
			Account a = null;
			if (acctType.equalsIgnoreCase("c"))
				a = ca;
			else
				a = sa;
			if (transType.equalsIgnoreCase("w"))
				a.withdraw(amount);
			else
				a.deposit(amount);
			
			choice = console.getString("Continue? (y/n)  ");
		}
		
		// apply interest and fees
		ca.subtractMonthlyFeeFromBalance();
		sa.applyPmtToBalance();
		
		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking fee:             "+ca.getMonthlyFee());
		System.out.println("Savings interest payment: "+sa.getMonthlyInterestPmt());
	
		System.out.println("Final Balances");
		displayBalances(ca, sa);
		System.out.println("Bye!");
	}
	
	private static void displayBalances(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking:  "+ca.getBalance());
		System.out.println("Savings:   "+sa.getBalance());
	}

}
