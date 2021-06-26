/**
 * Getters and setters for hotel 
 */

package com.bridgelabz.hotelreservation.model;

public class Hotels {

	String hotelName;
	String customerType;
	int WeekendRates;
	int WeekdayRates;
	int HotelRating;

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public int getWeekendRates() {
		return WeekendRates;
	}

	public void setWeekendRates(int weekendRates) {
		WeekendRates = weekendRates;
	}

	public int getWeekdayRates() {
		return WeekdayRates;
	}

	public void setWeekdayRates(int weekdayRates) {
		WeekdayRates = weekdayRates;
	}
	
	public Hotels(String hotelName, String customerType, int WeekendRates, int WeekdayRates, int HotelRating) {
		
		this.customerType=customerType;
		this.hotelName= hotelName;
		this.WeekdayRates=WeekdayRates;
		this.HotelRating=HotelRating;
		
	}

}
