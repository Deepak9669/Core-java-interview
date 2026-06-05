package oop;

public class Account {

	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int amount) {

		balance = balance + amount;
		System.out.println("Balance = " + balance);
	}

	 public void withdrawl(int amount) {
		   if(amount> balance) {
			   System.out.println("insufficent fund transfer:");
			   
		   }else {
			   balance = balance -amount;
				System.out.println("after withdrawal:"+getBalance());
		   }
	   }
}
