package com.strategy.example1;

public class Encryptor {

	private EncryptionStrategy encryptionStrategy;
	
	public Encryptor(EncryptionStrategy encryptionStrategy) {
		super();
		this.encryptionStrategy = encryptionStrategy;
	}

	public EncryptionStrategy getEncryptionStrategy() {
		return encryptionStrategy;
	}

	public void setEncryptionStrategy(EncryptionStrategy encryptionStrategy) {
		this.encryptionStrategy = encryptionStrategy;
	}
	
	public void encrypt(String plainText){
		encryptionStrategy.encrypt(plainText);
	}
	
}
