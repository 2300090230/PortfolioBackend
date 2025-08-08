package com.laxman.portfolio.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.laxman.portfolio.model.Skills;

public interface SkillsRepository extends MongoRepository<Skills, String> {
    Optional<Skills> findBySkillname(String skillname);
    List<Skills> findByCategory(String category);
}