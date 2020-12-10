
public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount x = new BankAccount();
		String y = x.getAccountNumber();
		System.out.println(y);
		x.totalBalance();
		x.deposit(1, 25);
		x.deposit(2, 50);
		x.withdraw(2, 10.25);
		x.withdraw(1, 30);
		x.totalBalance();
		
	}
}
