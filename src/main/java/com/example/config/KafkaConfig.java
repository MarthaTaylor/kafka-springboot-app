package com.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic myTopic(){
        return TopicBuilder.name("my-topic")
                .partitions(1)
                .replicas(1)
                .build();
    }

}

//What This Does
//✅ Defines a Kafka topic (my-topic).
//        ✅ Uses Spring Boot's @Configuration to auto-wire the Kafka setup.
//        ✅ Spring Boot will automatically handle Kafka producer/consumer setup.
