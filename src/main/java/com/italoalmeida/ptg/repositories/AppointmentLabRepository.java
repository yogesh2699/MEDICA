package com.italoalmeida.ptg.repositories;

import com.italoalmeida.ptg.models.Appointment;
import com.italoalmeida.ptg.models.AppointmentLab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface AppointmentLabRepository extends JpaRepository<AppointmentLab,Integer> {

    @Query(value="SELECT *FROM Appointmentlab WHERE phones=?1",nativeQuery=true)
    List<AppointmentLab> function1(String phones);

    @Query(value="SELECT *FROM Appointmentlab WHERE id = ?1 AND status LIKE 'Pen%'",nativeQuery=true)
    List<AppointmentLab> function2(String id);

    @Transactional
    @Modifying
    @Query(value="UPDATE Appointmentlab SET status = REPLACE(status, 'Pending', 'Accept') Where status LIKE '%Pending%' AND id = ?1 ",nativeQuery = true)
    void function3(String id);


    @Transactional
    @Modifying
    @Query(value="UPDATE Appointmentlab SET status = REPLACE(status, 'Pending', 'Decline') Where status LIKE '%Pending%' AND id = ?1 ",nativeQuery = true)
    void function4(String id);

    @Query(value="SELECT * FROM Appointmentlab WHERE id = ?1",nativeQuery=true)
    List<AppointmentLab> function5(String id);


    //WHERE govt LIKE '%{$AIIMS}%'
    //UPDATE table
    //SET field = REPLACE(field, 'string', 'anothervalue')
    //WHERE field LIKE '%string%';

}
