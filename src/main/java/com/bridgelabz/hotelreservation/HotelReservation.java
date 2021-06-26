package com.bridgelabz.hotelreservation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.bridgelabz.hotelreservation.model.Hotels;

public class HotelReservation {

	// hotellist
	List<Hotels> HOTELLIST = new ArrayList<Hotels>();

	/**
	 * UC-1 Method to add hotel in hotel reservation system
	 */
	public void addHotel() {

		final String hotel1 = "Lakewood";
		final String hotel2 = "Bridgewood";
		final String hotel3 = "Rigewood";
		final String customerType = "Regular";
		final int WeekendRates, WeekdayRates, HotelRating;

		HOTELLIST.add(new Hotels(hotel1, customerType, 90, 110, 3));
		HOTELLIST.add(new Hotels(hotel2, customerType, 60, 160, 5));
		HOTELLIST.add(new Hotels(hotel3, customerType, 150, 220, 4));

	}

	/**
	 * UC-2 Method to find cheapest price of hotel by taking date
	 */

	public void findCheapest() {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println(formatter);
		} catch (Exception e) {
			System.out.println("Error occurred" + e.getMessage());
		}

		String dateTo = sc.next();
		String dateFrom = sc.next();

	}

}
