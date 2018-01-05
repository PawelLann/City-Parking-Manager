package com.managerapp.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by pawel.langwerski@coi.gov.pl on 05.01.18.
 */
@Getter
@Setter
@Entity
public class Parking extends AbstractEntity implements Serializable {
}
