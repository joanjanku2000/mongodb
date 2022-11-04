package org.ikubinfo.mongo.demo.service;

import org.ikubinfo.mongo.demo.dto.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);
    List<UserDto> findAll();

    UserDto updateUser(UserDto userDto);
}
