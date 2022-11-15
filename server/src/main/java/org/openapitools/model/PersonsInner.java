package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.PersonInfoWeightInfoInner;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonsInner
 */

@JsonTypeName("persons_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-15T19:48:45.783+01:00[Europe/Berlin]")
public class PersonsInner {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("username")
  private String username;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("dateOfBirth")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate dateOfBirth;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    MALE("male"),
    
    FEMALE("female"),
    
    DIVERSE("diverse");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender;

  @JsonProperty("weightInfo")
  @Valid
  private List<PersonInfoWeightInfoInner> weightInfo = null;

  @JsonProperty("height")
  private Integer height;

  public PersonsInner id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "0", required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PersonsInner username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "username", example = "mmuster", required = false)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public PersonsInner firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", example = "Max", required = false)
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public PersonsInner lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", example = "Mustermann", required = false)
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public PersonsInner dateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
  */
  @Valid 
  @Schema(name = "dateOfBirth", example = "Thu Jul 27 02:00:00 CEST 2000", required = false)
  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public PersonsInner gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  
  @Schema(name = "gender", required = false)
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public PersonsInner weightInfo(List<PersonInfoWeightInfoInner> weightInfo) {
    this.weightInfo = weightInfo;
    return this;
  }

  public PersonsInner addWeightInfoItem(PersonInfoWeightInfoInner weightInfoItem) {
    if (this.weightInfo == null) {
      this.weightInfo = new ArrayList<>();
    }
    this.weightInfo.add(weightInfoItem);
    return this;
  }

  /**
   * Get weightInfo
   * @return weightInfo
  */
  @Valid 
  @Schema(name = "weightInfo", required = false)
  public List<PersonInfoWeightInfoInner> getWeightInfo() {
    return weightInfo;
  }

  public void setWeightInfo(List<PersonInfoWeightInfoInner> weightInfo) {
    this.weightInfo = weightInfo;
  }

  public PersonsInner height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * height in cm
   * @return height
  */
  
  @Schema(name = "height", example = "187", description = "height in cm", required = false)
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonsInner personsInner = (PersonsInner) o;
    return Objects.equals(this.id, personsInner.id) &&
        Objects.equals(this.username, personsInner.username) &&
        Objects.equals(this.firstName, personsInner.firstName) &&
        Objects.equals(this.lastName, personsInner.lastName) &&
        Objects.equals(this.dateOfBirth, personsInner.dateOfBirth) &&
        Objects.equals(this.gender, personsInner.gender) &&
        Objects.equals(this.weightInfo, personsInner.weightInfo) &&
        Objects.equals(this.height, personsInner.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, firstName, lastName, dateOfBirth, gender, weightInfo, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    weightInfo: ").append(toIndentedString(weightInfo)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

