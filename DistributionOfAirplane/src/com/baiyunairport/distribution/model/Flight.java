package com.baiyunairport.distribution.model;

import java.util.Date;

public class Flight {

	// �����
	private String number;
	
	// ���ʹ�������  true:����, false:����
	private Boolean domestic;
	
	// ��������
	private FlightMission flightMission;
	
	// ����
	private AirplaneType airplaneType;
	
	// ���չ�˾
	private AirlineCompany airlineCompany;
	
	// ����ʱ��
	private Date ArrivalTime;
	
	// ������������
	private Integer totalNumofPeople;
	
	
}
