package com.phoneNumberz.validation;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

public class App {
	public static void main(String[] args) {
		String no = "7676465472";
		PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
		PhoneNumber p = null;
		boolean isValid = false;
		try {
			p = phoneNumberUtil.parse(no, "IN");
			isValid = phoneNumberUtil.isValidNumber(p);
		} catch (NumberParseException e) {
			System.out.println(e.getMessage());

		}
		System.out.println(isValid);
	}
}
