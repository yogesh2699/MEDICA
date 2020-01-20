package com.italoalmeida.ptg.restcontrollers;

import com.italoalmeida.ptg.models.States;
import com.italoalmeida.ptg.services.StatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateRestController {

    @Autowired
    StatesService statesService;

    @GetMapping
    public ResponseEntity<List<States>> getAllEmployees(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "Punjab") String sortBy)
    {
        List<States> list = statesService.getAllStates(pageNo, pageSize, sortBy);

        return new ResponseEntity<List<States>>(list, new HttpHeaders(), HttpStatus.OK);
    }


    @GetMapping("/city")
    public List<States> gethospital(@RequestParam String Username) {

        List<States> theEmployee = statesService.findByname(Username);

        return theEmployee;
    }

}
