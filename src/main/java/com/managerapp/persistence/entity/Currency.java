package com.managerapp.persistence.entity;

/**
 * Created by pawel.langwerski@coi.gov.pl on 05.01.18.
 */
public enum Currency {

  PLN(1);

  private static int currency;

  Currency(int currency){
    setCurrency(currency);
  }

  public static int getCurrency() {
    return currency;
  }

  public static void setCurrency(int currency) {
    Currency.currency = currency;
  }
}
