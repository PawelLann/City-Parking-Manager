package com.managerapp.api.rest.model;

import com.managerapp.api.model.DriverFormDto;
import com.managerapp.api.model.DriverViewDto;
import com.managerapp.persistence.entity.Driver;
import org.mapstruct.Mapper;

/**
 * Created by pawel.langwerski@coi.gov.pl on 15.01.18.
 */
@Mapper
public interface DriverMapper {

  Driver map(DriverFormDto driverFormDto);
  DriverViewDto map(Driver driver);

}
