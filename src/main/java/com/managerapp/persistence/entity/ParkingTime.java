package com.managerapp.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by pawel.langwerski@coi.gov.pl on 05.01.18.
 */
@Getter
@Setter
@Entity
@Table(name="PARKINGTIME")
public class ParkingTime extends AbstractEntity implements Serializable {

  @Column(name = "START_PARKING_TIME", nullable = false)
  @DateTimeFormat
  private LocalDateTime startParkingTime;

  @Column(name = "END_PARKING_TIME")
  @DateTimeFormat
  private LocalDateTime endParkingTime;

}
