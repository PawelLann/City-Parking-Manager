package com.managerapp.api.rest.model;

import com.managerapp.persistence.entity.Driver;
import org.mapstruct.Mapper;

/**
 * Created by pawel.langwerski@coi.gov.pl on 09.01.18.
 */
@Mapper
public interface DriverMapper {

  Driver map(DriverFormDto driverFormDto);
  DriverFormDto map(Driver driver);
}
