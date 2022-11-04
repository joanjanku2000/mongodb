package org.ikubinfo.mongo.demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.ikubinfo.mongo.demo.dto.UserDto;
import org.ikubinfo.mongo.demo.mapper.UserMapper;
import org.ikubinfo.mongo.demo.model.MongoUser;
import org.ikubinfo.mongo.demo.repo.UserRepo;
import org.ikubinfo.mongo.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final UserMapper userMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        MongoUser mongoUser = userMapper.userDtoToMongoUser(userDto);
        mongoUser.setCreatedAt(LocalDateTime.now());
        userRepo.save(mongoUser);
        return userMapper.mongoUserToDto(mongoUser);
    }

    @Override
    public List<UserDto> findAll() {
        List<MongoUser> mongoUsersToReturn = new ArrayList<>();
        userRepo.findAll().forEach(mongoUsersToReturn::add);
        return mongoUsersToReturn.stream().map(userMapper::mongoUserToDto).collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        MongoUser mongoUser = userMapper.userDtoToMongoUser(userDto);
        userRepo.save(mongoUser);
        return userMapper.mongoUserToDto(mongoUser);
    }
}
