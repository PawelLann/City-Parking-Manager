package com.managerapp.persistence.entity;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.Setter;
import org.joda.money.CurrencyUnit;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
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
  private BigDecimal payment;

  //private Set<CurrencyUnit> acceptedCurrencies = Sets.newHashSet();



  //notatki


  /*private double sum = parkingMeter.getHours().doubleValue();

  public double payment(double sum, DriverTypeRate driverTypeRate, CurrencyUnit currency){


  Period period = Period.fieldDifference(startParkingTime,endParkingTime);

  Duration duration = new Duration(start,end);
  Integer hours = Integer.valueOf(duration.toStandardHours().toString());*/

}



