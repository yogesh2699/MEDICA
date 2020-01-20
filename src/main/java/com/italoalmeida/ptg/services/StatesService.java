package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.States;

import java.util.List;

public interface StatesService {

    public List<States> getAllStates(Integer pageno, Integer pagesize, String states);

    public List<States> findByname(String state);


}
