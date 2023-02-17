package io.bootify.learn_java_server.repos;

import io.bootify.learn_java_server.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, Long> {
}
