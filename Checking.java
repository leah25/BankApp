package bankApp;

public class Checking extends Account {
	// list properties unique to Checking account
	int DebitCardNumber;
	int DebitCardPIN;
	// constructors to initialize properties
	public Checking(String name, String SSN,double initDeposit) {
	
		super(name,SSN,initDeposit);
		AccountNumber = "2"+ AccountNumber;
		setDebitCard();	
	}
	@Override
	public void setRate() {
		rate = getBaseRate() * .15 ;
	}
	// list methods specific to checking account.
	private void setDebitCard() {
		DebitCardNumber = (int)(Math.random()* Math.pow(10, 12));
		DebitCardPIN = (int)(Math.random()* Math.pow(10, 4));
		
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Checking"+
		"\nDebit Card Number: "+ DebitCardNumber +
		"\nDebit Card PIN: " +DebitCardPIN
				);
	}
		
	
	

}
