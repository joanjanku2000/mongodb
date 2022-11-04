package org.ikubinfo.mongo.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


@Document(collection = "app_message")
public class MongoMessage {
    private String id;
    private String message;
    private MessageUser user;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM=dd'T'HH:mm")
    private LocalDateTime createdAt;

    public MongoMessage() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageUser getUser() {
        return user;
    }

    public void setUser(MessageUser user) {
        this.user = user;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}


