package com.managerapp.persistence.entity;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.money.CurrencyUnit;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;


/**
 * Created by pawel.langwerski@coi.gov.pl on 05.01.18.
 */
@Getter
@Setter
@Entity
@Table(name="PARKING_PAYMENT")
public class ParkingPayment extends AbstractEntity implements Serializable {

  @Column(name = "PAYMENT")
  private double payment;

  private Set<CurrencyUnit> acceptedCurrencies = Sets.newHashSet();



  //PROOF OF CONCEPT


  /*private double sum = parkingMeter.getHours().doubleValue();

  public double payment(double sum, DriverTypeRate driverTypeRate, CurrencyUnit currency){


  Period period = Period.fieldDifference(startParkingTime,endParkingTime);

  Duration duration = new Duration(start,end);
  Integer hours = Integer.valueOf(duration.toStandardHours().toString());*/

}



