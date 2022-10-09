package ATM;

import java.util.*;

public class atm {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		Account acc = new Account();
		
		
		System.out.println("Log In");
		System.out.print("User name: ");
		String Uname = s.nextLine();
		
		System.out.print("PIN: ");
		String pin = s.nextLine();
		
		boolean is_exist = false;
		
		for(int a = 0; a < acc.username.length; a++) {
			if(acc.username[a].equals(Uname) && acc.pin[a].equals(pin)) {
				is_exist = true;
				break;
			}
		}
		System.out.println();
		
		
		//  while loop:
		while(is_exist) {
			
			System.out.println( "1. View Balance" +
								"\n2. Deposit" +
								"\n3. Withdraw" +
								"\n4. Exit" );
			System.out.print("Enter your choice: ");
			int c = s.nextInt();
			
			if(c == 4) {
				break;
			}
			
			switch(c) {
			
			case 1:
				System.out.println("Hello " + Uname);
				System.out.println("Balance: $" + acc.getAmmount());
				System.out.println();
				break;
			
			case 2:
				System.out.print("Enter the ammount: ");
				int d = s.nextInt();
				
				acc.setDeposit(d);
				System.out.println("You deposit ammounting: $" + d);
				System.out.println();
				break;
			
			case 3:
				if(acc.getAmmount() == 0) {
					System.out.println("Sorry empty balance");
					System.out.println();
					break;
				}
				else {
				System.out.print("Enter the ammount: ");
				int w = s.nextInt();
				
					if(w <= acc.getAmmount()) {
						acc.setWithdraw(w);
						System.out.println("You withdraw ammounting: $" + w);
						System.out.println();
						break;
					}
					else {
						System.out.println("Sorry not enough balance");
						System.out.println();
						break;
					}
				}
				
			}
		}
			
		
		
		if(is_exist == false) System.out.println("Account not found");
		
	}

}
