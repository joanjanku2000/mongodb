package org.ikubinfo.mongo.demo.service;

import org.ikubinfo.mongo.demo.dto.MessageDto;

import java.util.List;

public interface MessageService {
    MessageDto createMessage(MessageDto messageDto);
    List<MessageDto> findAll();
}
