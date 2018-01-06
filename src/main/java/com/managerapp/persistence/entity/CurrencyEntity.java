package com.managerapp.persistence.entity;

import com.google.common.collect.Sets;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.*;
import java.util.Currency;


import static java.util.Currency.getAvailableCurrencies;

/**
 * Created by pawel.langwerski@coi.gov.pl on 06.01.18.
 */
@Getter
@Setter
@Entity
@Table(name = "CURRENCY")
public class CurrencyEntity {

  private Set<Currency> possibleCurrencies = getAvailableCurrencies();

  private Set<Currency> usedCurrencies = Sets.newHashSet();


}
