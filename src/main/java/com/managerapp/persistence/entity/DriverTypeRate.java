package com.managerapp.persistence.entity;

/**
 * Created by pawel.langwerski@coi.gov.pl on 05.01.18.
 */
public enum DriverTypeRate {

  REGULAR(1),
  VIP(2);

  private final double rate;
  private int whichHour;

  DriverTypeRate(double rate){
    this.rate = rate;
  }

  public double getRate(int whichHour, DriverTypeRate driverTypeRate){
    if(driverTypeRate == REGULAR && whichHour==1){
      return 1;
    }
    if((driverTypeRate == REGULAR || driverTypeRate == VIP) && whichHour == 2){
      return 2;
    }
    if(driverTypeRate == REGULAR && whichHour>=3){
      return getRate(whichHour, driverTypeRate)*2;
    }
    if(driverTypeRate == VIP && whichHour==1){
      return 0;
    }
    if(driverTypeRate == VIP && whichHour>=3){
      return getRate(whichHour, driverTypeRate)*1.5;
    }
    else return 0;
  }
}