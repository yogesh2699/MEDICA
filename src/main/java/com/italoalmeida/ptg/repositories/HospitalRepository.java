package com.italoalmeida.ptg.repositories;

import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.models.OPDs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HospitalRepository extends CrudRepository<Hospital,String> {

    @Query(value="SELECT *FROM hospital WHERE city=?1",nativeQuery=true)
    List<Hospital> findByCity(String city);

    @Query(value="SELECT *FROM hospital WHERE states=?1",nativeQuery=true)
    List<Hospital> findByState(String states);

    @Query(value="SELECT *FROM hospital WHERE govt LIKE '%{$AIIMS}%'",nativeQuery=true)
    List<Hospital> findByGovt();

    @Query(value="SELECT * FROM hospital WHERE username=?1 AND password=?2",nativeQuery=true)
    List<Hospital> findByPassword(String username,String password);
    //WHERE `column` LIKE '%{$needle}%'

    //testing
 //   @Query(value="SELECT * FROM opd WHERE username=?1 ",nativeQuery=true)
   // List<OPDs> findByUsername(String username, String password);

//update opd set status= CONCAT(status, 'Pending')  where username = ?1 AND department = ?2",nativeQuery = true


    //SELECT Orders.OrderID, Customers.CustomerName, Orders.OrderDate
    //FROM Orders
    //INNER JOIN Customers ON Orders.CustomerID=Customers.CustomerID;
}