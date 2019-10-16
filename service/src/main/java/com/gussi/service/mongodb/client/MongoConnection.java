package com.gussi.service.mongodb.client;

import com.gussi.service.mongodb.config.MongoConfig;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class MongoConnection {
    private MongoConfig mongoConfig;

    public MongoClient getMongoClient() {
        return MongoClients.create(
                MongoClientSettings.builder()
                        .applyToClusterSettings(builder -> builder.hosts(Arrays.asList(new ServerAddress(mongoConfig.getHost(), mongoConfig.getPort()))))
                        .build());
    }
}
