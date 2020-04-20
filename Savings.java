package bankApp;

public class Savings extends Account {
	// list properties unique to Checking account
	int SafetyDepositBoxID;
	int SafetyDepositBoxKey;
		//constructors to initialize properties
	public Savings(String name,String SSN,double initDeposit) {
		super(name, SSN,initDeposit);
		AccountNumber = "1"+ AccountNumber;
		setSafetyDepositBox();
	}
	@Override
	public void setRate() {
		rate = getBaseRate() - .25 ;
		
	}
	
	public void setSafetyDepositBox() {
		SafetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		SafetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	
		
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Savings"+
				"\nDEPOSIT BOX ID: " + SafetyDepositBoxID+
				"\nDEPOSIT BOX KEY: " + SafetyDepositBoxKey
				
				);
	}
		// list methods specific to checking account.
		

}
