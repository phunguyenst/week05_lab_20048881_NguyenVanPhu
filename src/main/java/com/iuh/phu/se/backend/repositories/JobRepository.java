package com.iuh.phu.se.backend.repositories;

import com.iuh.phu.se.backend.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface JobRepository extends JpaRepository<Job, Long> {
}