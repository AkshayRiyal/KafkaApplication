package com.kafka.demo.rest.controller;

import com.kafka.demo.rest.co.EmpCo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka/v1")
public class KafkaController {
@Autowired
    KafkaTemplate<String,EmpCo> kafkaTemplate;
@PostMapping(value = "producer",consumes = "application/json")
 public Boolean SendToKafka(@RequestBody EmpCo empCo)
  {
      kafkaTemplate.send("EmployeeInfo",empCo);
     return true;
  }
    

}
