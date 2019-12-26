package com.slr.cleancode.ch3.after;


/**
 * This is an example for Have no side effects concept
 */

public class UserValidator {
	private Cryptographer cryptographer;

	public boolean checkPasswordAndInitializeSession(String userName, String password) {  //This violates Single Responsibility principle
		User user = UserGateway.findByName(userName);
		if (user != User.NULL) {
			String codedPhrase = user.getPhraseEncodedByPassword();
			String phrase = cryptographer.decrypt(codedPhrase, password);
			if ("Valid Password".equals(phrase)) {
				Session.initialize();
				return true;
			}
		}
		return false;
	}
}