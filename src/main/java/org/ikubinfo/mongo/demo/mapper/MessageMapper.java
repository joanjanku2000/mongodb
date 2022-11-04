package org.ikubinfo.mongo.demo.mapper;

import org.ikubinfo.mongo.demo.dto.MessageDto;
import org.ikubinfo.mongo.demo.model.MongoMessage;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MessageMapper {
    MongoMessage toMongoMessage(MessageDto messageDto);

    MessageDto toMessageDto(MongoMessage mongoMessage);
}
