import java.util.Random;
import java.util.Arrays;


public class BankAccount {
	private String accountNumber;
	private double checkingBalance = 0;
	private double savingsBalance = 0;
	
	private static int numAccounts = 0;
	private static double totalAmount = 0;
	
	public BankAccount() {
		this.accountNumber = randomAccountNum();
		numAccounts++;
	}
	
	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	private String randomAccountNum() {
		char[] digits = {'0','1','2','3','4','5','6','7','8','9'};
		char[] accNum = new char[10];
		Random r = new Random();
		for (int i = 0; i < 10; i++){
            int randomInt = r.nextInt(10);
            accNum[i] = digits[randomInt];
        }
		StringBuilder a = new StringBuilder();
		a.append(accNum);
		String result = a.toString();
		return result;
	}
	
	public void deposit(int choice, double depositAmount) {
		if (choice == 1) { //Savings
			this.savingsBalance += depositAmount;
			totalAmount += depositAmount;
			System.out.println("Deposit Success! Remaining Balance in Savings : $ " + this.savingsBalance);
		} else if (choice == 2) { //Checking
			this.checkingBalance += depositAmount;
			totalAmount += depositAmount;
			System.out.println("Deposit Success! Remaining Balance in Checking : $ " + this.checkingBalance);
		}
	}
	
	public void withdraw(int choice, double withdrawalAmount) {
		if (choice == 1) { //Savings
			if ((this.savingsBalance - withdrawalAmount) < 0) {
				System.out.println("Not Enough Balance in Savings to make Withdrawal!");
			} else {
				this.savingsBalance -= withdrawalAmount;
				totalAmount -= withdrawalAmount;
				System.out.println("Withdrawal Success! Remaining Balance in Savings : $ " + this.savingsBalance);
			}
		} else if (choice == 2) { //Checking
			if ((this.checkingBalance - withdrawalAmount) < 0) {
				System.out.println("Not Enough Balance in Checking to make Withdrawal!");
			} else {
				this.checkingBalance -= withdrawalAmount;
				totalAmount -= withdrawalAmount;
				System.out.println("Withdrawal Success! Remaining Balance in Checking : $ " + this.checkingBalance);
			}
		}
	}
	
	public void totalBalance() {
		double total = this.savingsBalance + this.checkingBalance;
		System.out.println("Total Balance: $ " + total);
	}
}
