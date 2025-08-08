package com.laxman.portfolio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.laxman.portfolio.model.Admin;

@Repository
public interface AdminRepository extends MongoRepository<Admin, String> {
	public Admin findByUsernameAndPassword(String username, String password);

	public Admin findByUsername(String username); // Added for password update
}
