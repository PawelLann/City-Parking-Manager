package com.managerapp.api.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.managerapp.persistence.entity.ParkingPayment;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Created by pawel.langwerski@coi.gov.pl on 09.01.18.
 */
public class DriverFormDto {


  @JsonProperty("plates")
  private String plates = null;

  @JsonProperty("isDriverStarted")
  private boolean isDriverStarted = false;

  @JsonProperty("parkingPayment")
  private ParkingPayment parkingPayment = null;


  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getPlates() {
    return plates;
  }

  public void setPlates(String plates) {
    this.plates = plates;
  }

  public DriverFormDto plates(String plates) {
    this.plates = plates;
    return this;
  }


  @ApiModelProperty(required = true, value = "")
  @NotNull

  public boolean getIsDriverStarted() {
    return isDriverStarted;
  }

  public void setIsDriverStarted(boolean isDriverStarted) {
    this.isDriverStarted = isDriverStarted;
  }

  public DriverFormDto isDriverStarted(boolean isDriverStarted) {
    this.isDriverStarted = isDriverStarted;
    return this;
  }


  @ApiModelProperty(required = true, value = "")
  @NotNull

  public ParkingPayment getParkingPayment() {
    return parkingPayment;
  }

  public void setParkingPayment(ParkingPayment parkingPayment) {
    this.parkingPayment = parkingPayment;
  }

  public DriverFormDto parkingPayment(ParkingPayment parkingPayment) {
    this.parkingPayment = parkingPayment;
    return this;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverFormDto driverFormDto = (DriverFormDto) o;
    return Objects.equals(this.plates, driverFormDto.plates) &&
        Objects.equals(this.isDriverStarted, driverFormDto.isDriverStarted) &&
        Objects.equals(this.parkingPayment, driverFormDto.parkingPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plates, isDriverStarted, parkingPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverFormDto {\n");

    sb.append("    plates: ").append(toIndentedString(plates)).append("\n");
    sb.append("    isDriverStarted: ").append(toIndentedString(isDriverStarted)).append("\n");
    sb.append("    parkingPayment: ").append(toIndentedString(parkingPayment)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
