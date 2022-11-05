package org.ikubinfo.mongo.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "app_user")
public class MongoUser  extends BaseDocument{
    private String name;
    private String lastName;
    private String username;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM=dd'T'HH:mm")
    private LocalDateTime createdAt;
    private List<MongoUser> friends;

    public MongoUser() {
        super();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<MongoUser> getFriends() {
        return friends;
    }

    public void setFriends(List<MongoUser> friends) {
        this.friends = friends;
    }
}
