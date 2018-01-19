package com.managerapp.logic.service;

import com.managerapp.api.model.DriverFormDto;
import com.managerapp.persistence.entity.Driver;
import com.managerapp.persistence.entity.ParkingPayment;

/**
 * Created by pawel.langwerski@coi.gov.pl on 15.01.18.
 */

public interface DriverService {

  void startParkingTime(Driver driver);
  void createDriver(DriverFormDto driverFormDto);

}
