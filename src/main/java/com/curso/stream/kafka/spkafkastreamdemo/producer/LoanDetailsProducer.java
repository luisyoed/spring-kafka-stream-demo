package com.curso.stream.kafka.spkafkastreamdemo.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import com.curso.stream.kafka.spkafkastreamdemo.schemas.LoanDetail;



@Service
public class LoanDetailsProducer {

	static final Logger log = LoggerFactory.getLogger(LoanDetailsProducer.class);
	
	@Value("${topic.source.name}")
    String topicName;
	
	@Autowired
    private KafkaTemplate<Long, LoanDetail> kafkaTemplate;
	
	
	public void send(LoanDetail loanDetail) {
        ListenableFuture<SendResult<Long, LoanDetail>> future = kafkaTemplate.send(topicName, loanDetail.getLoanId(), loanDetail);
        future.addCallback(new ListenableFutureCallback<SendResult<Long, LoanDetail>>() {
            @Override
            public void onFailure(Throwable ex) {
            	log.info("Message failed to produce");
				log.info("Fin de producer");
            }

            @Override
            public void onSuccess(SendResult<Long, LoanDetail> result) {
            	log.info("Avro message successfully produced");
				log.info("Fin de producer");
            }
        });
    }
}
