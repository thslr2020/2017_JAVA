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
			if(1==1)
			{
			System.out.printf("Debit amount exceeded account credit limit");
			}
			else balance -= debit;
				if(balance<0)
				{
				balance -= debit;
				System.out.println("Your balance is below to zero!");
				}
		}
		
		public void passTime(int time)
		{
			if(balance>=0)
			{
			System.out.printf( "%s balance : %.2f\n", time, balance -= getBalance() * interest);
			}
			else System.out.printf( "%s balance : %.2f\n", time, balance -= getBalance() * loan_interest);
			}
		
		public void setWithdrawableAccount(double available)
		{
		available = balance + credit_limit;
		}
		
		public double getWithdrawableAccount()
		{
		return available;			
		}	
		
		public void isBankrupted(double balance){
			boolean isBankrupted = balance - debit < 0;{
				if(isBankrupted) {
					System.out.println("Account 1 is Bankrupted...");
				}
			}
		}
}