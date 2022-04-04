package com.example.multiple_datebases2.model.mongo;

import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Getter
@Document("log")
public class Log {
    @Id
    private String id;

    private String title;
    private String context;

    public Log(String title, String context) {
        this.title = title;
        this.context = context;
    }
}
