
public class SavingsAccount extends Account {
	private double monthlyInterestRate;
	private double monthlyInterestPmt;
	
	public SavingsAccount(double monthlyInterestRate) {
		super();
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public void setMonthlyInterestRate(double monthlyInterestRate) {
		this.monthlyInterestRate = monthlyInterestRate;
	}

	public double getMonthlyInterestPmt() {
		return monthlyInterestPmt;
	}

	public void setMonthlyInterestPmt(double monthlyInterestPmt) {
		this.monthlyInterestPmt = monthlyInterestPmt;
	}
	
	public void applyPmtToBalance() {
		setMonthlyInterestPmt(getBalance() * monthlyInterestRate);
		setBalance(getBalance() + monthlyInterestPmt);
	}
}
