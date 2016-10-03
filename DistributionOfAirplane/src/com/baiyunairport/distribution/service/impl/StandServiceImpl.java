package com.baiyunairport.distribution.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Sheet;

import com.baiyunairport.distribution.model.AirlineCompany;
import com.baiyunairport.distribution.model.AirplaneType;
import com.baiyunairport.distribution.model.FlightMission;
import com.baiyunairport.distribution.model.Stand;
import com.baiyunairport.distribution.model.TaxiTrack;
import com.baiyunairport.distribution.service.StandService;

public class StandServiceImpl implements StandService {


	Map<String, List<Stand>> mapAirplaneType = new HashMap<String, List<Stand>>();
	
	Map<String, List<Stand>> mapFlightMission = new HashMap<String, List<Stand>>();
	
	Map<String, List<Stand>> mapDomestic = new HashMap<String, List<Stand>>();
	
	Map<String, List<Stand>> mapAirlineCompany = new HashMap<String, List<Stand>>();
	
	List<Stand> stands = new ArrayList<Stand>();
	
	public StandServiceImpl(){
		
		mapAirplaneType = new HashMap<String, List<Stand>>();
		
		mapFlightMission = new HashMap<String, List<Stand>>();
		
		mapDomestic = new HashMap<String, List<Stand>>();
		
		mapDomestic.put("国内", new ArrayList<Stand>());
		
		mapDomestic.put("国际", new ArrayList<Stand>());
		
		mapAirlineCompany = new HashMap<String, List<Stand>>();
		
		stands = new ArrayList<Stand>();
		
	}
	
	@Override
	public void init(Sheet standSheet){
		
		
		List<Stand> tempStands;
		
		int rows = standSheet.getRows();
		
		Stand stand;
		
		for (int i = 1; i < rows; i++) {
			
			stand = new Stand();
			
			stand.setNumber(standSheet.getCell(0, i).getContents());

			String domainStrings = standSheet.getCell(1, i).getContents();
			
			String[] domain = domainStrings.split("、");
			for (String string : domain) {

				if (string.equals("国内")) {
					stand.setDomestic(true);
					mapDomestic.get(string).add(stand);
				}else {
					stand.setDomestic(false);
					mapDomestic.get(string).add(stand);
				}
			}
			
			
			stand.setApron(standSheet.getCell(2, i).equals("远机位")?true:false);
			
			stand.setTaxiTrack(new TaxiTrack(standSheet.getCell(3, i).getContents()));
			
			String flightMissionStrings = standSheet.getCell(4, i).getContents();
			String[] flightMissionList = flightMissionStrings.split(",");
			
			FlightMission flightMission;
			List<FlightMission> flightMissions = new ArrayList<FlightMission>();
			for (String string : flightMissionList) {
				flightMission = new FlightMission(string);
				flightMissions.add(flightMission);
				
				tempStands = mapFlightMission.get(string);
				if (tempStands == null) {
					tempStands = new ArrayList<Stand>();
					mapFlightMission.put(string, tempStands);
				}
				tempStands.add(stand);
			}
			stand.setFlightMissions(flightMissions);
			
			String airlineCompanyStrings = standSheet.getCell(5, i).getContents();
			String[] airlineCompanyList = airlineCompanyStrings.split(",");
			
			AirlineCompany airlineCompany;
			List<AirlineCompany> airlineCompanys = new ArrayList<AirlineCompany>();
			for (String string : airlineCompanyList) {
				airlineCompany = new AirlineCompany(string);
				airlineCompanys.add(airlineCompany);
				
				tempStands = mapAirlineCompany.get(string);
				if (tempStands == null) {
					tempStands = new ArrayList<Stand>();
					mapAirlineCompany.put(string, tempStands);
				}
				tempStands.add(stand);
			}
			stand.setAirlineCompanys(airlineCompanys);
			
			String airplaneTypeStrings = standSheet.getCell(6, i).getContents();
			String[] airplaneTypeList = airplaneTypeStrings.split(",");
			
			AirplaneType airplaneType;
			List<AirplaneType> airplaneTypes = new ArrayList<AirplaneType>();
			for (String string : airplaneTypeList) {
				airplaneType = new AirplaneType(string);
				airplaneTypes.add(airplaneType);
				
				tempStands = mapAirplaneType.get(string);
				if (tempStands == null) {
					tempStands = new ArrayList<Stand>();
					mapAirplaneType.put(string, tempStands);
				}
				tempStands.add(stand);
			}
			stand.setAirplaneTypes(airplaneTypes);
			
			
			stands.add(stand);		
		}
	}
}
