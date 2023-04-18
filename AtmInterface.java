/**
 * AtmInterface
 * Author : Aryan Panchal
 */
import java.util.*;

class BankAccount{
	int pin = 1234;
	float accountBalance = 5000;
	int transactions = 0;
	String transactionHistory = "";
	
	Scanner sc = new Scanner(System.in);
	
	public boolean login() {
		boolean isLogin = false;
		
	
			System.out.print("Enter PIN :");
			int userPin = sc.nextInt();
			if(pin == userPin) {
				isLogin = true;
			}
			else {
			    System.out.println("Incorrect PIN");
			    isLogin = false;
	    	}
		
		return isLogin;
	}
	
	public void transactionHistory(){
		if(transactions == 0) {
			System.out.println("No transactions.\n");
		}
		else {
			System.out.println(transactionHistory);
		}
		
	}
	
	public void withdraw() {
		System.out.println("Enter amount to withdraw:");
		float amount = sc.nextFloat();
		
		if(accountBalance >= amount) {
			if(amount <= 10000) {
				accountBalance -= amount;
				transactions++;
				String str = amount + " Rs. Withdrawed.\n";
				transactionHistory = transactionHistory.concat(str);	
				System.out.println("Withdraw Successful");
			}
			else {
				System.out.println("Limit is 10000");
			}
		}
		else {
			System.out.println("low  Balance In Your Account.");
		}	
	}
	
	public void deposit() {
		System.out.println("Enter amount to deposit:");
		float amount = sc.nextFloat();
		
		if(amount <= 10000) {
			accountBalance += amount;
			transactions++;
			String str = amount + " Rs. Deposited.\n";
			transactionHistory = transactionHistory.concat(str);
			System.out.println("Successfully Deposited.\n");
		}
		else {
			System.out.println("Limit is 10000");
		}
	}
	
	public void transfer() {
		System.out.println("Enter Account Number of Receipent : ");
		String AccNumberR = sc.next();
		
		System.out.println("Enter amount:");
		sc.nextLine();
		float amount = sc.nextFloat();
		
		if(accountBalance >= amount) {
			if(amount <= 15000) {
				System.out.println("\nAmount transfered Successfully.\n");
				accountBalance -= amount;
				transactions++;
				String str = amount + " Rs. transfered to " + AccNumberR + "\n";
				transactionHistory = transactionHistory.concat(str);		
		    }
			else {
				System.out.println("Limit is 15000");
			}
		}
		else {
			System.out.println("Insufficient Balance.");
		}
	}

	public void checkBalance() {
		System.out.println("Rs." + accountBalance);
	}
}

public class AtmInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BankAccount Ac = new BankAccount();
		System.out.println("WELCOME to CTM Branch ATM ");
		System.out.println("\nPlease Enter your Card");
		int Choice = 1 ;
		boolean isValid = Ac.login();
		if(isValid) {
			boolean flag = false;
		    while(Choice==1  ) {
				System.out.println("Enter your choice");
				System.out.println("1.Transactions History\n2.Withdraw\n3.Deposit\n4.Transfer\n5.Check Balance\n6.Exit");
				System.out.print("Enter Your Choice : ");
				int choice = sc.nextInt();
				
				switch(choice){
					case 1:
						Ac.transactionHistory();
						break;
					case 2:
						Ac.withdraw();
						break;
					case 3:
						Ac.deposit();
						break;
					case 4:
						Ac.transfer();
						break;
					case 5:
						Ac.checkBalance();
						break;
					case 6:
						Choice=0;
						System.out.println("\nThank you for visit...");
						break;
					default:
						System.out.println("Enter correct choice...");				
                    }
                    System.out.println("Do You Continue ?\n 1.Yes Enter 1\n 2.No Enter 2");
                    System.out.print("Enter Your Choice : ");
                    Choice=sc.nextInt();	
                    	
                    		
			}

		}
		
	}
}
