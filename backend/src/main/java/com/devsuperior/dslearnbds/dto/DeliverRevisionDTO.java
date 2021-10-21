package com.devsuperior.dslearnbds.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.entities.Enrollment;
import com.devsuperior.dslearnbds.entities.Lesson;
import com.devsuperior.dslearnbds.entities.enums.DeliverStatus;

public class DeliverRevisionDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private DeliverStatus status;
	private String feedback;
	private Integer correctCount;
	
	public DeliverRevisionDTO() {
	}

	public DeliverRevisionDTO(DeliverStatus status, String feedback, Integer correctCount) {
		this.status = status;
		this.feedback = feedback;
		this.correctCount = correctCount;
	}

	public DeliverStatus getStatus() {
		return status;
	}

	public void setStatus(DeliverStatus status) {
		this.status = status;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public Integer getCorrectCount() {
		return correctCount;
	}

	public void setCorrectCount(Integer correctCount) {
		this.correctCount = correctCount;
	}
}
