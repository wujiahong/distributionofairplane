package com.baiyunairport.distribution.service;

import java.text.ParseException;

import jxl.Sheet;

public interface FlightService {


	void init(Sheet flightSheet) throws ParseException;

}
