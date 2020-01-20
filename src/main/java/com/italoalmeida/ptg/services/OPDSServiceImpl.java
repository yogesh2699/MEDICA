package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.models.OPDs;
import com.italoalmeida.ptg.repositories.OPDSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OPDSServiceImpl implements OPDSService {

    private OPDSRepository opdsRepository;

    @Autowired
    public OPDSServiceImpl(OPDSRepository opdsRepository) {
        this.opdsRepository = opdsRepository;
    }

    @Override
    public void save(OPDs opDs) {
        opdsRepository.save(opDs);
    }

    @Override
    public List<OPDs> findByseat(String username,String department,String date) {
        List<OPDs> repo = opdsRepository.findBySeats(username,department,date);

        return repo;
    }

    @Override
    public List<OPDs> saveseats(String username,String department,String date) {
        List<OPDs> repo = null;
                repo = opdsRepository.findBySeats(username,department,date);
        if(repo!=null) {
            opdsRepository.setOPDsSeatsByUsername(username,department,date);
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
    public List<OPDs> findbynew(String username, String department) {
        List<OPDs> repo = null;
        repo = opdsRepository.findByseat2(username,department);
        return repo;
    }

    @Override
    public List<OPDs> findbynew2(String username) {
        List<OPDs> repo = null;
        repo = opdsRepository.findByseat3(username);
        return repo;
    }

    @Override
    public List<OPDs> findbynew3(String username, String department, String date) {
        List<OPDs> repo = null;
        repo = opdsRepository.findByseat4(username,department,date);
        return repo;
    }


}
