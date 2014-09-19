package com.test;

import java.util.Properties;

import kafka.javaapi.producer.Producer; 
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

public class TestProducer {
	 public static void main(String[] args) {   
         Properties props = new Properties();   
         props.setProperty("metadata.broker.list","192.168.145.23:9092");   //can not use hostname 
         props.setProperty("serializer.class","kafka.serializer.StringEncoder");   
         props.put("request.required.acks","1");   
         ProducerConfig config = new ProducerConfig(props);   
         Producer<String, String> producer = new Producer<String, String>(config);   
         KeyedMessage<String, String> data = new KeyedMessage<String, String>("mykafka","test-kafka");   
         try {   
             int i =1; 
             while(i < 1000){ 
                 System.out.println(data);
                 producer.send(data);   
             } 
         } catch (Exception e) {   
             e.printStackTrace();   
         }   
         producer.close();   
     }    
}
