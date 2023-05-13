package com.curso.stream.kafka.spkafkastreamdemo.vo;

import java.math.BigDecimal;

public class LoanDetailRequest {

	private Long loanId;
	private String bankName;
	private String branch;
	private String micrCode;
	private String branchAddress;
	private Long loanAccountNum;
	private BigDecimal requestedLoanAmount;
	private BigDecimal approvedLoanAmount;
	private String loanApprovalDate;

	private ApplicantDetailVO applicantDetail;
	private CollateralDetailVO collateralDetail;

	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getMicrCode() {
		return micrCode;
	}

	public void setMicrCode(String micrCode) {
		this.micrCode = micrCode;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public Long getLoanAccountNum() {
		return loanAccountNum;
	}

	public void setLoanAccountNum(Long loanAccountNum) {
		this.loanAccountNum = loanAccountNum;
	}

	public BigDecimal getRequestedLoanAmount() {
		return requestedLoanAmount;
	}

	public void setRequestedLoanAmount(BigDecimal requestedLoanAmount) {
		this.requestedLoanAmount = requestedLoanAmount;
	}

	public BigDecimal getApprovedLoanAmount() {
		return approvedLoanAmount;
	}

	public void setApprovedLoanAmount(BigDecimal approvedLoanAmount) {
		this.approvedLoanAmount = approvedLoanAmount;
	}

	public String getLoanApprovalDate() {
		return loanApprovalDate;
	}

	public void setLoanApprovalDate(String loanApprovalDate) {
		this.loanApprovalDate = loanApprovalDate;
	}

	public ApplicantDetailVO getApplicantDetail() {
		return applicantDetail;
	}

	public void setApplicantDetail(ApplicantDetailVO applicantDetail) {
		this.applicantDetail = applicantDetail;
	}

	public CollateralDetailVO getCollateralDetail() {
		return collateralDetail;
	}

	public void setCollateralDetail(CollateralDetailVO collateralDetail) {
		this.collateralDetail = collateralDetail;
	}

}
