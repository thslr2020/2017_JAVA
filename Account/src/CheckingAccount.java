public class CheckingAccount extends Account {
		
	private double credit_limit;
	private double interest;
	private double loan_interest;
	private double debit;
	private int time;
	private double available;
	
		CheckingAccount(double balance, double credit_limit, double interest, double loan_interest) {
			super(balance);
			this.credit_limit = credit_limit;
			this.interest = interest;
			this.loan_interest = loan_interest;
			available = balance + credit_limit;
		}
		
		@Override
		public void debit(double debit)
		{
			if(debit>available)
			{
			System.out.printf("Debit amount exceeded account credit limit\n");
			}
			else available -= debit; balance-= debit;
				if(available<0)
				{
				System.out.printf("Your balance is below to zero");
				}
		}
		
		@Override
		public double getBalance(double balance, int time)
		{
			if(balance>=0)
			{
			    return balance * Math.pow(1+interest,time);
			}
			else return balance * Math.pow(1+interest,time);

		}
		
		public void setWithdrawableAccount(double available)
		{
		available = balance + credit_limit;
		}
		
		public double getWithdrawableAccount()
		{
		return available;			
		}	
		
		public void passTime(int time)
		{
		this.time = time;
		}
		
		public void isBankrupted(double balance){
			boolean isBankrupted = balance - debit < 0;{
				if(isBankrupted) {
					System.out.println("Account 1 is Bankrupted...");
				}
			}
		}
}