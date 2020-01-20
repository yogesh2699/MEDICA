package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.Doctor;
import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.models.OPDs;

import java.util.List;

public interface DoctorService {

    public void save(Doctor doctor);

    public List<Doctor> findByUsername(String Username);

    public Doctor findById(Long id);

    public List<Doctor> selectbyuser(String department,String username);

}
