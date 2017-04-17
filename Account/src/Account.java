import java.util.Scanner;

public abstract class Account implements Valuable{
	   
	double balance;
	double amount;
	double debit;

	public Account (double balance)
	{
		this.balance = balance;
	}
	
	public void credit (double amount)
	{
		balance += amount;
	}
	
	public void debit (double amount) throws Exception
	{
		if(debit>balance)
		{
		System.out.printf("Debit amount exceeded account balance");
		}
		else balance -= amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	protected void setBalance(double balance)
	{
		this.balance = balance;
	}
	   
	public void balance(String deposit)
	{
	    System.out.printf( "%s balance : $%.2f\n", deposit, getBalance());
	}
	
	public abstract double getWithdrawableAccount();

	public abstract void passTime(int time);
	
	public abstract void passTime();

	public void setBalance() {
		// TODO Auto-generated method stub
		
	}
}