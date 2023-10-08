package com.iuh.phu.se.repositories;

import com.iuh.phu.se.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}