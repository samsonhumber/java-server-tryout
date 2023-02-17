package io.bootify.learn_java_server.repos;

import io.bootify.learn_java_server.domain.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ReservationRepository extends MongoRepository<Reservation, Long> {
}
