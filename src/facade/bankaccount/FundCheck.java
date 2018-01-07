package facade.bankaccount;

public class FundCheck {

	private double cashInAccount = 1000.00;
	
	public double getCash(){
		return cashInAccount;
	}
	
	public void decrease(double cash){
		cashInAccount -= cash;
	}
	
	public void increase(double cash){
		cashInAccount += cash;
	}
	
	public boolean haveEnoughMoney(double amount){
		
		if(amount>cashInAccount){
			System.out.println("Insufficient balance "+getCash());
			return false;
		}else{
			
			decrease(amount);
			System.out.println("After withdrawn, account balance is "+getCash());
			return true;
		}
	}
	
	public void depositMoney(double amount){
		
		increase(amount);
		System.out.println("Deposited, account balance is "+getCash());
	}
}
