package com.italoalmeida.ptg.repositories;

import com.italoalmeida.ptg.models.Appointment;
import com.italoalmeida.ptg.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {




    @Query(value="SELECT *FROM Appointment WHERE phones=?1",nativeQuery=true)
    List<Appointment> findByphones(String phones);

    @Query(value="SELECT *FROM Appointment WHERE id = ?1 AND status LIKE 'Pen%'",nativeQuery=true)
    List<Appointment> findBystatusid(String id);

    @Transactional
    @Modifying
    @Query(value="UPDATE Appointment SET status = REPLACE(status, 'Pending', 'Accept') Where status LIKE '%Pending%' AND id = ?1 ",nativeQuery = true)
    void setAppointmentbyid(String id);


    @Transactional
    @Modifying
    @Query(value="UPDATE Appointment SET status = REPLACE(status, 'Pending', 'Decline') Where status LIKE '%Pending%' AND id = ?1 ",nativeQuery = true)
    void declinebyid(String id);

    @Query(value="SELECT * FROM Appointment WHERE id = ?1",nativeQuery=true)
    List<Appointment> getStatus(String id);

    @Query(value="SELECT * FROM Appointment Where status LIKE '%Accept%'",nativeQuery=true)
    List<Appointment> getAccept();


    //WHERE govt LIKE '%{$AIIMS}%'
    //UPDATE table
    //SET field = REPLACE(field, 'string', 'anothervalue')
    //WHERE field LIKE '%string%';
}
