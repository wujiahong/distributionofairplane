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
	private List<FlightMission> flyMissions;
	
	// 机型
	private List<AirplaneType> airplaneTypes;
	
	// 航空公司
	private List<AirlineCompany> airlineCompanys;
	
	
}
