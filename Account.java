package bankApp;

public abstract class Account implements IBaseRate {
	// list of common properties that are common for both checking and savings account
	String Name;
	String SSN;
	double Balance;
	
	static int index= 10000;
	String AccountNumber;
	double rate;
	//constructor to set base properties and initialize account
	public Account(String name,String SSN,double initDeposit) {
		this.Name =name;
		this.SSN =SSN;
		Balance = initDeposit;
		
		// set account number
		index++;
		this.AccountNumber = setAccountNumber();
		setRate();
		
	}
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoSSN = SSN.substring(SSN.length()-2, SSN.length());
		int uniqueID =index;
		int randomNumber =(int) (Math.random() * Math.pow(10, 3));
		return lastTwoSSN + uniqueID +randomNumber;
	}
	public void compound() {
		double accruedInterest= Balance * (rate/100);
		Balance = Balance+ accruedInterest;
		System.out.println("Accrued Interest: "+ accruedInterest);
		printBalance();
	}
	
	//list common methods.
	public void withdraw(double amount) {
		Balance = Balance - amount;
		System.out.println("withdrawing $"+ amount);
		printBalance();
	}
	public void deposit(double amount) {
		Balance = Balance + amount;
		System.out.println("Depositing: $"+ amount);
		printBalance();
		
	}
	public void transfer(String toWhere, double amount) {
		Balance = Balance - amount;
		System.out.println("Tranfering: $"+ amount+ "\tto: "+toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your Balance is now: $"+ Balance);
	}
	public void showInfo() {
		System.out.println(
				"NAME: "+ Name+
				"\nACCOUNT NUMBER: "+ AccountNumber+
				"\nBALANCE: $"+ Balance +
				"\nRate: "+ rate +"%"
				);
	}
}
