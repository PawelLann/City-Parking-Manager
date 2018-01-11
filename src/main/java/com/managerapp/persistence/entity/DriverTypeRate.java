package com.managerapp.persistence.entity;

import java.math.BigDecimal;

/**
 * Created by pawel.langwerski@coi.gov.pl on 05.01.18.
 */
public enum DriverTypeRate {

  REGULAR(BigDecimal.valueOf(1)){
    @Override
    public BigDecimal countRate(double whichHour){
      if(whichHour == 1){
        return BigDecimal.valueOf(1);
      }
      if(whichHour == 2){
        return BigDecimal.valueOf(2);
      }
      if(whichHour >= 3){
        return BigDecimal.valueOf((whichHour-1)*2);
      }
      else return BigDecimal.valueOf(0);

    }
  },
  VIP(BigDecimal.valueOf(2)){
    @Override
    public BigDecimal countRate(double whichHour) {
      if(whichHour == 1){
        return BigDecimal.valueOf(0);
      }
      if(whichHour == 2){
        return BigDecimal.valueOf(2);
      }
      if(whichHour >= 3){
        return BigDecimal.valueOf((whichHour-1)*1.5);
      }
      else return BigDecimal.valueOf(0);
    }
  };


  private BigDecimal rate;
  private double whichHour;


  DriverTypeRate(BigDecimal rate){
    this.rate = rate;
  }

  public abstract BigDecimal countRate(double whichHour);
}