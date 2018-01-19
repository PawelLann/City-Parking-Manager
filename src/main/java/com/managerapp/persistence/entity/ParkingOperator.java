package com.managerapp.persistence.entity;

import com.google.common.collect.Lists;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by pawel.langwerski@coi.gov.pl on 05.01.18.
 */
@Getter
@Setter
@Entity
@Table(name = "PARKING_OPERATOR")
public class ParkingOperator extends AbstractEntity implements Serializable {

  @NotEmpty
  @Column(nullable = false)
  private String name;

  //@OneToMany
  private ArrayList<Driver> drivers = Lists.newArrayList();
}
