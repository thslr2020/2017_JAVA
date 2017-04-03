import java.util.Scanner;

public class AccountTest {
	public static void main( String[] args){
			Account account1 = new CheckingAccount(100,50,0.01,0.07);
			Account account2 = new SavingAccount(100,0.05);
		
			//CheckingAccount
			Scanner scan = new Scanner(System.in);
			double amount;
			
			System.out.printf("Account1 balance : $ %.2f \t현재출금가능액: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
			System.out.println("Enter withdrawal amount for Account 1 : ");
			amount = scan.nextDouble();
			account1.debit(amount);
			System.out.printf("Account1 balance : $ %.2f \t현재출금가능액: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
			System.out.println(account1.getWithdrawableAccount());
			account1.passTime(1);
			System.out.printf("Account1 balance : $ %.2f \t현재출금가능액: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
			//(a)
			System.out.printf("\n");
			account1.passTime(5);
			System.out.printf("Account1 balance : $ %.2f \t현재출금가능액: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
			//(a)
			System.out.printf("\n");
			
			//SavingAccount
			System.out.println();
			System.out.printf("Account2 balance : $ %.2f \t현재출금가능액: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
			System.out.println("6 months later!");
			System.out.printf("\n");
//			account2.passTime(6);
			System.out.printf("Account2 balance : $ %.2f \t현재출금가능액: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
			account2.debit(50);			
			System.out.println("Next 6 months later!");
			System.out.printf("\n");
//			account2.passTime(12);
			System.out.printf("Account2 balance : $ %.2f \t현재출금가능액: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
			System.out.println("Next 1 month later!");
			System.out.printf("\n");
			account2.passTime(13);
			System.out.printf("Account2 balance : $ %.2f \t현재출금가능액: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
			account2.debit(50);
			System.out.printf("Account2 balance : $ %.2f \t현재출금가능액: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	CheckingAccount account1 = new CheckingAccount(100);
	CheckingAccount account2 = new CheckingAccount(100);
	Scanner input = new Scanner(System.in);
	      
	account1.balance("account1");
	account2.balance("account2");
	System.out.printf("\n");
	System.out.printf("Enter deposit amount for account1: ");
	double money1 = input.nextDouble();
	System.out.printf("\n");
	System.out.printf("Deposit %f from account1 balance\n", money1);
	account1.credit(money1);     

	account1.balance("account1");
	account2.balance("account2");
	System.out.printf("\n");    
	System.out.printf("Enter withdrawal amount for account2: ");
	double money2 = input.nextDouble();
	System.out.printf("\n");
	System.out.printf("substracting %.2f from account2 balance\n", money2);
	account2.debit(money2);
	System.out.printf("\n");
	account1.balance("account1");
	account2.balance("account2");
	System.out.printf("\n");
	System.out.printf("Next Month!");
	System.out.printf("\n");
	account1.nextMonth("account1");
	account2.nextMonth("account2");
	}
	
	
} */

		
	/*	Account account1 = new Account(50);
		Account account2 = new Account(0);
		Scanner input = new Scanner(System.in);
		      
		account1.balance("account1");
		account2.balance("account2");
		System.out.printf("\n");
		System.out.printf("Enter withdrawal amount for account1: ");
		double money1 = input.nextDouble();
		System.out.printf("\n");
		System.out.printf("substracting %f from account1 balance\n", money1);
		account1.debit(money1);     

		account1.balance("account1");
		account2.balance("account2");
		System.out.printf("\n");    
		System.out.printf("Enter withdrawal amount for account2: ");
		double money2 = input.nextDouble();
		System.out.printf("\n");
		System.out.printf("substracting %.2f from account2 balance\n", money2);
		account2.debit(money2);
		System.out.printf("\n");
		account1.balance("account1");
		account2.balance("account2");
		}
	}*/