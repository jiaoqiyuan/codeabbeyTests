package com.aiwen;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;

import java.time.Duration;
import java.util.*;

public class KafkaTest {
    public static void main(String[] args) {
        Config config = new Config();

        Properties properties = config.getProperties();

        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
        //订阅主题列表topic
        consumer.subscribe(Arrays.asList("rrc11_metadata"));

        List<String> elemList = new ArrayList<>();
        boolean flag = true;
        int count = 0;
        while (flag) {
            Duration duration = Duration.ofSeconds(1);
            ConsumerRecords<String, String> records = consumer.poll(duration);
            System.out.println("consumming..." + records.count());
            System.out.println(elemList.size());
            for (ConsumerRecord<String, String> record : records) {
                elemList.add(record.value());
                // B|1593475200|13760|198.32.160.152|8.29.79.0/24|198.32.160.152|13760 36730|36730|||
                String value = record.value();
                String type = value.split("|")[0];
                if (type.compareTo("E") == 0) {
                    // 83651544 8368553 92020821
                    System.out.printf("offset = %d \n", record.offset());
                    flag = false;
                    break;
                }
                count++;
            }
        }
        System.out.println("count = " + count);
        consumer.close();
    }
}
