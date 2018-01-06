package com.managerapp.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by pawel.langwerski@coi.gov.pl on 05.01.18.
 */
@Getter
@Setter
@Entity
@Table(name = "PARKING_OWNER")
public class ParkingOwner extends AbstractEntity implements Serializable {


  @NotNull
  @Column(nullable = false)
  private String name;

  @NotNull
  @Column(nullable = false)
  private double dayProfit;

  private static ParkingOwner instance = null;

  private ParkingOwner(){}

  public static ParkingOwner getInstance(){
    if(instance ==null){
      instance = new ParkingOwner();
    }
    return instance;
  }
}
