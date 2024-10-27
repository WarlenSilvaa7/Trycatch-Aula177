package aplicattion;

import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainException;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double initialbalance = 0;

		
			System.out.println("Enter Account data:");
			System.out.print("Number:");
			int number =  sc.nextInt();
			System.out.print("Holder:");
			String holder =  sc.next();
			System.out.print("Initial balance:");
			double balance =  sc.nextDouble();
			System.out.print("WithDraw Limit:");
			double WithDrawLimit =  sc.nextDouble();
			
			Account account = new Account(number,holder,initialbalance,WithDrawLimit);
			account.deposit(balance);
			
			System.out.println("Enter the amount for Withdraw:");
			double amount =  sc.nextDouble();
			
		try {
			account.withdraw(amount);
			System.out.print("New balance:" + account.getBalance());
		}
		catch(DomainException e) {
			System.out.print("Withdraw error: " + e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
