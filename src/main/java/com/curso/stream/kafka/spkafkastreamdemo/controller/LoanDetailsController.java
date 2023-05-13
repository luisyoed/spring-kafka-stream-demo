package com.curso.stream.kafka.spkafkastreamdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.stream.kafka.spkafkastreamdemo.producer.LoanDetailsProducer;
import com.curso.stream.kafka.spkafkastreamdemo.schemas.ApplicantDetail;
import com.curso.stream.kafka.spkafkastreamdemo.schemas.CollateralDetail;
import com.curso.stream.kafka.spkafkastreamdemo.schemas.EmploymentDetail;
import com.curso.stream.kafka.spkafkastreamdemo.schemas.LoanDetail;
import com.curso.stream.kafka.spkafkastreamdemo.vo.LoanDetailRequest;

@RestController
@RequestMapping("/producer")
public class LoanDetailsController {

	static final Logger log = LoggerFactory.getLogger(LoanDetailsController.class);
	
	@Autowired
	LoanDetailsProducer detailsProducer;

	@PostMapping(value = "/publishMessage", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> seandMessage(@RequestBody LoanDetailRequest request) {
		log.info("inicia de Producer");
		LoanDetail loanDetail = new LoanDetail();
		loanDetail.setLoanId(request.getLoanId());
		loanDetail.setBankName(request.getBankName());
		loanDetail.setBranch(request.getBranch());
		loanDetail.setBranchAddress(request.getBranchAddress());
		loanDetail.setLoanAccountNum(request.getLoanAccountNum());
		loanDetail.setLoanApprovalDate(request.getLoanApprovalDate());
		loanDetail.setApprovedLoanAmount(request.getApprovedLoanAmount());
		loanDetail.setRequestedLoanAmount(request.getRequestedLoanAmount());
		loanDetail.setMicrCode(request.getMicrCode());
		EmploymentDetail employmentDetail = new EmploymentDetail(
				request.getApplicantDetail().getEmploymentDetail().getAddress(),
				request.getApplicantDetail().getEmploymentDetail().getEmploymentType(),
				request.getApplicantDetail().getEmploymentDetail().getInHandSalary(),
				request.getApplicantDetail().getEmploymentDetail().getLocation(),
				request.getApplicantDetail().getEmploymentDetail().getNetSalary(),
				request.getApplicantDetail().getEmploymentDetail().getOrganizationName(),
				request.getApplicantDetail().getEmploymentDetail().getPosition());

		ApplicantDetail applicantDetail = new ApplicantDetail(
				request.getApplicantDetail().getFirstName(), 
				request.getApplicantDetail().getLastName(),
				request.getApplicantDetail().getMiddleName(),
				request.getApplicantDetail().getPermanentAddress(),
				request.getApplicantDetail().getCurrentAddress(),
				request.getApplicantDetail().getAge(),
				request.getApplicantDetail().getDateOfBirth(),
				employmentDetail);
		CollateralDetail collateralDetail = new CollateralDetail(
				request.getCollateralDetail().getCollateralDesc(),
				request.getCollateralDetail().getCollateralId(),
				request.getCollateralDetail().getCollateralType(),
				request.getCollateralDetail().getCollateralValue());
		loanDetail.setApplicantDetail(applicantDetail);
		loanDetail.setCollateralDetail(collateralDetail);
		detailsProducer.send(loanDetail);
		return new ResponseEntity<>("LoanId" + request.getLoanId() + " | Nombre" + request.getApplicantDetail().getFirstName(), HttpStatus.OK);

	}
}
