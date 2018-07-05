package com.kafka.demo.nativeCode;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;
import java.util.UUID;

public class KafkaProducerDemo {
    public static void main(String[] args) {
        Properties properties=new Properties();
        properties.setProperty("bootstrap.servers","127.0.0.1:9092");  //bootstrap-server
        properties.setProperty("key.serializer", StringSerializer.class.getName());
        properties.setProperty("value.serializer", StringSerializer.class.getName());
        
        //producer config
        
        properties.setProperty("acks","1");//acknowlegment
        properties.setProperty("retries","3");//retry
        properties.setProperty("linger.ms","1");//
        
        
        Producer<String,String> producer=new org.apache.kafka.clients.producer.KafkaProducer<String, String>(properties);
        for (int key=1;key<=10;key++)
        {
            ProducerRecord<String, String> producerRecord =
                    new ProducerRecord<String, String>("DemoTopic", Integer.toString(key), UUID.randomUUID().toString());
            producer.send(producerRecord);
        }
        producer.close();
    }
}
