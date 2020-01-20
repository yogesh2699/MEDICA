package com.italoalmeida.ptg.restcontrollers;


import com.italoalmeida.ptg.models.Appointment;
import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.services.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppointmentRestController {

    private AppointmentService appointmentService;


    @Autowired
    public AppointmentRestController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/Appointment")
    public Appointment addAppointment(@RequestBody Appointment appointment) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        appointmentService.save(appointment);

        return appointment;
    }


    @GetMapping("/AppointmentByPhone")
    public List<Appointment> getAppointmentbyphone(@RequestParam String phones)  {
        List<Appointment> hospitals = null;
        try {
            hospitals = appointmentService.findbyPhone(phones);

        }
        catch (Exception e){
            System.out.println(e);
        }
        return hospitals;
    }

    @GetMapping("/Appointmentbystatus")
    public List<Appointment> findbyid(@RequestParam String id)  {
        List<Appointment> appoint = null;
        try {
            appoint = appointmentService.findbyidandstatus(id);

        }
        catch (Exception e){
            System.out.println(e);
        }
        return appoint;
    }

    @GetMapping("/Accept")
    public List<Appointment> acceptedbyid(@RequestParam String id)  {

             List<Appointment> s = appointmentService.updatestatus(id);
              return s;
    }

    @GetMapping("/Decline")
    public List<Appointment> declinedbyid(@RequestParam String id)  {

        List<Appointment> s = appointmentService.declinestatus(id);
            return s;
    }

    @GetMapping("/getall")
    public List<Appointment> getallby()  {

        List<Appointment> s = appointmentService.getaccepted();
        return s;
    }



}
