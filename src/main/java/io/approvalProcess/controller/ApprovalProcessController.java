package io.approvalProcess.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.approvalProcess.ApprovalProcessService;
import io.approvalProcess.entity.Adopter;
import io.approvalProcess.entity.FosterCarer;
import io.approvalProcess.vo.ApplicantDetail;

@RestController
@RequestMapping("/rest/approvals")
public class ApprovalProcessController {

	@Autowired
	ApprovalProcessService service;
	
	@PostMapping("/userDetails")
	public void saveUserDeatils(@RequestBody @Valid ApplicantDetail details) {
		
		service.addDetails(details);
	}
	
	//Details will be filled by user for the term period and type of approval required.
	
	@RequestMapping("/fosterCarer")
	public void applyAsFosterCarer(@RequestBody FosterCarer carer) {
		service.checkForFosterCarerApproval(carer);
	}
	
	@RequestMapping("/fosterCarer")
	public void applyAsAdopter(@RequestBody Adopter adopter) {
		service.checkForAdopterApproval(adopter);
	}
}
