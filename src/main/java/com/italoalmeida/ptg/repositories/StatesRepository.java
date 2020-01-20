package com.italoalmeida.ptg.repositories;

import com.italoalmeida.ptg.models.States;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StatesRepository extends CrudRepository<States,String> {

    List<States> findByState(String state, Pageable pageable);

    @Query(value="SELECT *FROM cities WHERE city_state=?1",nativeQuery=true)
    List<States> findByName(String city_state);

    Object findAll(Pageable paging);
}
