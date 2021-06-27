package com.bridgelabz.hotelreservation;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import com.bridgelabz.hotelreservation.util.InputUtil;
import com.bridgelabz.hotelreservation.model.Hotels;
import com.bridgelabz.hotelreservation.service.Search;

public class HotelReservation {

	// hotellist
	List<Hotels> hotelList = new ArrayList<Hotels>();

	/**
	 * UC-1 Method to add hotel in hotel reservation system
	 */
	public void addHotel() {

		final String hotel;
		final String customerType;
		final int WeekendRates, WeekdayRates, HotelRating, totalCost = 0;

		System.out.print("Hotel Name : ");
		hotel = InputUtil.getStringValue();

		System.out.print("Enter customer type : ");
		customerType = InputUtil.getStringValue();
		

		System.out.print("Enter weekend rates : ");
		WeekendRates = InputUtil.getIntValue();

		System.out.print("Enter weekday rates : ");
		WeekdayRates = InputUtil.getIntValue();

		System.out.print("Enter Ratings : ");
		HotelRating = InputUtil.getIntValue();

		hotelList.add(new Hotels(hotel, customerType, WeekendRates, WeekdayRates, HotelRating, totalCost));

	}

	/**
	 * Method to find hotel for given condition
	 * @throws ParseException
	 */

	public void findHotel() throws ParseException {

		System.out.println("Search hotel By...\n" + "1: Price and Rating\n" +  "2: Cheapest On Day\n" + "3: Back");
		int choice = InputUtil.getIntValue();
		switch (choice) {
		case 1:
			Search.sortByPrice(hotelList);
			break;
		case 2:
			Search.findCheapestByDay(hotelList);
			break;
		case 3:
			return;
		default:
			System.out.println("Please Enter Valid Option...");
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
			for (Hotels hotel : hotelList) {
				System.out.println(hotel);
			}
		}

	}

}
