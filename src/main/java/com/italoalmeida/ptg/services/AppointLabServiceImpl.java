package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.Appointment;
import com.italoalmeida.ptg.models.AppointmentLab;
import com.italoalmeida.ptg.repositories.AppointmentLabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointLabServiceImpl implements AppointmentLabService{

    private AppointmentLabRepository appointmentLabRepository;

    @Autowired
    public AppointLabServiceImpl(AppointmentLabRepository appointmentLabRepository) {
        this.appointmentLabRepository = appointmentLabRepository;
    }

    @Override
    public void save(AppointmentLab appointment) {
        appointmentLabRepository.save(appointment);
    }

    @Override
    public List<AppointmentLab> findbyPhone(String phones) {
        List<AppointmentLab> repo = appointmentLabRepository.function1(phones);
        return  repo;
    }

    @Override
    public List<AppointmentLab> findbyidandstatus(String id) {
        List<AppointmentLab> repo = appointmentLabRepository.function2(id);
        return  repo;
    }

    @Override
    public List<AppointmentLab> updatestatus(String id) {
        appointmentLabRepository.function3(id);
        List<AppointmentLab> repo = appointmentLabRepository.function5(id);
        return repo;

    }

    @Override
    public List<AppointmentLab> declinestatus(String id) {
        appointmentLabRepository.function4(id);
        List<AppointmentLab> repo = appointmentLabRepository.function5(id);
        return repo;
    }
}
