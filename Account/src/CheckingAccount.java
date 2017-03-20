
public class CheckingAccount extends Account {
		
		private double credit_limit = 1000;
		private double interest = 0.01;
		private double loan_interest = 0.07;
		
		public CheckingAccount(double balance) {  // 왜 이 식을 사용해야 하는지?
			super(balance);

		}
		
		
		@Override
		public void debit(double debit)
		{
			if(debit>credit_limit)
			{
			System.out.printf("Debit amount exceeded account credit limit");
			}
			else balance -= debit;
				if(balance<0)
				{
				System.out.printf("Your balance is below to zero");
				}
		}
		
		public void nextMonth(String nextMonth)
		{
			if(balance>=0)
			{
			    System.out.printf( "%s balance : %.2f\n", nextMonth, balance += getBalance() * interest);
			}
			else System.out.printf( "%s balance : %.2f\n", nextMonth, balance += getBalance() * loan_interest);

		}
}