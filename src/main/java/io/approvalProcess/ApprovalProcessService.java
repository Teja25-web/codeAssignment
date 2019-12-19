package io.approvalProcess;

import org.springframework.stereotype.Service;

import io.approvalProcess.entity.Adopter;
import io.approvalProcess.entity.FosterCarer;
import io.approvalProcess.vo.ApplicantDetail;

@Service
public class ApprovalProcessService {

	ApplicantDetailsRepository applicantDetails;
	
	public void addDetails(ApplicantDetail details) {
		
		applicantDetails.save(details);
	}

	public void checkForFosterCarerApproval(FosterCarer carer) {

		//call a method to check the overlapping concept
		//this method will contain a call to the database to get the time for a particular applicant
		
		//call a DAO function which will store the service adopted for a particular applicant
		//store the details of the Applicant in a session
		System.out.println("Fostering process");
	}

	public void checkForAdopterApproval(Adopter adopter) {

		//call a DAO function which will store the type of service adopted for a particular applicant
		//assignment of one child per approval
		System.out.println("Adoption Process");
	}

	
	
}
