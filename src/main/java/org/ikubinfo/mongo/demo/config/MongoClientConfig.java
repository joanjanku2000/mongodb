package org.ikubinfo.mongo.demo.config;

import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Collections;

@Configuration
@EnableMongoRepositories(basePackages = "org.ikubinfo.mongo.demo.repo")
public class MongoClientConfig extends AbstractMongoClientConfiguration {
    @Override
    protected String getDatabaseName() {
        return "demo";
    }

    @Override
    protected void configureClientSettings(MongoClientSettings.Builder builder) {
        builder.applyToClusterSettings(settings -> settings.hosts(Collections.singletonList(new ServerAddress("localhost", 27017))));
    }
}
