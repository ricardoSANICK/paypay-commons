package com.paypay.baymax.commons.type;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * FeedbackType
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-09-13T17:05:15.456-05:00[America/Mexico_City]")
public class FeedbackType extends AuditType {
	@JsonProperty("id")
	private Long id = null;

	@JsonProperty("description")
	private String description = null;

	@JsonProperty("assigner")
	private EmployeeType assigner = null;

	@JsonProperty("assigned")
	private EmployeeType assigned = null;

	@JsonProperty("review")
	private ReviewType review = null;

	public FeedbackType id(Long id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FeedbackType description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Get description
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "")

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public FeedbackType assigner(EmployeeType assigner) {
		this.assigner = assigner;
		return this;
	}

	/**
	 * Get assigner
	 * 
	 * @return assigner
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public EmployeeType getAssigner() {
		return assigner;
	}

	public void setAssigner(EmployeeType assigner) {
		this.assigner = assigner;
	}

	public FeedbackType assigned(EmployeeType assigned) {
		this.assigned = assigned;
		return this;
	}

	/**
	 * Get assigned
	 * 
	 * @return assigned
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public EmployeeType getAssigned() {
		return assigned;
	}

	public void setAssigned(EmployeeType assigned) {
		this.assigned = assigned;
	}

	public FeedbackType review(ReviewType review) {
		this.review = review;
		return this;
	}

	/**
	 * Get review
	 * 
	 * @return review
	 **/
	@ApiModelProperty(value = "")

	@Valid
	public ReviewType getReview() {
		return review;
	}

	public void setReview(ReviewType review) {
		this.review = review;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FeedbackType feedbackType = (FeedbackType) o;
		return Objects.equals(this.id, feedbackType.id) && Objects.equals(this.description, feedbackType.description)
				&& Objects.equals(this.assigner, feedbackType.assigner)
				&& Objects.equals(this.assigned, feedbackType.assigned)
				&& Objects.equals(this.review, feedbackType.review) && super.equals(o);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, description, assigner, assigned, review, super.hashCode());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FeedbackType {\n");
		sb.append("    ").append(toIndentedString(super.toString())).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    assigner: ").append(toIndentedString(assigner)).append("\n");
		sb.append("    assigned: ").append(toIndentedString(assigned)).append("\n");
		sb.append("    review: ").append(toIndentedString(review)).append("\n");
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
