package com.patika.kredinbizdeservice.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "logs")
@Getter
@Setter
public class Log {

    @Id
    private String id;

    private String message;

}