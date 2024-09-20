package test3;

import java.util.Scanner;

public class Bank {

	int bal;
	
	int deposit;
	
	
	public void deposit() throws NegativeNumberException
	{
		int amount;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the amount");
		amount=sc.nextInt();
		
		System.out.println("Enter the deposit");
		deposit=sc.nextInt();
		if(deposit<0) {
			throw new NegativeNumberException("The number should be positive");
		
		}
		
		bal=amount+deposit;
		System.out.println(bal);
	}
	
	public static void main(String[] args) {
		
		Bank b=new Bank();
		
		try {
		b.deposit();
		}
		catch(NegativeNumberException e){
			System.out.println("The number entered is negative");
		}
	}
	
}
