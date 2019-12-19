package io.approvalProcess;

import org.springframework.data.jpa.repository.JpaRepository;

import io.approvalProcess.vo.ApplicantDetail;

public interface ApplicantDetailsRepository extends JpaRepository<ApplicantDetail, Long> {

}
