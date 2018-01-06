package com.managerapp.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

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
  private boolean isDriverStarted;

}
