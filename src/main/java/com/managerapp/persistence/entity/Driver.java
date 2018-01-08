package com.managerapp.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by pawel.langwerski@coi.gov.pl on 05.01.18.
 */
@Getter
@Setter
@Entity
@Table(name = "DRIVERS")
public class Driver extends AbstractEntity implements Serializable {

  @NotEmpty
  @Column(nullable = false)
  private boolean isDriverStarted;

  @OneToOne
  @JoinColumn(name = "ID_PARKING_PAYMENT")
  private ParkingPayment parkingPayment;

  @Column(name = "START_PARKING_TIME", nullable = false)
  @DateTimeFormat
  private transient LocalDateTime startParkingTime;
  private DateTime start = startParkingTime.toDateTime();

  @Column(name = "END_PARKING_TIME")
  @DateTimeFormat
  private transient LocalDateTime endParkingTime;
  private DateTime end = endParkingTime.toDateTime();

  @Column(name = "TOTAL_PARKING_TIME")
  @DateTimeFormat
  private transient LocalDateTime totalParkingTime;
}
