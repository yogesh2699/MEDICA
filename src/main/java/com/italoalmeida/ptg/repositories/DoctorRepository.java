package com.italoalmeida.ptg.repositories;

import com.italoalmeida.ptg.models.Doctor;
import com.italoalmeida.ptg.models.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DoctorRepository  extends JpaRepository<Doctor, Long> {

    @Query(value="SELECT *FROM doctors WHERE username=?1",nativeQuery=true)
    List<Doctor> findByusername(String username);

    @Query(value="SELECT * FROM DOCTORS WHERE department=?1 AND username=?2",nativeQuery=true)
    List<Doctor> findbyDepartment(String department,String username);
}
