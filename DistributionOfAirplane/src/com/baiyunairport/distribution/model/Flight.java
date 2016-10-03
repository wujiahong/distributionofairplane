package com.baiyunairport.distribution.model;

import java.util.Date;

public class Flight {

	// ���չ�˾
	private AirlineCompany airlineCompany;
	
	// �����
	private String number;
	
	// ���ʹ�������  true:����, false:����
	private Boolean domestic;
	
	// ��������
	private FlightMission flightMission;
	
	// ����
	private AirplaneType airplaneType;
	
	// ����ʱ��
	private Date arrivalTime;
	
	// ����λʱ��
	private Date departureTime;
	
	// ������������
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
