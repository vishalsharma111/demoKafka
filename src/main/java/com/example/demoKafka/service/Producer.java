package com.example.demoKafka.service;

import com.example.demoKafka.entity.User;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    public static final String topic = "mytopic";

    @Autowired
    private KafkaTemplate<String, User> kafkaTemp;

    public String publishToTopic(String name){
        System.out.println("Publishing to topic : " + topic);
        this.kafkaTemp.send(topic, new User("Peter", "Technology", 20000L));
        return "Published successfully!";
    }
}
