package com.iuh.phu.se.backend.services;

import com.iuh.phu.se.backend.models.Address;
import com.iuh.phu.se.backend.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;

    public boolean add(Address address){
        return addressRepository.save(address).equals(address);
    }
    public boolean addAll(List<Address> lstAdd){
        return addressRepository.saveAll(lstAdd).equals(lstAdd);
    }
    public void delete(long id){
        addressRepository.deleteById(id);
    }
    public Optional<Address> getByID(long id){
        return addressRepository.findById(id);
    }
    public List<Address> getAll(){
        return addressRepository.findAll();
    }
}
