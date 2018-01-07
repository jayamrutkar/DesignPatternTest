package facade.bankaccount;

public class TestFacade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BankAccountFacade facade = new BankAccountFacade(123484, 1234);

		facade.withdrawCash(50.00);
		
		facade.withdrawCash(900.00);
		
		facade.depositCash(100.00);
		
	}

}
