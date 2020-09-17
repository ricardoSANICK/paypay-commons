package com.paypay.baymax.commons.type;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Request and response.
 */
@ApiModel(description = "Request and response.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-13T17:05:15.456-05:00[America/Mexico_City]")
public class OperEmployeeAllType   {
  @JsonProperty("employee")
  private EmployeeType employee = null;

  public OperEmployeeAllType employee(EmployeeType employee) {
    this.employee = employee;
    return this;
  }

  /**
   * Get employee
   * @return employee
  **/
  @ApiModelProperty(value = "")

  @Valid
  public EmployeeType getEmployee() {
    return employee;
  }

  public void setEmployee(EmployeeType employee) {
    this.employee = employee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperEmployeeAllType operEmployeeAllType = (OperEmployeeAllType) o;
    return Objects.equals(this.employee, operEmployeeAllType.employee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperEmployeeAllType {\n");
    
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
