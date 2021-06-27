package com.bridgelabz.hotelreservation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateInput {

	
	static Scanner sc = new Scanner(System.in);

	/**
	 * validate hotel name
	 */
	public boolean getHotelName(String hotelname) {

		boolean match;
		match = Pattern.matches("^[A-Z]{1}[a-z]{2,}$", hotelname);
		if (!match) {

			ErrorMessage("Invalid hotel name");
		}
		return match;
	}

	public void ErrorMessage(String message) {

		Iexception i = () -> System.out.println(message);
		i.ErrorMessage();
	}

}
