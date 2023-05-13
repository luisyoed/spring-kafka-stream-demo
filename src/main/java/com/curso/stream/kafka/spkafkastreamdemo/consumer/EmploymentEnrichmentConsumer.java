package com.curso.stream.kafka.spkafkastreamdemo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.curso.stream.kafka.spkafkastreamdemo.schemas.enriched.EmploymentEnrichedDetail;

@Service
public class EmploymentEnrichmentConsumer {

	static final Logger log = LoggerFactory.getLogger(EmploymentEnrichmentConsumer.class);

	@KafkaListener(topics = "${topic.sink.employment.name}", containerFactory = "kafkaListenerContainerFactory")
	public void read(ConsumerRecord<Long, EmploymentEnrichedDetail> record) {
		log.info("inicia de Consumer");
		Long key = record.key();
		EmploymentEnrichedDetail value = record.value();
		log.info("Employment enriched avro message received for key : {}  value: {}", key, value.toString());
		log.info("Fin de Consumer");
	}
}
