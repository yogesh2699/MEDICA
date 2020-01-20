package com.italoalmeida.ptg.repositories;

import com.italoalmeida.ptg.models.OPDLAB;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface OPDLABRepository extends JpaRepository<OPDLAB,Integer> {

    @Query(value="SELECT * FROM opdlab WHERE username=?1 AND lab=?2 AND date=?3",nativeQuery=true)
    List<OPDLAB> method1(String username, String lab, String date);

    @Transactional
    @Modifying
    @Query(value="update opdlab set Seats= Seats - 1  where Seats > 0 AND username = ?1 AND lab=?2 AND date=?3",nativeQuery = true)
    void method2(String username,String lab,String date);


    @Query(value="SELECT * FROM opdlab WHERE username=?1 AND lab=?2 AND seatid <> '' AND seatid IS NOT NULL",nativeQuery=true)
    List<OPDLAB> method3(String username,String lab);


    @Query(value="SELECT * FROM opdlab WHERE username=?1 AND seatid <> '' AND seatid IS NOT NULL",nativeQuery=true)
    List<OPDLAB> method4(String username);

    @Query(value="SELECT * FROM opdlab WHERE username=?1 AND lab=?2 AND date=?3 AND seatid <> '' AND seatid IS NOT NULL",nativeQuery=true)
    List<OPDLAB> method5(String username,String lab,String date);






}
