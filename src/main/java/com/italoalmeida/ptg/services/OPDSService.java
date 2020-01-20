package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.models.OPDs;

import java.util.List;

public interface OPDSService {

    public void save(OPDs opDs);

    public List<OPDs> findByseat(String username,String department,String date);

    public List<OPDs> saveseats(String username,String department,String date);

    public void saveopd(String phones,String seatid,String username,String department,String date);

    public List<OPDs> findbynew(String username,String department);

    public List<OPDs> findbynew2(String username);

    public List<OPDs> findbynew3(String username,String department,String date);
}
