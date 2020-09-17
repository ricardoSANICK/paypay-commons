package com.paypay.baymax.commons.type;

import java.util.Date;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-06-06T00:47:41.129-05:00[America/Mexico_City]")
public class AuditType   {
  @JsonProperty("recordDate")
  private Date recordDate = null;

  @JsonProperty("updateDate")
  private Date updateDate = null;

  @JsonProperty("recordUsername")
  private String recordUsername = null;

  @JsonProperty("updateUsername")
  private String updateUsername = null;

  @JsonProperty("status")
  private Boolean status = null;

  public AuditType recordDate(Date recordDate) {
    this.recordDate = recordDate;
    return this;
  }

  /**
   * Get recordDate
   * @return recordDate
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Date getRecordDate() {
    return recordDate;
  }

  public void setRecordDate(Date recordDate) {
    this.recordDate = recordDate;
  }

  public AuditType updateDate(Date updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
  **/
  @ApiModelProperty(value = "")

  @Valid
  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public AuditType recordUsername(String recordUsername) {
    this.recordUsername = recordUsername;
    return this;
  }

  /**
   * Get recordUsername
   * @return recordUsername
  **/
  @ApiModelProperty(value = "")

  public String getRecordUsername() {
    return recordUsername;
  }

  public void setRecordUsername(String recordUsername) {
    this.recordUsername = recordUsername;
  }

  public AuditType updateUsername(String updateUsername) {
    this.updateUsername = updateUsername;
    return this;
  }

  /**
   * Get updateUsername
   * @return updateUsername
  **/
  @ApiModelProperty(value = "")

  public String getUpdateUsername() {
    return updateUsername;
  }

  public void setUpdateUsername(String updateUsername) {
    this.updateUsername = updateUsername;
  }

  public AuditType status(Boolean status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")

  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditType auditType = (AuditType) o;
    return Objects.equals(this.recordDate, auditType.recordDate) &&
        Objects.equals(this.updateDate, auditType.updateDate) &&
        Objects.equals(this.recordUsername, auditType.recordUsername) &&
        Objects.equals(this.updateUsername, auditType.updateUsername) &&
        Objects.equals(this.status, auditType.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recordDate, updateDate, recordUsername, updateUsername, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditType {\n");
    
    sb.append("    recordDate: ").append(toIndentedString(recordDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    recordUsername: ").append(toIndentedString(recordUsername)).append("\n");
    sb.append("    updateUsername: ").append(toIndentedString(updateUsername)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
