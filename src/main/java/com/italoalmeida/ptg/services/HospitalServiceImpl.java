package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.repositories.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HospitalServiceImpl implements HospitalService {

    private HospitalRepository hospitalRepository;

    @Autowired
    public HospitalServiceImpl(HospitalRepository hospitalRepository) {
        this.hospitalRepository = hospitalRepository;
    }

    @Override
    public List<Hospital> findAll() {
        return (List<Hospital>) hospitalRepository.findAll();
    }

    @Override
    public Hospital findByUsername(String Username) {
        Optional<Hospital> result = hospitalRepository.findById(Username);

        Hospital hospital = null;

        if (result.isPresent()) {
            hospital = result.get();
        }
        else {

            throw new RuntimeException("Did not find hospital Username - " + Username);
        }

        return hospital;
    }

    @Override
    public void save(Hospital hospital) {
        hospitalRepository.save(hospital);

    }

    @Override
    public List<Hospital> findBycity(String name) {
        List<Hospital> repo = hospitalRepository.findByCity(name);
        return repo;
    }

    @Override
    public List<Hospital> findBystate(String state) {
        List<Hospital> repo = hospitalRepository.findByState(state);
        return repo;
    }

    @Override
    public List<Hospital> findbygovt() {
        List<Hospital> repo = hospitalRepository.findByGovt();
        return repo;
    }

    @Override
    public List<Hospital> findbypassword(String username,String password) {
        List<Hospital> repo = hospitalRepository.findByPassword(username,password);
        return repo;
    }


}
