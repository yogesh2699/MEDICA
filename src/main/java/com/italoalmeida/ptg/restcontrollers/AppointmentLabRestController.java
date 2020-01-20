package com.italoalmeida.ptg.restcontrollers;


import com.italoalmeida.ptg.models.Appointment;
import com.italoalmeida.ptg.models.AppointmentLab;
import com.italoalmeida.ptg.services.AppointmentLabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppointmentLabRestController {

    private AppointmentLabService appointmentLabService;

    @Autowired
    public AppointmentLabRestController(AppointmentLabService appointmentLabService) {
        this.appointmentLabService = appointmentLabService;
    }

    @PostMapping("/Appointmentlab")
    public AppointmentLab addAppointment(@RequestBody AppointmentLab appointment) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        appointmentLabService.save(appointment);

        return appointment;
    }


    @GetMapping("/AppointmentByPhonelab")
    public List<AppointmentLab> getAppointmentbyphone(@RequestParam String phones)  {
        List<AppointmentLab> hospitals = null;
        try {
            hospitals = appointmentLabService.findbyPhone(phones);

        }
        catch (Exception e){
            System.out.println(e);
        }
        return hospitals;
    }

    @GetMapping("/Appointmentbystatuslab")
    public List<AppointmentLab> findbyid(@RequestParam String id)  {
        List<AppointmentLab> appoint = null;
        try {
            appoint = appointmentLabService.findbyidandstatus(id);

        }
        catch (Exception e){
            System.out.println(e);
        }
        return appoint;
    }

    @GetMapping("/Acceptlab")
    public List<AppointmentLab> acceptedbyid(@RequestParam String id)  {

        List<AppointmentLab> s = appointmentLabService.updatestatus(id);
        return s;
    }

    @GetMapping("/Declinelab")
    public List<AppointmentLab> declinedbyid(@RequestParam String id)  {

        List<AppointmentLab> s = appointmentLabService.declinestatus(id);
        return s;
    }






}
