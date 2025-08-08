package com.laxman.portfolio.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.laxman.portfolio.model.Projects;

public interface ProjectService {
	

	Projects addProject(Projects pro , MultipartFile image) throws IOException;
	List<Projects> viewAllProjects();
	Projects updateProject(String id,Projects project) throws IOException;
	void deleteProject(String id);
	long countProjects();

}
