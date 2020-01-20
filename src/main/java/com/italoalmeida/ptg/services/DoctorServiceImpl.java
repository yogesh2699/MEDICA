package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.Doctor;
import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements DoctorService{

    private DoctorRepository doctorRepository;


    @Autowired
    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public void save(Doctor doctor) {
        doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> findByUsername(String Username) {
        List<Doctor> result = doctorRepository.findByusername(Username);

        return result;
    }

    @Override
    public Doctor findById(Long id) {
        Optional<Doctor> result = doctorRepository.findById(id);

        Doctor doctor = null;

        if (result.isPresent()) {
            doctor = result.get();
        }
        else {

            throw new RuntimeException("Did not find Doctor By Id - " + id);
        }

        return doctor;
    }

    @Override
    public List<Doctor> selectbyuser(String department, String username) {
        List<Doctor> repo = doctorRepository.findbyDepartment(department,username);
        return repo;
    }
}
