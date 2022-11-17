package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.Valid;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.annotation.Generated;

/**
 * weight in kg, date format &#x3D; YYYY.MM.DD
 */

@Schema(name = "personInfo_weightInfo_inner", description = "weight in kg, date format = YYYY.MM.DD")
@JsonTypeName("personInfo_weightInfo_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-17T22:03:11.989+01:00[Europe/Berlin]")
public class PersonInfoWeightInfoInner {

  @JsonProperty("weight")
  private Float weight;

  @JsonProperty("date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  public PersonInfoWeightInfoInner weight(Float weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  */
  
  @Schema(name = "weight", required = false)
  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public PersonInfoWeightInfoInner date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @Valid 
  @Schema(name = "date", required = false)
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonInfoWeightInfoInner personInfoWeightInfoInner = (PersonInfoWeightInfoInner) o;
    return Objects.equals(this.weight, personInfoWeightInfoInner.weight) &&
        Objects.equals(this.date, personInfoWeightInfoInner.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weight, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonInfoWeightInfoInner {\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

