package com.curso.stream.kafka.spkafkastreamdemo.processor;

import org.apache.kafka.streams.processor.AbstractProcessor;
import org.springframework.stereotype.Service;
import com.curso.stream.kafka.spkafkastreamdemo.schemas.LoanDetail;
import com.curso.stream.kafka.spkafkastreamdemo.schemas.enriched.CollateralEnrichedDetail;

@Service
public class CollateralEnrichedProcessor extends AbstractProcessor<Long, LoanDetail> {
	
	@Override
	public void process(Long key, LoanDetail loanDetail) {
		CollateralEnrichedDetail collateralEnrichedDetail = new CollateralEnrichedDetail();
        collateralEnrichedDetail.setCollateralId(loanDetail.getCollateralDetail().getCollateralId());
        collateralEnrichedDetail.setCollateralDesc(loanDetail.getCollateralDetail().getCollateralDesc());
        collateralEnrichedDetail.setCollateralType(loanDetail.getCollateralDetail().getCollateralType());
        collateralEnrichedDetail.setCollateralValue(loanDetail.getCollateralDetail().getCollateralValue());
        collateralEnrichedDetail.setFirstName(loanDetail.getApplicantDetail().getFirstName());
        collateralEnrichedDetail.setMiddleName(loanDetail.getApplicantDetail().getMiddleName());
        collateralEnrichedDetail.setLastName(loanDetail.getApplicantDetail().getLastName());
        collateralEnrichedDetail.setApprovedLoanAmount(loanDetail.getApprovedLoanAmount());
        collateralEnrichedDetail.setLoanAccountNum(loanDetail.getLoanAccountNum());
        collateralEnrichedDetail.setLoanApprovalDate(loanDetail.getLoanApprovalDate());
        collateralEnrichedDetail.setLoanId(loanDetail.getLoanId());

        this.context().forward(collateralEnrichedDetail.getLoanId(),collateralEnrichedDetail);
        this.context().commit();

	}

}
