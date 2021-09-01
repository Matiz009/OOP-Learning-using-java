public class BankAccount{
	private String owner;
	private double balance=1000;

	public BankAccount(String owner) {
		setOwner(owner);
	}
	public void setOwner(String owner){
		this.owner=owner;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner(){
		return owner;
	}

	public double getBalance() {
		return balance;
	}

	void deposit(double amount){
		balance+=amount;
		setBalance(balance);
		System.out.println("Your new balance is :"+getBalance());	}
	void withdraw(double amount){
	  if(amount>balance){
        System.out.println("Insufficient Balance");
		System.exit(0);
	  }
	  balance=balance-amount;
	  setBalance(balance);
		System.out.println("Your new balance is :"+getBalance());
}
}