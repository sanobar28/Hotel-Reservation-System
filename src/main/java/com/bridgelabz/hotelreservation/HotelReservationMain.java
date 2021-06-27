/**
 * @author Sanobar Mujawar
 * @since 26.06.21
 * 
 * Purpose: Hotel reservation system to show user best hotel by
 * price, date, ratings
 * 
 */

package com.bridgelabz.hotelreservation;
import java.text.ParseException;

import com.bridgelabz.hotelreservation.exception.HotelReservationException;
import com.bridgelabz.hotelreservation.util.InputUtil;

public class HotelReservationMain {

	public static void main(String[] args) throws ParseException, HotelReservationException {

		int choice, i = 0;
		final HotelReservation menu = new HotelReservation();
		
		while (i == 0) {
			System.out.println("--- Hotel Reservation system ---\n");
			System.out.println("\t--MENU--");

			System.out.println("1: Add Hotel  ");
			System.out.println("2: Display Hotel list  ");
			System.out.println("3: Find Hotel      ");
			System.out.println("4: Exit		       \n");
			System.out.println("--- Enter Your Choice ---");

			choice = InputUtil.getIntValue();
			switch (choice) {
			case 1:
				menu.addHotel();
				break;
			case 2:
				menu.displayHotels();
				break;
			case 3:
				menu.findHotel();
				break;
			case 4:
				i = 1;
				break;
			default:
				System.out.println("Please Enter Valid Option!!!");

			}
		}
	}
}
