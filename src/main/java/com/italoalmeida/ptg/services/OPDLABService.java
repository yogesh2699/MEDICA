package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.OPDLAB;
import com.italoalmeida.ptg.models.OPDs;

import java.util.List;

public interface OPDLABService {

    public void save(OPDLAB opdlab);

    public List<OPDLAB> findByseat(String username, String lab, String date);

    public List<OPDLAB> saveseats(String username,String lab,String date);

    public void saveopd(String phones,String seatid,String username,String department,String date);

    public List<OPDLAB> findbynew(String username,String lab);

    public List<OPDLAB> findbynew2(String username);

    public List<OPDLAB> findbynew3(String username,String lab,String date);

}
