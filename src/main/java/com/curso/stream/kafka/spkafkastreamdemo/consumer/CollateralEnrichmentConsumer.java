package com.curso.stream.kafka.spkafkastreamdemo.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.curso.stream.kafka.spkafkastreamdemo.schemas.enriched.CollateralEnrichedDetail;

@Service
public class CollateralEnrichmentConsumer {
	static final Logger log = LoggerFactory.getLogger(CollateralEnrichmentConsumer.class);

	@KafkaListener(topics = "${topic.sink.collateral.name}", containerFactory = "kafkaListenerContainerFactory")
	public void read(ConsumerRecord<Long, CollateralEnrichedDetail> record) {
		log.info("inicia de Consumer");
		Long key = record.key();
		CollateralEnrichedDetail value = record.value();
		log.info("Collateral enriched avro message received for key : {}  value: {}", key, value.toString());
		log.info("Fin de Consumer");
	}
}