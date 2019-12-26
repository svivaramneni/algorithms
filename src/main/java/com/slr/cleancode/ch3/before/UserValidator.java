package com.slr.cleancode.ch3.before;

import com.slr.cleancode.ch3.after.Cryptographer;
import com.slr.cleancode.ch3.after.Session;
import com.slr.cleancode.ch3.after.User;
import com.slr.cleancode.ch3.after.UserGateway;

public class UserValidator {
	private Cryptographer cryptographer;

	public boolean checkPassword(String userName, String password) {
		User user = UserGateway.findByName(userName);
		if (user != User.NULL) {
			String codedPhrase = user.getPhraseEncodedByPassword();
			String phrase = cryptographer.decrypt(codedPhrase, password);
			if ("Valid Password".equals(phrase)) {
				Session.initialize();//Does hidden thing which is not obvious from the method name. It could delete data in the session.
				return true;
			}
		}
		return false;
	}
}