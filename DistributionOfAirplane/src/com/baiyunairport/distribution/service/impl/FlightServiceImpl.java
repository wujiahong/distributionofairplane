package com.baiyunairport.distribution.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jxl.Sheet;

import com.baiyunairport.distribution.model.AirlineCompany;
import com.baiyunairport.distribution.model.AirplaneType;
import com.baiyunairport.distribution.model.Flight;
import com.baiyunairport.distribution.model.FlightMission;
import com.baiyunairport.distribution.service.FlightService;

public class FlightServiceImpl implements FlightService {

	List<Flight> flights = new ArrayList<Flight>();
	
	@Override
	public void init(Sheet flightSheet) throws ParseException{
		
		int rows = flightSheet.getRows();
		
		Flight flight;
		
		for (int i = 1; i < rows; i++) {
			
			flight = new Flight();
			
			flight.setAirlineCompany(new AirlineCompany(flightSheet.getCell(0, i).getContents()));
			
			flight.setNumber(flightSheet.getCell(1, i).getContents());
			
			String arrivalTimeString = flightSheet.getCell(2, i).getContents();
			Date arrivalTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(arrivalTimeString);
			flight.setArrivalTime(arrivalTime);
		

			String departureTimeString = flightSheet.getCell(3, i).getContents();
			Date departureTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(departureTimeString);
			flight.setDepartureTime(departureTime);
			
			flight.setDomestic(flightSheet.getCell(4, i).getContents().equals("¹úÄÚ")?true:false);
			
			flight.setFlightMission(new FlightMission(flightSheet.getCell(5, i).getContents()));
		
			flight.setAirplaneType(new AirplaneType(flightSheet.getCell(6, i).getContents()));
			
			flight.setTotalNumofPeople(Integer.parseInt(flightSheet.getCell(7, i).getContents()));
			
			flights.add(flight);		
		}
	}
}
