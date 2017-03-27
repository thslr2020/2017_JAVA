public class SavingAccount extends Account {

	private double interest;
	private double debit;
	private int time;
	private double available;
	
	SavingAccount(double balance, double interest) {  // 왜 이 식을 사용해야 하는지?
		super(balance);
		this.interest = interest;
	}
	
	@Override
	public void debit(double debit)
	{
		if(time<1)
		{
		System.out.printf("You can't withdraw your money before 1yr passed.");
		}
		else balance -= debit;
			if(balance<0)
			{
			System.out.printf("Error! You can't withdraw over your deposit!");
			}
	}
	
	public void nextMonth(String nextMonth)
	{
		if(balance>=0)
		{
		    System.out.printf( "%s balance : %.2f\n", nextMonth, balance += getBalance()*Math.pow(1+interest, passTime(time)));
		}
		else System.out.printf( "You don't have money to withdrwal");

	}
	
	
	
	public void setWithdrawableAccount(double available)
	{
	available = balance;
	}
	
	@Override
	public double getWithdrawableAccount()
	{
	return available;			
	}	
	
	public double passTime(int time)
	{
	this.time = time;
	}
	
	boolean isBankrupted = balance - debit < 0;{
		if(isBankrupted) {
			System.out.println("Account 1 is Bankrupted...");
		}
	}
	
}