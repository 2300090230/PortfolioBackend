package com.laxman.portfolio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.laxman.portfolio.model.Certifications;

public interface CertificationsRepository extends MongoRepository<Certifications, String> {
	
}