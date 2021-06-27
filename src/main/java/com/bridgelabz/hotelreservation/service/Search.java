package com.bridgelabz.hotelreservation.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.bridgelabz.hotelreservation.model.Hotels;

public class Search {
	
	
	/**
	 * UC-2 Method to find cheapest hotel for given date range
	 * @param hotel
	 * @throws ParseException
	 */
	public static void sortByPrice(List<Hotels> hotel) throws ParseException {
		
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter checkIn date: ");
		String dateFrom = sc.next();

		System.out.println("Enter checkOut date: ");
		String dateTo = sc.next();

		int weekendrate;
		int weekdayrate;
		int totalCost = 0;

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
		Hotels sorted = list.stream().min(Comparator.comparing(Hotels::getTotalCost)).orElseThrow(NoSuchElementException::new);
		
		System.out.println("Cheapest hotel: " + sorted);
		
	}

}
