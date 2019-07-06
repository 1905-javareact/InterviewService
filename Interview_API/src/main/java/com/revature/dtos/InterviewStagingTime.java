package com.revature.dtos;

import java.sql.Timestamp;

import javax.persistence.Entity;

import org.springframework.stereotype.Component;

import com.revature.models.Interview;

//@Component
public class InterviewStagingTime {
	
	private Interview interview;
	
	private Timestamp stagingStart;
	
	private String stagingStatus;

	public InterviewStagingTime() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InterviewStagingTime(Interview interview, Timestamp stagingStart, String stagingStatus) {
		super();
		this.interview = interview;
		this.stagingStart = stagingStart;
		this.stagingStatus = stagingStatus;
	}

	public Interview getInterview() {
		return interview;
	}

	public void setInterview(Interview interview) {
		this.interview = interview;
	}

	public Timestamp getStagingStart() {
		return stagingStart;
	}

	public void setStagingStart(Timestamp stagingStart) {
		this.stagingStart = stagingStart;
	}

	public String getStagingStatus() {
		return stagingStatus;
	}

	public void setStagingStatus(String stagingStatus) {
		this.stagingStatus = stagingStatus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((interview == null) ? 0 : interview.hashCode());
		result = prime * result + ((stagingStart == null) ? 0 : stagingStart.hashCode());
		result = prime * result + ((stagingStatus == null) ? 0 : stagingStatus.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InterviewStagingTime other = (InterviewStagingTime) obj;
		if (interview == null) {
			if (other.interview != null)
				return false;
		} else if (!interview.equals(other.interview))
			return false;
		if (stagingStart == null) {
			if (other.stagingStart != null)
				return false;
		} else if (!stagingStart.equals(other.stagingStart))
			return false;
		if (stagingStatus == null) {
			if (other.stagingStatus != null)
				return false;
		} else if (!stagingStatus.equals(other.stagingStatus))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InterviewStagingTime [interview=" + interview + ", stagingStart=" + stagingStart + ", stagingStatus="
				+ stagingStatus + "]";
	}
}
