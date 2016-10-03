package com.baiyunairport.distribution.model;

import java.util.Date;

public class Flight {

	// 航空公司
	private AirlineCompany airlineCompany;
	
	// 航班号
	private String number;
	
	// 国际国内属性  true:国内, false:国际
	private Boolean domestic;
	
	// 飞行任务
	private FlightMission flightMission;
	
	// 机型
	private AirplaneType airplaneType;
	
	// 进港时间
	private Date arrivalTime;
	
	// 出机位时间
	private Date departureTime;
	
	// 进出港总人数
	private Integer totalNumofPeople;

	public String toString() {
		return number;
	}
	
	public AirlineCompany getAirlineCompany() {
		return airlineCompany;
	}

	public String getNumber() {
		return number;
	}

	public Boolean getDomestic() {
		return domestic;
	}

	public FlightMission getFlightMission() {
		return flightMission;
	}

	public AirplaneType getAirplaneType() {
		return airplaneType;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public Integer getTotalNumofPeople() {
		return totalNumofPeople;
	}

	public void setAirlineCompany(AirlineCompany airlineCompany) {
		this.airlineCompany = airlineCompany;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setDomestic(Boolean domestic) {
		this.domestic = domestic;
	}

	public void setFlightMission(FlightMission flightMission) {
		this.flightMission = flightMission;
	}

	public void setAirplaneType(AirplaneType airplaneType) {
		this.airplaneType = airplaneType;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public void setTotalNumofPeople(Integer totalNumofPeople) {
		this.totalNumofPeople = totalNumofPeople;
	}
	
	
}
