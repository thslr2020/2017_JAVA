import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	public static void main(String args[]) throws Exception{
		
		/*
		 * �޼ҵ� �����ε��� ���� �׽�Ʈ �ϴ� �ڵ��Դϴ�.
		 * ������ �� �޼ҵ�� �� �ٸ� �κ��� ���� �������� ������.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		Valuable[] objectList = new Valuable[4];
		
		objectList[0] = new CheckingAccount(100,50,0.01,0.07);
		objectList[1] = new SavingAccount(100,0.05);
		objectList[2] = new Human("Mark", 20);
		objectList[3] = new Car("MyCar", 5000);
		
		for(Valuable objectItem : objectList){
			System.out.printf("%s \n", objectItem.toString());
			System.out.printf("1 month later Value (Method Overloding, no parameter) : %.2f\n", objectItem.estimateValue());
			System.out.printf("5 month later Value : %.2f\n\n", objectItem.estimateValue(5));
		}
		
		
		/*
		 * ������� �߰���� ���������� �ǽ��� ��ü������ �׽�Ʈ�մϴ�.
		 * ������ �� �޼ҵ�� �� �ٸ� �κ��� ���� �������� ������.
		 */
		
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingAccount(100,0.05);
		CheckingAccount c_account1 = (CheckingAccount)account1;
		
		int cmd;
		do{
			double balance = 0;
			cmd = scan.nextInt();
			switch(cmd){
				//CheckingAccount �׽�Ʈ 
				case 1 : 
					try{ 
						System.out.println("$100 �Ա�");
						account1.credit(100);
						System.out.printf("Account1�� �ܾ� : $%.2f\n",account1.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
						System.out.println("------------------------------------------------------");
						
						System.out.println("$150 ���");
						account1.debit(150);
						System.out.printf("Account1�� �ܾ� : $%.2f\n",account1.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
						if(c_account1.isBankrupted()==true)
							System.out.println("�Ļ�");
						System.out.println("------------------------------------------------------");
						
						account1.passTime();
						System.out.printf("1���� �� ��ġ��ȭ �� Account1�� �ܾ� : $%.2f\n",account1.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
						if(c_account1.isBankrupted()==true)
							System.out.println("�Ļ�");
						System.out.println("------------------------------------------------------");
							
					
						System.out.println("$80 ���");
						account1.debit(80);
						System.out.printf("Account1�� �ܾ� : $%.2f\n",account1.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
						if(c_account1.isBankrupted()==true)
							System.out.println("�Ļ�");
						System.out.println("------------------------------------------------------");
						
						System.out.print("5���� �� ��ġ : ");
						account1.passTime(5);
						System.out.printf("5���� �� ��ġ ��ȭ �� Account1�� �ܾ� : $%.2f\n",account1.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account1.getWithdrawableAccount());
						if(c_account1.isBankrupted()==true)
							System.out.println("�Ļ�");
						System.out.println("------------------------------------------------------");
						
						System.out.println("amount�� �����Է�");
						account1.debit(-1);
						System.out.println("------------------------------------------------------");
						
					}catch(InputMismatchException e){
						System.out.println("���ܹ߻� " + e.toString() + ": ���ڸ� �Է��ϼ���\n");
					}
					catch(Exception e){
						System.out.println("���ܹ߻�   "+e.toString());
					}
					
					break;
			
				
				//SavingsAccount �׽�Ʈ 
				case 2 : 
					try{ 
						System.out.println("$150 ���");
						account2.debit(150);
						System.out.printf("Account2�� �ܾ� : $%.2f\n",account2.getBalance());
						System.out.printf("Account2�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
						
					}catch(InputMismatchException e){
						System.out.println("���ܹ߻� " + e.toString() + ": ���ڸ� �Է��ϼ���\n");
					}
					catch(Exception e){
						System.out.println("���ܹ߻�   "+e.toString());
					}
					break;
					
				case 3 :
					try{ 
						account2.passTime();
						
						System.out.printf("1���� �� ��ġ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
						System.out.printf("Account2�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
						System.out.printf("1���� °�� ��ġ : %.2f\n",account2.estimateValue());
						System.out.println("------------------------------------------------------");
		
						account2.passTime(5);
						System.out.printf("5���� �� ��ġ ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
						System.out.printf("Account1�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
						System.out.printf("6���� °�� ��ġ : %.2f\n",account2.estimateValue(6));
						System.out.println("------------------------------------------------------");
						
						account2.passTime(5);
						System.out.printf("5���� �� ��ġ ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
						System.out.printf("Account2�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
						System.out.printf("11���� °�� ��ġ %.2f\n",account2.estimateValue(11));
						System.out.println("------------------------------------------------------");
						
						account2.passTime();
						System.out.printf("1���� �� ��ġ��ȭ �� Account2�� �ܾ� : $%.2f\n",account2.getBalance());
						System.out.printf("Account2�� ��ݰ��ɾ� : $%.2f\n",account2.getWithdrawableAccount());
	
						System.out.println("------------------------------------------------------");
						
						System.out.println("amount�� �����Է�");
						account1.debit(-1);
						System.out.println("------------------------------------------------------");
						
					}catch(InputMismatchException e){
						System.out.println("���ܹ߻� " + e.toString() + ": ���ڸ� �Է��ϼ���\n");
					}
					catch(Exception e){
						System.out.println("���ܹ߻�   "+e.toString());
					}		
					break;
					
				case 0 : System.out.println("��");
			}	
		}while(cmd!=0);		
	} 
}



















/*import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	public static void main( String[] args){
			Account account1 = new CheckingAccount(100,50,0.01,0.07);
			Account account2 = new SavingAccount(50,0.05);			
			
		try{
			Scanner scan = new Scanner(System.in);
			double amount;
			
			System.out.println("Enter deposit amount for Account 1 : ");
			amount=scan.nextDouble();
			account1.debit(amount);
			System.out.println("Account1 balance : $"+account1.getBalance());
			
			System.out.println("Enter deposit amount for Account 2 : ");
			amount=scan.nextDouble();
			account2.debit(amount);
			System.out.println("Account1 balance : $"+account1.getBalance());
		} catch(InputMismatchException ex) {
			System.out.println("���ܹ߻� : ���ڸ� �Է��ϼ���!\n" + ex.toString());
		} catch(Exception ex) {
			System.out.println("���ܹ߻�  "+ex.toString());
		} finally {
			account1.passTime(2);
			System.out.println("2 month later account1 : " + account1.getBalance());
		}
			
	}
}

//					System.out.printf("Debit amount exceeded account credit limit\n")
		
			
			
			
			
			
			
			/*CheckingAccount
			Scanner scan = new Scanner(System.in);
			double amount;
			
			System.out.printf("Account1 balance : $ %.2f \t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
			System.out.println("Enter withdrawal amount for Account 1 : ");
			amount = scan.nextDouble();
			account1.debit(amount);
			System.out.printf("Account1 balance : $ %.2f \t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
			//System.out.printf("Account1 balance : $ %.2f \t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
			account1.passTime(1);
			System.out.printf("Account1 balance : $ %.2f \t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
			//(a)
			System.out.printf("\n");
			account1.passTime(5);
			System.out.printf("Account1 balance : $ %.2f \t������ݰ��ɾ�: %.2f\n",account1.getBalance(),account1.getWithdrawableAccount());
			//(a)
			System.out.printf("\n");
			
			//SavingAccount
			System.out.println();
			System.out.printf("Account2 balance : $ %.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
			System.out.println("6 months later!");
			System.out.printf("\n");
			account2.passTime(6);
			System.out.printf("Account2 balance : $ %.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
			account2.debit(50);			
			System.out.println("Next 6 months later!");
			System.out.printf("\n");
			account2.passTime(12);
			System.out.printf("Account2 balance : $ %.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
			System.out.println("Next 1 month later!");
			System.out.printf("\n");
			account2.passTime(13);
			System.out.printf("Account2 balance : $ %.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
			account2.debit(50);
			System.out.printf("Account2 balance : $ %.2f \t������ݰ��ɾ�: %.2f\n",account2.getBalance(),account2.getWithdrawableAccount());
	}
}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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