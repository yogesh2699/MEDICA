package com.italoalmeida.ptg.restcontrollers;

import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.services.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HospitalRestController {

    private HospitalService hospitalService;

    @Autowired
    public HospitalRestController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    // expose "/employees" and return list of employees
    @GetMapping("/hospital")
    public List<Hospital> findAll() {
        return hospitalService.findAll();
    }

    // add mapping for GET /employees/{employeeId}

    @GetMapping("/hospitaluser")
    public Hospital gethospital(@RequestParam String Username) {

        Hospital theEmployee = hospitalService.findByUsername(Username);

        if (theEmployee == null) {
            throw new RuntimeException("Hospital is not found - " + Username);
        }

        return theEmployee;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/hospitals")
    public Hospital addEmployee(@RequestBody Hospital hospital) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update


        hospitalService.save(hospital);

        return hospital;
    }

    // add mapping for PUT /employees - update existing employee

    @GetMapping("/city")
    public List<Hospital> getCityHospital(@RequestParam String HospitalName)  {
        List<Hospital> hospitals = null;
        try {
            hospitals = hospitalService.findBycity(HospitalName);

        }
        catch (Exception e){
            System.out.println(e);
        }
        return hospitals;
    }

    @GetMapping("/signin/hospital")
    public List<Hospital> getSigninbyHospital(@RequestParam String username,@RequestParam String password) throws Exception{
        List<Hospital> hospitals = null;

        try {

            hospitals = hospitalService.findbypassword(username,password);


        }
        catch (Exception e){
            System.out.println(e);


        }
        return hospitals;
    }


    // add mapping for DELETE /employees/{employeeId} - delete employee

    @GetMapping("/state")
    public List<Hospital> getStateHospital(@RequestParam String StateHospital) {
        List<Hospital> hospitals = null;
        try {
            hospitals = hospitalService.findBystate(StateHospital);

        }
        catch (Exception e){
            System.out.println(e);
        }
        return hospitals;
    }

}