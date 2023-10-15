package com.iuh.phu.se.backend.services;

import com.iuh.phu.se.backend.models.Candidate;
import com.iuh.phu.se.backend.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CandidateServices {
    @Autowired
    CandidateRepository candidateRepository;
    public boolean add(Candidate candidate){
        return candidateRepository.save(candidate).equals(candidate);
    }
    public boolean addAll(List<Candidate> lstCan){
        return candidateRepository.saveAll(lstCan).equals(lstCan);
    }
    public void delete(long id){
        candidateRepository.deleteById(id);
    }
    public Optional<Candidate> getByID(long id){
        return candidateRepository.findById(id);
    }
    public Page<Candidate> getAll(int pageNo, int pageSize, String sortBy, String sortDirection){
        Sort sort = Sort.by(Sort.Direction.fromString(sortDirection), sortBy);
        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
        return candidateRepository.findAll(pageable);
    }
    public Page<Candidate> findPaginated(Pageable pageable){
        int pageSize = pageable.getPageSize();
        int currentPage = pageable.getPageNumber();
        int startItem = currentPage * pageSize;
        List<Candidate> list;
        List<Candidate> candidates = candidateRepository.findAll();

        if (candidates.size() < startItem) {
            list = Collections.emptyList();
        } else {
            int toIndex = Math.min(startItem + pageSize, candidates.size());
            list = candidates.subList(startItem, toIndex);
        }

        Page<Candidate> candidatePage
                = new PageImpl<>(list, PageRequest.of(currentPage, pageSize), candidates.size());

        return candidatePage;
    }

}
