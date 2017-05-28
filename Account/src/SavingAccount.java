public class SavingAccount extends Account{

	private double interest;
	private int month;
	private double value;
	private double creditLimit;
	private double available;
	
	SavingAccount(double balance, double interest) {
		super(balance);
		this.interest = interest;
	}
	
	@Override
	public void debit(double debit) throws Exception
	{
		if(month<12)
		{
		throw new Exception("You can't withdraw your money before 1yr passed.");
		}
		else balance -= debit;
			if(balance<0)
			{
			System.out.printf("Error! You can't withdraw over your deposit!");
			}
	}
	
	@Override
	public double getBalance()
	{
		return balance;
	}
	
	
	@Override
	public double getWithdrawableAccount()
	{
		if(month<12){
			return 0;
		} else { return available = getBalance() + creditLimit;			
		}
	}	
	
	@Override	
	public void passTime(int month)
	{
		if(month<12)
		{
			this.balance = balance;
		} else { this.balance = balance + Math.pow(interest, month);
		}
	}
	
	public void passTime()
	{
		if(month<12)
		{
			this.balance = balance;
		} else { this.balance = balance + Math.pow(interest, month);
		}
	}
	
//	boolean isBankrupted = balance - debit < 0;{
//		if(isBankrupted) {
//			System.out.println("Account 1 is Bankrupted...");
//		}
//	}
	
	@Override
	public double estimateValue(int month) {
		return balance * Math.pow(1+interest, month);
	}
	
	@Override
	public double estimateValue() {
		month++;
		return balance * Math.pow(1+interest, month);
	}
	
	public String toString() {
		return "SavingAccount Balance : " + balance;
	}
	
}