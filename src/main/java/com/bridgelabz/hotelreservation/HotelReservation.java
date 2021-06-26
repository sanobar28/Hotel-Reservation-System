package com.bridgelabz.hotelreservation;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.bridgelabz.hotelreservation.model.Hotels;

public class HotelReservation {

	// hotellist
	List<Hotels> hotelList = new ArrayList<Hotels>();

	/**
	 * UC-1 Method to add hotel in hotel reservation system
	 */
	public boolean addHotel() {

		final String hotel;
		final String customerType;
		final int WeekendRates, WeekdayRates, HotelRating;

		System.out.print("Hotel Name : ");
		hotel = ((Hotels) hotelList).getHotelName();

		System.out.print("Enter customer type : ");
		customerType = ((Hotels) hotelList).getCustomerType();

		System.out.print("Enter weekend rates : ");
		WeekendRates = ((Hotels) hotelList).getWeekendRates();

		System.out.print("Enter weekday rates : ");
		WeekdayRates = ((Hotels) hotelList).getWeekdayRates();

		System.out.print("Enter Ratings : ");
		HotelRating = ((Hotels) hotelList).getHotelRating();

		hotelList.add(new Hotels(hotel, customerType, WeekendRates, WeekdayRates, HotelRating));

		return false;
	}

	/**
	 * UC-2 Method to find cheapest price of hotel by taking date
	 */

	public void findCheapest() {

		Scanner sc = new Scanner(System.in);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
		String dateTo = sc.next();
		String dateFrom = sc.next();

		try {
			LocalDate date1 = LocalDate.parse(dateTo, dtf);
			LocalDate date2 = LocalDate.parse(dateFrom, dtf);
			long daysBetween = Duration.between(date1, date2).toDays();
			System.out.println("Total Days: " + daysBetween);
		} catch (Exception e) {
			System.out.println("Error occurred" + e.getMessage());
		}
	}

	/**
	 * Method to display the list of Hotels
	 * 
	 */
	public void displayHotels() {
		if (hotelList.isEmpty()) {
			System.out.println("No Records!!!");
		} else {
			for (Hotels hotels : hotelList) {
				System.out.println(hotels);
			}
		}

	}

}
