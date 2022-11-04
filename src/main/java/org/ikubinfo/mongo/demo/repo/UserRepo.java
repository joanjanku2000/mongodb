package org.ikubinfo.mongo.demo.repo;

import org.ikubinfo.mongo.demo.model.MongoUser;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends PagingAndSortingRepository<MongoUser, String> {

    Optional<MongoUser> findByUsername(String username);

    @Query("{$or: [{firstName:  ?0} , {lastName: ?0}, {userName: ?0}]}")
    List<MongoUser> searchUsers(String term);
}
