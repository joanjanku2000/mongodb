package org.ikubinfo.mongo.demo.mapper;

import org.ikubinfo.mongo.demo.dto.UserDto;
import org.ikubinfo.mongo.demo.model.MongoUser;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper {

    MongoUser userDtoToMongoUser(UserDto userDto);

    UserDto mongoUserToDto(MongoUser userDto);
}
