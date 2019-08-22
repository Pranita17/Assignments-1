package module_5;

import java.util.Scanner;

import javax.management.modelmbean.DescriptorSupport;
import javax.security.auth.login.AccountNotFoundException;

public class Account {

	static String accountNumber;
	static int accountBalance;
	
	Account(int accountBalance, String accountNumber) {
		this.accountBalance=accountBalance;
		this.accountNumber=accountNumber;
	}
	
	
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountBalance() {
		return accountBalance;
	}


	public void deposit(int transactionAmount) {
		
		accountBalance+= transactionAmount;
		System.out.println("Your balance after the transaction is: "+accountBalance);
		
	}
	
	public void withdraw(int transactionAmount) {
		
		int oldBalance=accountBalance;
		accountBalance-=transactionAmount;
		if(accountBalance<=0){
			System.out.println("Insufficient Balance");
			System.out.println("Your balance after the transaction is: "+oldBalance);
			
		}
		else{

			System.out.println("Your balance after the transaction is: "+accountBalance);
		}
	}

	
	public static void main(String[] args) {
		
		Account q = new Account(accountBalance, accountNumber);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Account Number");
		String acNumber = sc.nextLine();
		q.setAccountNumber(acNumber);
		
		System.out.println("Enter the Account Balance");
		accountBalance = sc.nextInt();
		
		
		
		System.out.println("Enter 1 to deposit an amount, 2 to withdraw an amount");
		int choose = sc.nextInt(); 
        
        switch (choose) { 
        case 1: System.out.println("Enter the amount to deposit");
        		int deposit = sc.nextInt();
        		q.deposit(deposit);
            break; 
        case 2: System.out.println("Enter the amount to withdraw");
				int transaction = sc.nextInt();
				q.withdraw(transaction);
            break; 
        default: System.out.println("Please Enter 1 to deposit an amount, 2 to withdraw an amount"); 
            break; 
        } 
   
    } 
 
		
}


