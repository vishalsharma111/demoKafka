package com.example.demoKafka.controller;

import com.example.demoKafka.service.Producer;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    Producer producer;

    @PostMapping(value = "/post")
    public String sendMessage(@RequestParam ("name") String name){
       return producer.publishToTopic(name);

    }

}
