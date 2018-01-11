package com.managerapp.logic.service;

import com.google.common.base.Preconditions;
import com.managerapp.api.rest.model.DriverFormDto;
import com.managerapp.api.rest.model.DriverMapper;
import com.managerapp.api.rest.model.DriverMapperImpl;
import com.managerapp.persistence.entity.Driver;
import com.managerapp.persistence.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by pawel.langwerski@coi.gov.pl on 09.01.18.
 */
@Transactional
@Service
@RequiredArgsConstructor
@Slf4j
public class DriverServiceImpl implements DriverService {

  private final Driver driver;
  private final DriverRepository driverRepository;
  private static final DriverMapper DRIVER_MAPPER = new DriverMapperImpl();

  @Override
  public void startParkingTime(Driver driver) {
    log.debug("Starting parking time");
    driver.setStartParkingTime(DateTime.now());




  }

  @Override
  public void createDriver(DriverFormDto driverFormDto) {
    log.debug("Creating new driver");
    Preconditions.checkNotNull(driverFormDto,"Plates cannot be null");
    DRIVER_MAPPER.map(driverFormDto);
    driverRepository.save(driver);
    startParkingTime(driver);
  }
}
