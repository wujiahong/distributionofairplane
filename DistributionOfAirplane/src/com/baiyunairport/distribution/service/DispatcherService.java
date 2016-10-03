package com.baiyunairport.distribution.service;

import java.util.List;

import com.baiyunairport.distribution.model.Flight;
import com.baiyunairport.distribution.model.Stand;

public interface DispatcherService {

	void dispatch(List<Flight> flights, List<Stand> stands);

}
