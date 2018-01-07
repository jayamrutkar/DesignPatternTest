package facade.bankaccount;

public class BankAccountFacade {
	
	private int accountNumber;
	private int securityNumber;

	private AccountNumberCheck accountCheck = new AccountNumberCheck();
	private SecurityNumCheck securityCheck = new SecurityNumCheck();
	private FundCheck fundCheck = new FundCheck();
	
	public BankAccountFacade(int accountNumber, int securityNumber) {
		this.accountNumber = accountNumber;
		this.securityNumber = securityNumber;
	}

	public void withdrawCash(double d) {
		
		if(accountCheck.activeAccount(accountNumber)
				&& securityCheck.validateSecurity(securityNumber)
				&& fundCheck.haveEnoughMoney(d)){
			System.out.println("Transaction Success.");
		}else{
			System.out.println("Transaction Failed.");
		}
		
	}

	public void depositCash(double d) {
		if(accountCheck.activeAccount(accountNumber)
				&& securityCheck.validateSecurity(securityNumber)){
			fundCheck.depositMoney(d);
			System.out.println("Transaction Success.");
		}else{
			System.out.println("Transaction Failed.");
		}
	}
	
	

}
