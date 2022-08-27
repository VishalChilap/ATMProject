package ATMproject;

import java.util.*;
import java.util.Map;

public class ATMimplementation implements ATMinterface{
	ATM a = new ATM();
	ArrayList<String> h = new ArrayList<>();
	 public void viewBalance() {
		System.out.println("Available balance is : "+a.getBalance());
	}
	public void withdrawBalance(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=a.getBalance()) {
				h.add(withdrawAmount+" Amount withdraw");
				System.out.println("Collect our cash : "+withdrawAmount);
				a.setBalance(a.getBalance()-withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("Insufficient amount");
			}	
		}
		else {
			System.out.println("Please enter the amount in multiple of 500");
		}
	}
	public void depositeBalance(double depositeAmount) {
		h.add(depositeAmount+" Amount deposite");
		a.setBalance(a.getBalance()+depositeAmount);
		System.out.println(depositeAmount+" Cash deposited succesfully");
		viewBalance();
	}
	public void viewStatement() {
		for(var entry : h) {
			System.out.println(entry);
		}
	}

}
