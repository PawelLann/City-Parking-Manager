package com.managerapp.logic.service;

import com.managerapp.api.rest.model.DriverFormDto;
import com.managerapp.persistence.entity.Driver;

/**
 * Created by pawel.langwerski@coi.gov.pl on 09.01.18.
 */
public interface DriverService {

  void startParkingTime(Driver driver);
  void createDriver(DriverFormDto driverFormDto);

}
