package com.laxman.portfolio.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.laxman.portfolio.model.Projects;

@Repository
public interface ProjectsRepository  extends MongoRepository<Projects, String>{

}
