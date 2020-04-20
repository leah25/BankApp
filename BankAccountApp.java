package bankApp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		// read a csv file then create new accounts based on data
		/*Checking check = new Checking("Jerry Tom","234568765", 1500);

		Savings sav = new Savings("eliud berry", "469487662",2000);
		sav.compound();
		
		check.showInfo();
		System.out.println("******************");
		sav.showInfo();*/
		
		List<String[]> newAccounts = utilities.CSV.read("C:\\Users\\SHARON\\eclipse-workspace\\JavaOopProjects\\src\\bankApp\\file.txt");
		for(String[] Account : newAccounts ) {
			System.out.println("NEW ACCOUNT");
			System.out.println(Account[0]);
	
			
		}
		
		
	}

}
