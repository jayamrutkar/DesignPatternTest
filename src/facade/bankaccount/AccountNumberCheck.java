package facade.bankaccount;

public class AccountNumberCheck {
	
	private int accountNum = 123456789;

	public int getAccountNum() {
		return accountNum;
	}

	public boolean activeAccount(int account){
		if(account == getAccountNum()){
			return true;
		}else{
			return false;
		}
	}

	
	
}
