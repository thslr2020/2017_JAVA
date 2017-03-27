import java.util.Scanner;

public abstract class Account {
	   
	double balance;

	public Account (double balance)
	{
		this.balance = balance;
	}
	
	public void credit (double credit)
	{
		balance += credit;
	}
	
	public void debit (double debit)
	{
		if(debit>balance)
		{
		System.out.printf("Debit amount exceeded account balance");
		}
		else balance -= debit;
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
}