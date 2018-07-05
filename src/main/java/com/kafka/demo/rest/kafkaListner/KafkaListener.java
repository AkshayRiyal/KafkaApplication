package com.kafka.demo.rest.kafkaListner;

import com.kafka.demo.rest.co.EmpCo;
import org.springframework.stereotype.Service;

@Service
public class KafkaListener {
    
    @org.springframework.kafka.annotation.KafkaListener(topics = "EmployeeInfo", groupId = "emp_group",containerFactory = "concurrentKafkaListenerContainerFactory")
    public void employeeConsumer(EmpCo empCo) {
        System.out.println("Consumer Received : " + empCo);
    }
    
    
}
