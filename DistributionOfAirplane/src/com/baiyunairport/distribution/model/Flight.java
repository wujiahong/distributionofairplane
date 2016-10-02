package com.baiyunairport.distribution.model;

import java.util.Date;

public class Flight {

	// 航班号
	private String number;
	
	// 国际国内属性  true:国内, false:国际
	private Boolean domestic;
	
	// 飞行任务
	private FlightMission flightMission;
	
	// 机型
	private AirplaneType airplaneType;
	
	// 航空公司
	private AirlineCompany airlineCompany;
	
	// 进港时间
	private Date ArrivalTime;
	
	// 进出港总人数
	private Integer totalNumofPeople;
	
	
}
