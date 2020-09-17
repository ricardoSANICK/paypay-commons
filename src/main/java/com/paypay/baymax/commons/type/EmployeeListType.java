package com.paypay.baymax.commons.type;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Collection of EmployeeType
 */
@ApiModel(description = "Collection of EmployeeType")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-13T17:05:15.456-05:00[America/Mexico_City]")
public class EmployeeListType   {
  @JsonProperty("employees")
  @Valid
  private List<EmployeeType> employees = null;

  public EmployeeListType employees(List<EmployeeType> employees) {
    this.employees = employees;
    return this;
  }

  public EmployeeListType addEmployeesItem(EmployeeType employeesItem) {
    if (this.employees == null) {
      this.employees = new ArrayList<EmployeeType>();
    }
    this.employees.add(employeesItem);
    return this;
  }

  /**
   * Get employees
   * @return employees
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<EmployeeType> getEmployees() {
    return employees;
  }

  public void setEmployees(List<EmployeeType> employees) {
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
    EmployeeListType employeeListType = (EmployeeListType) o;
    return Objects.equals(this.employees, employeeListType.employees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeListType {\n");
    
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
