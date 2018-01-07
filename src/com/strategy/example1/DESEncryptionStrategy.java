package com.strategy.example1;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class DESEncryptionStrategy implements EncryptionStrategy {

	@Override
	public void encrypt(String plainText) {
		// TODO Auto-generated method stub

		System.out.println("DES Algorithm.");
		try {
			KeyGenerator keyGenerator = KeyGenerator.getInstance("DES");
			keyGenerator.init(56);
			SecretKey secretKey = keyGenerator.generateKey();
			byte[] plainTextByteArr = plainText.getBytes();
			
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			byte[] cipherText = cipher.doFinal(plainTextByteArr);
			
			System.out.println("Original : "+plainText);
			
			System.out.print("Encrypted: ");
			for(int i=0;i<cipherText.length;i++){
				System.out.print(cipherText[i]);
			}
			System.out.println();
			
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			byte[] cipherDecrypt = cipher.doFinal(cipherText);
			System.out.print("Decrypted: ");
			for(int i=0;i<cipherDecrypt.length;i++){
				System.out.print(cipherDecrypt[i]);
			}
			System.out.println();
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
