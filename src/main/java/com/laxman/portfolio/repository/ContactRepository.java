package com.laxman.portfolio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.laxman.portfolio.model.Contact;

@Repository
public interface ContactRepository extends MongoRepository<Contact, String> {

}
