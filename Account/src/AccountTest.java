import java.util.Scanner;

public class AccountTest {
	public static void main( String[] args){
	
	Account account1 = new Account(50);
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
}