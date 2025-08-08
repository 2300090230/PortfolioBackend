package com.laxman.portfolio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.laxman.portfolio.model.Message;

@Repository
public interface MessageRepository  extends MongoRepository<Message, String>{

}
