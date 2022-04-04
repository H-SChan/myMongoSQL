package com.example.multiple_datebases2.repository.mongo;

import com.example.multiple_datebases2.model.mongo.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {
}
