/* 
   Corine Jacobs
   10001326
   Minor Programmeren UvA
   2015-2016 semester 1
*/

public class SavingsAccount {

	private int balance;

	public SavingsAccount() {
		balance = 0;
	}

	public SavingsAccount(int initialBalance) {
		balance = initialBalance;
	}

	public void greet(){
		System.out.println("Welcome to your account");
	}

	public void showBalance(){
		System.out.println(balance);
	}

	public void deposit(int howMuch) {
		if (howMuch <= 0){
			System.out.println("Cannot deposit negative amount.");
		}
		else{
			balance = balance + howMuch;
		}
	}

	public void withdraw(int howMuch) {
		if (balance - howMuch < 0){
			System.out.println("Insufficient funds.");
		}
		else{
			balance = balance - howMuch;
		}
	}

}