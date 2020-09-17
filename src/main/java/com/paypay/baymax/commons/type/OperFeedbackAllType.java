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
public class OperFeedbackAllType   {
  @JsonProperty("feedback")
  private FeedbackType feedback = null;

  public OperFeedbackAllType feedback(FeedbackType feedback) {
    this.feedback = feedback;
    return this;
  }

  /**
   * Get feedback
   * @return feedback
  **/
  @ApiModelProperty(value = "")

  @Valid
  public FeedbackType getFeedback() {
    return feedback;
  }

  public void setFeedback(FeedbackType feedback) {
    this.feedback = feedback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperFeedbackAllType operFeedbackAllType = (OperFeedbackAllType) o;
    return Objects.equals(this.feedback, operFeedbackAllType.feedback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperFeedbackAllType {\n");
    
    sb.append("    feedback: ").append(toIndentedString(feedback)).append("\n");
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
