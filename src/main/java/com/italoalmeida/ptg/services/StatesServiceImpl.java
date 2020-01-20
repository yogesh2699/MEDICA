package com.italoalmeida.ptg.services;


import com.italoalmeida.ptg.models.States;
import com.italoalmeida.ptg.repositories.StatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatesServiceImpl implements StatesService {

    @Autowired
    StatesRepository statesRepository;


    @Override
    public List<States> getAllStates(Integer pageno, Integer pagesize, String states) {
        Pageable paging = PageRequest.of(pageno, pageno, Sort.by(states));

        Page<States> pagedResult = (Page<States>) statesRepository.findAll(paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<States>();
        }

    }

    @Override
    public List<States> findByname(String state) {
        List<States> repo = statesRepository.findByName(state);
        return  repo;
    }
}
