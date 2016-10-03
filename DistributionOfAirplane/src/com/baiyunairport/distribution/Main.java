package com.baiyunairport.distribution;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import com.baiyunairport.distribution.service.FlightService;
import com.baiyunairport.distribution.service.StandService;
import com.baiyunairport.distribution.service.impl.FlightServiceImpl;
import com.baiyunairport.distribution.service.impl.StandServiceImpl;

public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws BiffException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws BiffException, IOException, ParseException {
		// TODO Auto-generated method stub

		Workbook workbook = null;
		
		InputStream inputStream = new FileInputStream("C:/Users/user/Desktop/distributionofairplane/a.xls");
		
		workbook = Workbook.getWorkbook(inputStream);
		
		Sheet flightSheet = workbook.getSheet(0);
		Sheet standSheet = workbook.getSheet(1);
		
		FlightService flightService = new FlightServiceImpl();
		StandService standService = new StandServiceImpl();
		
		flightService.init(flightSheet);
		standService.init(standSheet);
	}

}
