package com.italoalmeida.ptg.services;


import com.italoalmeida.ptg.models.AppointmentLab;

import java.util.List;

public interface AppointmentLabService {

    public void save(AppointmentLab appointment);

    List<AppointmentLab> findbyPhone(String phones);

    List<AppointmentLab>  findbyidandstatus(String id);

    List<AppointmentLab> updatestatus(String id);

    List<AppointmentLab>  declinestatus(String id);

}
