package com.patika.kredinbizdeservice.repository;

import com.patika.kredinbizdeservice.model.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {
}