
public class Account {

	private int balance;

	public Account() {
		this.balance = 0;
	}

	public Account(int amount) {
		deposit(amount);
	}

	public int getBalance() {
		return balance;
	}

	public void deposit(int amount) {
		if (amount < 0) {
			System.out.println("Invalid deposit amount");
		} else {
			balance = balance + amount;
		}
	}

	public void widrow(int widrowAmount) {
		
		if (widrowAmount<0) {
			System.out.println("Amount is negative");
		} else {

			if (balance > 0) {
				if (balance > widrowAmount) {
					balance = balance - widrowAmount;
					System.out.println("Balance widrow Successful");
				} else {
					System.out.println("Insufficient Balance");
				}
			} else {
				System.out.println("Balance is 0");
			}
		}
			
			
		
		
		
	}
}
