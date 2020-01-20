package com.italoalmeida.ptg.restcontrollers;


import com.italoalmeida.ptg.models.Doctor;
import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.models.OPDs;
import com.italoalmeida.ptg.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DoctorRestController {

    private DoctorService doctorService;


    @Autowired
    public DoctorRestController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping("/Doctor")
    public void addDoctor(@RequestBody Doctor doctor) {

        doctor.setId(0);
        doctorService.save(doctor);
    }

    @GetMapping("/DoctorUser")
    public List<Doctor> getDoctorByHospital(@RequestParam String Username) {

        List<Doctor> doctor = doctorService.findByUsername(Username);

        return doctor;
    }

    @GetMapping("/DoctorId")
    public Doctor getDoctorByID(@RequestParam Long id) {

        Doctor doctor = doctorService.findById(id);
        if (doctor == null) {
            throw new RuntimeException("Doctor is not found - " + id);
        }

        return doctor;
    }

    @GetMapping("/newone")
    public List<Doctor> getDoctorByID(@RequestParam String department,@RequestParam String username) {

       List<Doctor>doctor = doctorService.selectbyuser(department,username);
        if (doctor == null) {
            throw new RuntimeException("Doctor is not found ");
        }

        return doctor;
    }



}
