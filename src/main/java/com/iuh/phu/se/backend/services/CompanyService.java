package com.iuh.phu.se.backend.services;

import com.iuh.phu.se.backend.models.Company;
import com.iuh.phu.se.backend.repositories.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    CompanyRepository companyRepository;

    public boolean add(Company company){
        return companyRepository.save(company).equals(company);
    }
    public boolean addAll(List<Company> list){
        return companyRepository.saveAll(list).equals(list);
    }
    public void delete(long id){
        companyRepository.deleteById(id);
    }
    public Optional<Company> getByID(long id){
        return companyRepository.findById(id);
    }
    public List<Company> getAll(){
        return companyRepository.findAll();
    }
}
