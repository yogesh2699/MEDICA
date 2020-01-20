package com.italoalmeida.ptg.services;

import com.italoalmeida.ptg.models.Appointment;
import com.italoalmeida.ptg.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private AppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentServiceImpl(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @Override
    public void save(Appointment appointment) {
             appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> findbyPhone(String phones) {
        List<Appointment> repo = appointmentRepository.findByphones(phones);
        return  repo;
    }

    @Override
    public List<Appointment> findbyidandstatus(String id) {
        List<Appointment> repo = appointmentRepository.findBystatusid(id);
        return  repo;
    }

    @Override
    public List<Appointment> updatestatus(String id) {
        appointmentRepository.setAppointmentbyid(id);
        List<Appointment> repo = appointmentRepository.getStatus(id);
        return repo;
    }

    @Override
    public List<Appointment> declinestatus(String id) {
        appointmentRepository.declinebyid(id);
        List<Appointment> repo = appointmentRepository.getStatus(id);
        return repo;
    }

    @Override
    public List<Appointment> getallbyid(String id) {
        List<Appointment> repo = appointmentRepository.getStatus(id);
        return repo;
    }

    @Override
    public List<Appointment> getaccepted() {
        List<Appointment> repo =   appointmentRepository.getAccept();
        return repo;

    }


}
