package com.paypay.baymax.commons.type;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Multiple news as a list.
 */
@ApiModel(description = "Multiple news as a list.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-13T17:05:15.456-05:00[America/Mexico_City]")
public class OperComboListAllType   {
  @JsonProperty("combo")
  private ComboListType combo = null;

  public OperComboListAllType combo(ComboListType combo) {
    this.combo = combo;
    return this;
  }

  /**
   * Get combo
   * @return combo
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ComboListType getCombo() {
    return combo;
  }

  public void setCombo(ComboListType combo) {
    this.combo = combo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperComboListAllType operComboListAllType = (OperComboListAllType) o;
    return Objects.equals(this.combo, operComboListAllType.combo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperComboListAllType {\n");
    
    sb.append("    combo: ").append(toIndentedString(combo)).append("\n");
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
