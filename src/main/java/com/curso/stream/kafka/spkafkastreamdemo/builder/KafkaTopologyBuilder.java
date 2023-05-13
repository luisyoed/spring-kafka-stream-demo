package com.curso.stream.kafka.spkafkastreamdemo.builder;

import javax.annotation.PostConstruct;

import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.Topology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;

import com.curso.stream.kafka.spkafkastreamdemo.processor.CollateralEnrichedProcessor;
import com.curso.stream.kafka.spkafkastreamdemo.processor.EmploymentEnrichedProcessor;
import com.curso.stream.kafka.spkafkastreamdemo.schemas.LoanDetail;
import com.curso.stream.kafka.spkafkastreamdemo.schemas.enriched.CollateralEnrichedDetail;
import com.curso.stream.kafka.spkafkastreamdemo.schemas.enriched.EmploymentEnrichedDetail;
import com.curso.stream.kafka.spkafkastreamdemo.topic.Topic;

@Service
public class KafkaTopologyBuilder {

    @Autowired
    private StreamsBuilder streamsBuilder;

    @Autowired
    private KafkaProperties kafkaProperties;
    @Autowired
    private Topic<Long, LoanDetail> loanDetailTopic;
    @Autowired
    private Topic<Long, CollateralEnrichedDetail> collateralEnrichedDetailTopic;
    @Autowired
    private Topic<Long, EmploymentEnrichedDetail> employmentEnrichedDetailTopic;

    @PostConstruct
    public void build() {
        Topology topology = streamsBuilder.build();
        topology.addSource("SOURCE", loanDetailTopic.getKeySerde().deserializer(), loanDetailTopic.getValueSerde().deserializer(), loanDetailTopic.getTopicName()).
                addProcessor("COLLATERAL", CollateralEnrichedProcessor::new, "SOURCE").
                addProcessor("EMPLOYMENT", EmploymentEnrichedProcessor::new, "SOURCE").
                addSink("COLLATERAL-SINK", collateralEnrichedDetailTopic.getTopicName(), collateralEnrichedDetailTopic.getKeySerde().serializer(), collateralEnrichedDetailTopic.getValueSerde().serializer(), "COLLATERAL")
                .addSink("EMPLOYMENT-SINK", employmentEnrichedDetailTopic.getTopicName(), employmentEnrichedDetailTopic.getKeySerde().serializer(), employmentEnrichedDetailTopic.getValueSerde().serializer(), "EMPLOYMENT");

        KafkaStreams streaming = new KafkaStreams(topology, new StreamsConfig(kafkaProperties.buildStreamsProperties()));
        streaming.start();
    }
}
