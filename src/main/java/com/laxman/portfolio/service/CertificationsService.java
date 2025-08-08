package com.laxman.portfolio.service;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.laxman.portfolio.model.Certifications;

public interface CertificationsService {
	
    void deleteCertificate(String id);
    List<Certifications> viewAllCertificates();
	Certifications addCertificate(Certifications certification, MultipartFile image) throws IOException;
	Certifications updateCertificate(String id, Certifications certification) throws IOException;
	public long countCertifications();
}