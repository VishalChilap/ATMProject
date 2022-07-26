package ATMproject;

import java.util.Scanner;

public class MyATM {
	public static void main(String args[]) {
		ATMimplementation a = new ATMimplementation();
		int id = 12345;
		int pin = 123;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM!!!");
		System.out.print("Enter the ATM id : ");
		int enterId = sc.nextInt();
		if (id == enterId) {
			System.out.print("Enter the ATM pin : ");
			int enterPin = sc.nextInt();
			if(pin == enterPin) {
				do {
					System.out.println("1 Check Balance\n2 Withdraw Cash\n3 Deposite Cash\n4 View Statement\n5 Exit");
					System.out.print("Enter choice : ");
					int choice = sc.nextInt();
					switch(choice) {
					case 1 :
						a.viewBalance();
						break;
					case 2 :
						System.out.print("Enter withdraw amount : ");
						double withdrawAmount = sc.nextDouble();
						a.withdrawBalance(withdrawAmount);
						break;
					case 3 :
						System.out.print("Enter deposite amount : ");
						double depositeAmount = sc.nextDouble();
						a.depositeBalance(depositeAmount);
						break;
					case 4 :
						a.viewStatement();
						break;
					case 5 :
						System.out.println("Collect your ATM\nThank you!!");
						System.exit(0);
						default :
							System.out.println("Enter valid choice");
					}
				}while(true);	
			}
			else {
				System.out.println("Enter valid pin");
			}
		} 
		else {
			System.out.println("Enter valid id");
		}	

	}

}
