package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.OPDLAB;
import com.italoalmeida.ptg.models.OPDs;
import com.italoalmeida.ptg.repositories.OPDLABRepository;
import com.italoalmeida.ptg.repositories.OPDSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OPDLABServiceImpl implements OPDLABService {

    private OPDLABRepository opdlabRepository;

    @Autowired
    public OPDLABServiceImpl(OPDLABRepository opdlabRepository) {
        this.opdlabRepository = opdlabRepository;
    }

    @Override
    public void save(OPDLAB opdlab) {
        opdlabRepository.save(opdlab);
    }

    @Override
    public List<OPDLAB> findByseat(String username, String lab, String date) {
        List<OPDLAB> repo = opdlabRepository.method1(username,lab,date);
        return repo;
    }

    @Override
    public List<OPDLAB> saveseats(String username, String lab, String date) {


        List<OPDLAB> repo = null;
        repo = opdlabRepository.method1(username,lab,date);
        if(repo!=null) {
            opdlabRepository.method2(username,lab,date);
        }
        else{
            System.out.println("Nothing");
        }
        return repo;


    }

    @Override
    public void saveopd(String phones, String seatid, String username, String department, String date) {

    }

    @Override
    public List<OPDLAB> findbynew(String username, String lab) {
        List<OPDLAB> repo = null;
        repo = opdlabRepository.method3(username,lab);
        return repo;
    }

    @Override
    public List<OPDLAB> findbynew2(String username) {
        List<OPDLAB> repo = null;
        repo = opdlabRepository.method4(username);
        return repo;
    }

    @Override
    public List<OPDLAB> findbynew3(String username, String lab, String date) {
        List<OPDLAB> repo = null;
        repo = opdlabRepository.method5(username, lab, date);
        return repo;
    }
}
