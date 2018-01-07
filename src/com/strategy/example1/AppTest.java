package com.strategy.example1;

public class AppTest {
	
	public static void main(String[] args){
		
		Encryptor encryptor = new Encryptor(new AESEncryptionStrategy());
		encryptor.encrypt("JAywant");
		
		encryptor.setEncryptionStrategy(new BlowFishEncryptionStrategy());
		encryptor.encrypt("JAywant");
		
		encryptor.setEncryptionStrategy(new DESEncryptionStrategy());
		encryptor.encrypt("JAywant");
	}

}
