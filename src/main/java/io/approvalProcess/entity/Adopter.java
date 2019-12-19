package io.approvalProcess.entity;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class Adopter {

	@NotNull
	private String serviceType;
	
	@NotNull
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	@NotNull
	private String childName;
	
}
