/**
 * @author Sanobar Mujawar
 * 
 * 
 * This is Hotel reservation class
 */

package com.bridgelabz.hotelreservation;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HotelReservationTest {

	ValidateInput hotel = new ValidateInput();
	
	
	//Test cases for hotel name
	@Test
	public void givenValidHotelName_shouldReturnTrue() {

		boolean hotelname = hotel.getHotelName("Lakewood");
		assertTrue(hotelname);
	}
	
	@Test
	public void givenValidHotelName_withAtLeastThreeChar_shouldReturnTrue() {

		boolean hotelname = hotel.getHotelName("Lak");
		assertTrue(hotelname);
	}
	
	@Test
	public void givenInvalidHotelName_shouldReturnFalse() {
		
		boolean hotelname = hotel.getHotelName("lakewood");
		assertFalse(hotelname);
	}
	
	@Test
	public void givenInvalidHotelName_allInCaps_shouldReturnFalse() {
		
		boolean hotelname = hotel.getHotelName("LAKEWOOD");
		assertFalse(hotelname);
	}
	
	@Test
	public void givenInvalidHotelName_containNumbers_shouldReturnFalse() {
		
		boolean hotelname = hotel.getHotelName("Lake1wood");
		assertFalse(hotelname);
	}

	@Test
	public void givenHotelName_Withonechar_shouldReturnFalse() {
		
		boolean hotelname = hotel.getHotelName("L");
		assertFalse(hotelname);
	}
	
	@Test
	public void givenHotelName_lessThanThreeChar_shouldReturnFalse() {
		
		boolean hotelname = hotel.getHotelName("La");
		assertFalse(hotelname);
	}

	
}
