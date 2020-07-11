package com.aiwen;

import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Properties;

public class Config {
    private final String bootstrapServer = "192.168.60.129:9092";
    private final String groupId = "test8";
    private final String autoCommit = "true";
    private final String commitInterval = "1000";
    private final String timeout = "30000";
    private final String offsetReset = "earliest";

    public Config() {}

    public Properties getProperties() {
        Properties props = new Properties();
        props.put("bootstrap.servers", bootstrapServer);
        props.put("group.id", groupId);//消费者的组id
        props.put("enable.auto.commit", autoCommit);
        props.put("auto.commit.interval.ms", commitInterval);
        props.put("session.timeout.ms", timeout);
        props.setProperty("auto.offset.reset", offsetReset);
        props.put("key.deserializer", StringDeserializer.class.getName());
        props.put("value.deserializer", StringDeserializer.class.getName());
        return props;
    }
}
