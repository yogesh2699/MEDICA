package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.Appointment;
import com.sun.javaws.security.AppPolicy;

import java.util.List;

public interface AppointmentService {

    public void save(Appointment appointment);

  List<Appointment> findbyPhone(String phones);

  List<Appointment>  findbyidandstatus(String id);

     List<Appointment> updatestatus(String id);

     List<Appointment>  declinestatus(String id);

     List<Appointment>  getallbyid(String id);

     List<Appointment> getaccepted();

     //String  getbystatus(String id);

}
