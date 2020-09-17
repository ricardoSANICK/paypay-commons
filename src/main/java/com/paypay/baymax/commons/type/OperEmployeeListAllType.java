package com.paypay.baymax.commons.type;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Multiple employees as a list.
 */
@ApiModel(description = "Multiple employees as a list.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-13T17:05:15.456-05:00[America/Mexico_City]")
public class OperEmployeeListAllType   {
  @JsonProperty("employees")
  private EmployeeListType employees = null;

  public OperEmployeeListAllType employees(EmployeeListType employees) {
    this.employees = employees;
    return this;
  }

  /**
   * Get employees
   * @return employees
  **/
  @ApiModelProperty(value = "")

  @Valid
  public EmployeeListType getEmployees() {
    return employees;
  }

  public void setEmployees(EmployeeListType employees) {
    this.employees = employees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperEmployeeListAllType operEmployeeListAllType = (OperEmployeeListAllType) o;
    return Objects.equals(this.employees, operEmployeeListAllType.employees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperEmployeeListAllType {\n");
    
    sb.append("    employees: ").append(toIndentedString(employees)).append("\n");
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
