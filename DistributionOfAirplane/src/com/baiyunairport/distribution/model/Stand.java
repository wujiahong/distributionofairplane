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
	private List<FlightMission> flyMissions;
	
	// ����
	private List<AirplaneType> airplaneTypes;
	
	// ���չ�˾
	private List<AirlineCompany> airlineCompanys;
	
	
}
