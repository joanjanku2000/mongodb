package org.ikubinfo.mongo.demo.dto;

public class MessageDto extends BaseDto {
    private String message;
    private UserDto user;

    public MessageDto() {
        super();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }


}
