package io.bootify.learn_java_server.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Getter
@Setter
public class PrimarySequence {

    @Id
    private String id;

    private long seq;

}
