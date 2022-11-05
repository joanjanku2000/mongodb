package org.ikubinfo.mongo.demo.model;

public abstract class BaseDocument {
    private String id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
