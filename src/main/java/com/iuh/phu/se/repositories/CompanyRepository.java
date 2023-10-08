package com.iuh.phu.se.repositories;

import com.iuh.phu.se.models.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}