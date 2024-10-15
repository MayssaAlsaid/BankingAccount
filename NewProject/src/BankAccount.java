import java.util.Scanner;

class BankAccount {
	 	 
	 private	double balance ;
	 private	double previousTransaction ;
	 private	String customerName ;
	 private	String customerId ;
	 	
	 	BankAccount(String cname , String cid){
	 		customerName = cname ;
	 		customerId   = cid ;
	 		
	 	}
	 	public double getBalance() {
	        return balance;
	    }
	 	
	 	
	 	public String getcustomerName () {
	        return customerName;
	    }
	 	
	 	public String getcustomerID () {
	        return customerId;
	    }
	 	
	 	public double previousTransaction  () {
	        return previousTransaction;
	    }
	 	
	 	
	 	
	 	
	 	void deposit(double amount) {
	 		if(amount >0 ) {
	 			balance +=  amount ;
	 			previousTransaction = amount ;
	             System.out.println("Deposit successful. New balance: " + balance);

	 		}else {
	 	            System.out.println("Invalid deposit amount.");	
	 		}
	 	}
	 	
	 	void withdraw(double amount)  {
	         if (amount > 0 && amount <= balance) {
	 			balance -= amount ;
	 			previousTransaction = - amount ;
	             System.out.println("Withdrawal successful. Remaining balance: " + balance);

	         }else {
	 	            System.out.println("  invalid amount.");
	 		}
	 	}
	 	
	 	void getpreviousTransaction() {
	 		if(previousTransaction>0) {
	 			System.out.println("deposited:" + previousTransaction);
	 		}
	 		else if (previousTransaction<0) {
	 			System.out.println("withdraw:" + Math.abs(previousTransaction));
	 		}
	 		else {
	 				System.out.println("No transaction occured" );

	 			}
	 		}
	 	
	 	
	 	void showMenu() {
	 		
	           char option = '\n';
	           Scanner scanner = new Scanner(System.in);
	           
	 			System.out.println("Welcome "+ customerName );
	 			System.out.println("Your ID is "+ customerId );
	 			System.out.println("\n " );
	 			System.out.println("A. Check Balance " );
	 			System.out.println("B. Deposit" );
	 			System.out.println("C. Withdraw" );
	 			System.out.println("D. Previous transaction" );
	 			System.out.println("E. Exit" );
	   
	 			do {
	 				System.out.println("Enter an option" );
	 				option = scanner.next().charAt(0);
	 				System.out.println("\n" );

	                   switch (option) {
	                   case 'A' :
	         			System.out.println("Balance = "+ balance );
	         			System.out.println("\n" );
	                      break ;
	                      
	                   case 'B' :
	         			System.out.println("Enter an amount to deposite:" );
	         			int amount = scanner.nextInt();
	         			deposit(amount);
	         			System.out.println("\n" );
	                       break;
	                       
	                       
	                   case 'C' :
	         			System.out.println("Enter an amount to withdraw:" );
	         			int amount2 = scanner.nextInt();
	                     withdraw(amount2);
	         			System.out.println("\n" );
	                       break;
	                           
	                       
	                       
	                   case 'D':
	           			getpreviousTransaction();
	           			System.out.println("\n" );
	           			  break;
	           			  
	           			  
	           			  
	           			  
	                   case 'E':
	             			System.out.println("===========================================" );
	             			break;
	             			

	           			  
	           			  
	           			default :
	               			System.out.println("Invalid Option !! .please enter again" );
	               			 break;
	                   }
	 			}while(option != 'E');
	 			  
	   			System.out.println("Thank you for using our services" );

	 	}
	 	
	 	}
	 	
	 	
	 	
	 	
	 	
	 	
	 	



