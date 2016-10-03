package com.baiyunairport.distribution.model;

import java.util.List;


public class Stand {

	// 停机位编号
	private String number;
	
	// 国际国内属性  true:国内, false:国际
	private Boolean domestic;
	
	// 远机位属性   true:远机位, false:近机位
	private Boolean apron; 
	
	// 滑行道
	private TaxiTrack taxiTrack;
	
	// 飞行任务
	private List<FlightMission> flightMissions;
	
	// 机型
	private List<AirplaneType> airplaneTypes;
	
	// 航空公司
	private List<AirlineCompany> airlineCompanys;
	
	// 停留的航班列表，按照时间的先后顺序排列
	private List<Flight> flights;

	
	public String toString() {
		return number;
	}
	
	public String getNumber() {
		return number;
	}

	public Boolean getDomestic() {
		return domestic;
	}

	public Boolean getApron() {
		return apron;
	}

	public TaxiTrack getTaxiTrack() {
		return taxiTrack;
	}


	public List<AirplaneType> getAirplaneTypes() {
		return airplaneTypes;
	}

	public List<AirlineCompany> getAirlineCompanys() {
		return airlineCompanys;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setDomestic(Boolean domestic) {
		this.domestic = domestic;
	}

	public void setApron(Boolean apron) {
		this.apron = apron;
	}

	public void setTaxiTrack(TaxiTrack taxiTrack) {
		this.taxiTrack = taxiTrack;
	}

	public void setAirplaneTypes(List<AirplaneType> airplaneTypes) {
		this.airplaneTypes = airplaneTypes;
	}

	public void setAirlineCompanys(List<AirlineCompany> airlineCompanys) {
		this.airlineCompanys = airlineCompanys;
	}

	public List<FlightMission> getFlightMissions() {
		return flightMissions;
	}

	public void setFlightMissions(List<FlightMission> flightMissions) {
		this.flightMissions = flightMissions;
	}

	public List<Flight> getFlights() {
		return flights;
	}

	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	
	
}
