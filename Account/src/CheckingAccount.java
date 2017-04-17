public class CheckingAccount extends Account{
		
	private double creditLimit;
	private double interest;
	private double loanInterest;
	private double available = balance + creditLimit;
	private int time;
	private double month;
	private double value;

		public CheckingAccount(double balance, double creditLimit, double interest, double loanInterest) {
			super(balance);
			this.creditLimit = creditLimit;
			this.interest = interest;
			this.loanInterest = loanInterest;
		}
		
		@Override
		public void debit(double debit) throws Exception
		{
			if(debit<=0)
				throw new Exception("음수 입력!");
			
			if(debit>available) {
					throw new Exception("Debit amount exceeded account credit limit!");
				} else balance -= debit;				 
				if(available<0)
				{
					System.out.printf("Your balance is below to zero");
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
			if(isBankrupted()){
				return 0;
			} else { return available = getBalance() + creditLimit;	
			}
		}
		
		@Override
		public void passTime(int month)
		{
			if(balance>=0)
			{
			    this.balance = balance * Math.pow(1+interest,month);
			} else { this.balance = balance * Math.pow(1+loanInterest,month);
			}
		}
		
		public void passTime()
		{
			if(balance>=0)
			{
				this.balance = balance * Math.pow(1+interest,month);
			} else { this.balance = balance * Math.pow(1+loanInterest,month);
			}

		}
		
		public boolean isBankrupted()
		{
			return getBalance() + creditLimit <= 0;
		}
			
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
			return "CheckingAccount Balance : " + balance;
		}
}