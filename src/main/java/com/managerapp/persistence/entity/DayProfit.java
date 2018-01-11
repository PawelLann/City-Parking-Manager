package com.managerapp.persistence.entity;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

/**
 * Created by pawel.langwerski@coi.gov.pl on 07.01.18.
 */
@Getter
@Setter
@Entity
@Table(name = "DAY_PROFIT")
public class DayProfit extends AbstractEntity implements Serializable {

  @NotNull
  @Column(nullable = false)
  private BigDecimal profit;

  @NotNull
  @Column(nullable = false)
  private transient LocalDateTime date;

  @OneToMany
  @JoinColumn(name = "ID_PARKING_PAYMENT")
  private Set<ParkingPayment> parkingPayments = Sets.newHashSet();

}
