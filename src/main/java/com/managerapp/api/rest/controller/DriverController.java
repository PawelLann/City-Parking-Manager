package com.managerapp.api.rest.controller;

import com.managerapp.api.DriverApi;
import com.managerapp.api.model.DriverFormDto;
import com.managerapp.api.model.DriverStatusDto;
import com.managerapp.api.model.DriverViewDto;
import com.managerapp.logic.service.DriverServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

/**
 * Created by pawel.langwerski@coi.gov.pl on 15.01.18.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class DriverController implements DriverApi {

  private final DriverServiceImpl driverService;


  @Override
  public ResponseEntity<Void> createDriver(@RequestBody DriverFormDto driverFormDto) {
    driverService.createDriver(driverFormDto);
    return new ResponseEntity<>(CREATED);
  }

  @Override
  public ResponseEntity<List<DriverViewDto>> getPayment(String plates) {
    return null;
  }

  @Override
  public ResponseEntity<DriverStatusDto> getUserById(Long plates) {
    return null;
  }

  @Override
  public ResponseEntity<Void> stopParkingTime(String plates, DriverFormDto driverFormDto) {
    return null;
  }
}
