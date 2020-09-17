package com.paypay.baymax.commons.type;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Multiple reviews as a list.
 */
@ApiModel(description = "Multiple reviews as a list.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-13T17:05:15.456-05:00[America/Mexico_City]")
public class OperReviewListAllType   {
  @JsonProperty("reviews")
  private ReviewListType reviews = null;

  public OperReviewListAllType reviews(ReviewListType reviews) {
    this.reviews = reviews;
    return this;
  }

  /**
   * Get reviews
   * @return reviews
  **/
  @ApiModelProperty(value = "")

  @Valid
  public ReviewListType getReviews() {
    return reviews;
  }

  public void setReviews(ReviewListType reviews) {
    this.reviews = reviews;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperReviewListAllType operReviewListAllType = (OperReviewListAllType) o;
    return Objects.equals(this.reviews, operReviewListAllType.reviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperReviewListAllType {\n");
    
    sb.append("    reviews: ").append(toIndentedString(reviews)).append("\n");
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
