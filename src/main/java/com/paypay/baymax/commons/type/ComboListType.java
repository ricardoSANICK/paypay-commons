package com.paypay.baymax.commons.type;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Collection of NewsType
 */
@ApiModel(description = "Collection of NewsType")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-07-21T13:26:21.696-05:00[America/Mexico_City]")
public class ComboListType   {
  @JsonProperty("combo")
  @Valid
  private List<ComboType> combo = null;

  public ComboListType combo(List<ComboType> combo) {
    this.combo = combo;
    return this;
  }

  public ComboListType addComboItem(ComboType comboItem) {
    if (this.combo == null) {
      this.combo = new ArrayList<ComboType>();
    }
    this.combo.add(comboItem);
    return this;
  }

  /**
   * Get combo
   * @return combo
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ComboType> getCombo() {
    return combo;
  }

  public void setCombo(List<ComboType> combo) {
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
    ComboListType comboListType = (ComboListType) o;
    return Objects.equals(this.combo, comboListType.combo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(combo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComboListType {\n");
    
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
