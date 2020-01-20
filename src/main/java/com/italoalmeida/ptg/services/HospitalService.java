package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.Hospital;

import java.util.List;

public interface HospitalService  {

    public List<Hospital> findAll();

    public Hospital findByUsername(String Username);

    public void save(Hospital hospital);

    public List<Hospital> findBycity(String name);

    public List<Hospital> findBystate(String state);

    public List<Hospital> findbygovt();

    public List<Hospital> findbypassword(String username,String password);
}
