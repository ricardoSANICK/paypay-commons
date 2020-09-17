package com.paypay.baymax.commons.type;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Multiple feedbacks as a list.
 */
@ApiModel(description = "Multiple feedbacks as a list.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-13T17:05:15.456-05:00[America/Mexico_City]")
public class OperFeedbackListAllType   {
  @JsonProperty("feedbacks")
  private FeedbackListType feedbacks = null;

  public OperFeedbackListAllType feedbacks(FeedbackListType feedbacks) {
    this.feedbacks = feedbacks;
    return this;
  }

  /**
   * Get feedbacks
   * @return feedbacks
  **/
  @ApiModelProperty(value = "")

  @Valid
  public FeedbackListType getFeedbacks() {
    return feedbacks;
  }

  public void setFeedbacks(FeedbackListType feedbacks) {
    this.feedbacks = feedbacks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperFeedbackListAllType operFeedbackListAllType = (OperFeedbackListAllType) o;
    return Objects.equals(this.feedbacks, operFeedbackListAllType.feedbacks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedbacks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperFeedbackListAllType {\n");
    
    sb.append("    feedbacks: ").append(toIndentedString(feedbacks)).append("\n");
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
