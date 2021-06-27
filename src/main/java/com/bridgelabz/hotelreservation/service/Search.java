package com.bridgelabz.hotelreservation.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.bridgelabz.hotelreservation.exception.HotelReservationException;
import com.bridgelabz.hotelreservation.model.Hotels;

public class Search {

	/**
	 * UC-2 Method to find cheapest hotel for given date range
	 * 
	 * @param hotel
	 * @throws ParseException
	 */
	public static void sortByPrice(List<Hotels> hotel) throws ParseException, HotelReservationException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter checkIn date: ");
		String dateFrom = sc.next();

		System.out.println("Enter checkOut date: ");
		String dateTo = sc.next();

		int weekendrate;
		int weekdayrate;
		int totalCost = 0;

		try {
				Date date1 = sdf.parse(dateFrom);
				Date date2 = sdf.parse(dateTo);
				long difference_In_Time = date2.getTime() - date1.getTime();
	
				long totalDays = (difference_In_Time / (1000 * 60 * 60 * 24)) % 365;
				System.out.println("Total Days: " + totalDays);
	
				List<Hotels> list = new ArrayList<>();
				for (Hotels h : hotel) {
					weekendrate = (int) (h.getWeekendRates() * totalDays);
					weekdayrate = (int) (h.getWeekdayRates() * totalDays);
					totalCost = weekendrate + weekdayrate;
					h.setTotalCost(totalCost);
					list.add(h);
				}

			// finds cheapest hotel
			Hotels cheapest = list.stream().min(Comparator.comparing(Hotels::getTotalCost))
					.orElseThrow(NoSuchElementException::new);
			System.out.println("Cheapest hotel: " + cheapest);

			// Best rated hotel for given Date
			Hotels CheapAndBest = list.stream().max(Comparator.comparing(Hotels::getHotelRating))
					.orElseThrow(NoSuchElementException::new);
			System.out.println("Hotel with best ratings: " + CheapAndBest);

		} catch (Exception e) {
			throw new HotelReservationException(e.getMessage());
		}

	}

	/**
	 * UC-4 Ability to find cheapest on weekday and weekends
	 * 
	 * @param hotel
	 */
	public static void findCheapestByDay(List<Hotels> hotel) {

		// find cheapest on weekdays
		Hotels weekdayCheap = hotel.stream().min(Comparator.comparing(Hotels::getWeekdayRates))
				.orElseThrow(NoSuchElementException::new);
		System.out.println("Cheapest on weekday: " + weekdayCheap);

		// find cheapest on weekends
		Hotels weekendCheap = hotel.stream().min(Comparator.comparing(Hotels::getWeekendRates))
				.orElseThrow(NoSuchElementException::new);
		System.out.println("Cheapest on weekend: " + weekendCheap);

	}

}
