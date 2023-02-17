package io.bootify.learn_java_server.repos;

import io.bootify.learn_java_server.domain.Reservation;
import io.bootify.learn_java_server.service.PrimarySequenceService;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;


@Component
public class ReservationListener extends AbstractMongoEventListener<Reservation> {

    private final PrimarySequenceService primarySequenceService;

    public ReservationListener(final PrimarySequenceService primarySequenceService) {
        this.primarySequenceService = primarySequenceService;
    }

    @Override
    public void onBeforeConvert(final BeforeConvertEvent<Reservation> event) {
        if (event.getSource().getId() == null) {
            event.getSource().setId(primarySequenceService.getNextValue());
        }
    }

}
