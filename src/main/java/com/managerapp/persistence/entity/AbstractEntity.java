package com.managerapp.persistence.entity;

import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by pawel.langwerski@coi.gov.pl on 05.01.18.
 */
@MappedSuperclass
@Getter
public class AbstractEntity {

  @Id
  @GeneratedValue
  private Long id;
}
