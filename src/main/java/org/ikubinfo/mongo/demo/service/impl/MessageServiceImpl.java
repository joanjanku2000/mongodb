package org.ikubinfo.mongo.demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.ikubinfo.mongo.demo.dto.MessageDto;
import org.ikubinfo.mongo.demo.repo.MessageRepo;
import org.ikubinfo.mongo.demo.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private MessageRepo messageRepo;

    @Override
    public MessageDto createMessage(MessageDto messageDto) {
        return null;
    }

    @Override
    public List<MessageDto> findAll() {
        return null;
    }
}
