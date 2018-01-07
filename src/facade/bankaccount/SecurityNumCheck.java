package facade.bankaccount;

public class SecurityNumCheck {
	
	private int securityNum = 1234;
	
	public int getSecurityNumber(){
		return securityNum;
	}

	public boolean validateSecurity(int securityNumber){
		
		return securityNumber == getSecurityNumber();
	}
	
	
}
