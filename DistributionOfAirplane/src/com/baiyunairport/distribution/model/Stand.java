package com.baiyunairport.distribution.model;

import java.util.List;


public class Stand {

	// ͣ��λ���
	private String number;
	
	// ���ʹ�������  true:����, false:����
	private Boolean domestic;
	
	// Զ��λ����   true:Զ��λ, false:����λ
	private Boolean apron; 
	
	// ���е�
	private TaxiTrack taxiTrack;
	
	// ��������
	private List<FlightMission> flightMissions;
	
	// ����
	private List<AirplaneType> airplaneTypes;
	
	// ���չ�˾
	private List<AirlineCompany> airlineCompanys;
	
	// ͣ���ĺ����б�����ʱ����Ⱥ�˳������
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
