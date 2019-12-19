package io.approvalProcess.entity;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class FosterCarer {
	
	@NotNull
	private String serviceType;
	
	@NotNull
	private LocalDate startDate;
	
	@NotNull
	private LocalDate endDate;
	
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

}
