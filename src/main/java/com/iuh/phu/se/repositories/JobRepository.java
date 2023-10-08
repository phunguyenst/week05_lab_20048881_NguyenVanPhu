package com.iuh.phu.se.repositories;

import com.iuh.phu.se.models.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}