package Assessment;
import java.util.Scanner;
import java.util.ArrayList;

public class SBI_bank {  
    public static void main(String arg[]) {  
       Scanner sc = new Scanner(System.in); 
        String name,acc_type;
        int acc_no,amt;
        long balance ,accno;
        ArrayList<Bank_details> list = new ArrayList<>();
        list.add(new Bank_details("Mysha",12345,"Savings",1000));
        list.add(new Bank_details("Zyna",56789,"Savings",2000));
        int choice; 
        boolean found;
        do {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println(" 1. Open Account \n "+ "2. Display all account details \n "
            		+ "3. Deposit the amount\n "
            		+ "4. Withdraw the amount \n 5. Balance enquiry \n "
            		+ "6.Exit ");  
            System.out.print("Enter your choice: ");  
            choice = sc.nextInt();  
                switch (choice) { 
	                case 1:
	                	System.out.print("Enter Name: ");  
	                    name = sc.next();  
	                    System.out.print("Enter Account No: ");  
	                    acc_no = sc.nextInt();  
	                    System.out.print("Enter Account type: ");  
	                    acc_type = sc.next();  
	                    System.out.print("Enter Balance: ");  
	                    balance = sc.nextLong();
	                    Bank_details bd = new Bank_details(name,acc_no,acc_type,balance);
	                    list.add(bd);
	                    System.out.println("Account Opened...!");
	                	break;
                    case 2:  
                    	for(Bank_details ac:list) {
                    		System.out.println(ac);
                    	} 
                        break;  
                    case 3: 
                    	System.out.println("---Balance Deposit---");
                    	found = false;
                        System.out.print("Enter Account no. : ");  
                        accno = sc.nextLong();     
                        for (Bank_details ac : list) {    
                            if (accno == ac.getAcc_no()) {  
                                found = true;
                                System.out.println("Name: "+ac.getName());
                    			System.out.println("Acount no.: "+ac.getAcc_no());
                    			System.out.println("Account Type : "+ac.getAcc_type());
                    			System.out.println("Balance: "+ac.getBalance());
                                
                                System.out.print("Enter the amount you want to deposit: ");  
                                amt = sc.nextInt();   
                                ac.setBalance(ac.getBalance()+amt);
                                System.out.println("--Deposit Successful ...!");
                                break;
                                 
                            }  
                        }  
                        if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break;                         
                    case 4:
                    	System.out.println("---Balance Witdraw---");
                    	found= false;
                    	System.out.print("Enter Account no. : ");  
                        accno = sc.nextLong();     
                        for (Bank_details ac : list) {    
                            if (accno == ac.getAcc_no()) {  
                                found = true;
                                System.out.println("Name: "+ac.getName());
                    			System.out.println("Acount no.: "+ac.getAcc_no());
                    			System.out.println("Account Type : "+ac.getAcc_type());
                    			System.out.println("Balance: "+ac.getBalance());
                                
                                System.out.print("Enter the amount you want to witdraw : ");  
                                amt = sc.nextInt();
                                if(amt<=ac.getBalance()) { 
                                ac.setBalance(ac.getBalance()-amt);
                                System.out.println("--Witdraw Successful ...!!");
                             }
                            else {
                            	System.out.println("Insufficient Balance...!!");
                            }
                                break;
                                 
                            }  
                        }
                        if (!found) {  
                            System.out.println("Insufficient Balance..!!");  
                        }  
                        break;
                         
                     
                    case 5:
                    	System.out.println("--Balance Enquiry --");
                    	found = false;
                    	System.out.print("Enter Account no : ");
                    	accno = sc.nextLong();
                    	for(Bank_details ac : list) {
                    		if(accno == ac.getAcc_no()) {
                    			found = true;
                    			System.out.println("Name: "+ac.getName());
                    			System.out.println("Acount no.: "+ac.getAcc_no());
                    			System.out.println("Account Type : "+ac.getAcc_type());
                    			System.out.println("Balance: "+ac.getBalance());
                    			break;
                    		}
                    	}
                    	if (!found) {  
                            System.out.println("Search failed! Account doesn't exist..!!");  
                        }  
                        break; 
                    	
                        case 6:
                        System.out.println("Thanks for Visiting us....!! \n"
                        		+ "see you soon ....!!");
                        break;
                    default :
                    	System.out.println("---Invalid Choice---");
                    	break;
                }
            }  while (choice != 6);  
    }
}    
