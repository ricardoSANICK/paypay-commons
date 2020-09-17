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
 * Collection of ReviewType
 */
@ApiModel(description = "Collection of ReviewType")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-13T17:05:15.456-05:00[America/Mexico_City]")
public class ReviewListType   {
  @JsonProperty("reviews")
  @Valid
  private List<ReviewType> reviews = null;

  public ReviewListType reviews(List<ReviewType> reviews) {
    this.reviews = reviews;
    return this;
  }

  public ReviewListType addReviewsItem(ReviewType reviewsItem) {
    if (this.reviews == null) {
      this.reviews = new ArrayList<ReviewType>();
    }
    this.reviews.add(reviewsItem);
    return this;
  }

  /**
   * Get reviews
   * @return reviews
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<ReviewType> getReviews() {
    return reviews;
  }

  public void setReviews(List<ReviewType> reviews) {
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
    ReviewListType reviewListType = (ReviewListType) o;
    return Objects.equals(this.reviews, reviewListType.reviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reviews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReviewListType {\n");
    
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
