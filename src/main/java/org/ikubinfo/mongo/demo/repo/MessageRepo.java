package org.ikubinfo.mongo.demo.repo;

import org.ikubinfo.mongo.demo.model.MongoMessage;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface MessageRepo extends PagingAndSortingRepository<MongoMessage,String> {

    @Query("{app_message.user:  ?0}")
    List<MongoMessage> findMessagesOfUser(String username);
}
