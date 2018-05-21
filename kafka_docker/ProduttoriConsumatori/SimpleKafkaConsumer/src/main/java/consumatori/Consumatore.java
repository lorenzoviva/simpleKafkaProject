package consumatori;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class Consumatore {
	
	public static void main(String[] args) {
		 Properties props = new Properties();
	        props.put("bootstrap.servers", "localhost:9092");
	        props.put("group.id", "triciclo");
	        
	        //using auto commit
	        props.put("enable.auto.commit", "true");
	 
	        //string inputs and outputs
	        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
	        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
	 
	        //kafka consumer object
	        KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(props);
	 
	        //subscribe to topic
	        consumer.subscribe(Arrays.asList("topic"));
	 
	        //infinite poll loop
	        while (true) {
	            ConsumerRecords<String, String> records = consumer.poll(100);
	            for (ConsumerRecord<String, String> record : records)
	                System.out.printf("offset = %d, key = %s, value = %s\n", record.offset(), record.key(), record.value());
	        }

	}

}
