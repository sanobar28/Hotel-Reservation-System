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
	int totalCost;

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public int getHotelRating() {
		return HotelRating;
	}

	public void setHotelRating(int hotelRating) {
		HotelRating = hotelRating;
	}

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

	public Hotels(String hotelName, String customerType, int WeekendRates, int WeekdayRates, int HotelRating, int totalCost) {

		this.customerType = customerType;
		this.hotelName = hotelName;
		this.WeekdayRates = WeekdayRates;
		this.WeekendRates= WeekendRates;
		this.HotelRating = HotelRating;
		this.totalCost = totalCost;

	}
	
	@Override
	public String toString() {
		return "Hotels [hotelName=" + hotelName + ", customerType=" + customerType + ", WeekendRates=" + WeekendRates
				+ ", WeekdayRates=" + WeekdayRates + ", HotelRating=" + HotelRating + ", totalCost=" + totalCost + "]";
	}
		

}
