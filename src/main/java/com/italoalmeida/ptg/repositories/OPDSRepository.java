package com.italoalmeida.ptg.repositories;

import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.models.OPDs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface OPDSRepository extends JpaRepository<OPDs,Integer> {

    @Query(value="SELECT * FROM opd WHERE username=?1 AND department=?2 AND date=?3",nativeQuery=true)
    List<OPDs> findBySeats(String username,String department,String date);

    @Transactional
    @Modifying
    @Query(value="update opd set Seats= Seats - 1  where Seats > 0 AND username = ?1 AND department=?2 AND date=?3",nativeQuery = true)
    void setOPDsSeatsByUsername(String username,String department,String date);


    @Query(value="SELECT * FROM opd WHERE username=?1 AND department=?2 AND seatid <> '' AND seatid IS NOT NULL",nativeQuery=true)
    List<OPDs> findByseat2(String username,String department);


    @Query(value="SELECT * FROM opd WHERE username=?1 AND seatid <> '' AND seatid IS NOT NULL",nativeQuery=true)
    List<OPDs> findByseat3(String username);

    @Query(value="SELECT * FROM opd WHERE username=?1 AND department=?2 AND date=?3 AND seatid <> '' AND seatid IS NOT NULL",nativeQuery=true)
    List<OPDs> findByseat4(String username,String department,String date);







    //update Manager set username = :username, password = :password where id = :id

/*
    @Transactional
    @Modifying
    @Query(value = "update opd set Seats = Seats - 1 AND phones = ?1 AND seatid = ?2",nativeQuery=true )
    void setphoneandSeatid(String phones,String seatid);



    @Query(value = "SELECT * FROM opd where username = ?1 AND department = ?2 AND date =?3 AND Seats >= 0",nativeQuery=true )
    List<OPDs> setphoneandSeatidbyanother(String username,String department,String date);

*/

    //SELECT * FROM opd where username = ?3 AND department = ?4 AND date =?5 AND Seats > 0

   // @Transactional
   // @Modifying
   // @Query(value="update opd set status= CONCAT(status, 'Pending')  where username = ?1 AND department = ?2",nativeQuery = true)
   // void setOPDsStatusByUsername(String username,String department);


   // @Query(value="SELECT *FROM opd WHERE phones=?1",nativeQuery=true)
   // List<OPDs> findByphones(String phones);
    //update categories set code = code + "_standard" where id = 1;
    //UPDATE categories SET code = CONCAT(code, '_standard') WHERE id = 1;


    //SELECT COUNT(column_name)
    //FROM table_name
    //WHERE condition;

}
