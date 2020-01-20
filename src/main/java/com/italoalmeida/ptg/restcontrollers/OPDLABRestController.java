package com.italoalmeida.ptg.restcontrollers;


import com.italoalmeida.ptg.models.OPDLAB;
import com.italoalmeida.ptg.models.OPDs;
import com.italoalmeida.ptg.repositories.OPDLABRepository;
import com.italoalmeida.ptg.services.OPDLABService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class OPDLABRestController {

    private OPDLABService opdlabService;

    @Autowired
    public OPDLABRestController(OPDLABService opdlabService) {
        this.opdlabService = opdlabService;
    }

    @PostMapping("/opdlab")
    public OPDLAB addOPD(@RequestBody OPDLAB opdlab) {

        opdlabService.save(opdlab);
        return opdlab;
    }


    @GetMapping("/objectlab")
    public List<OPDLAB> getOPDseats(@RequestParam String username, @RequestParam String department, @RequestParam String date) {
        List<OPDLAB> opd = null;
        try {
            opd = opdlabService.findByseat(username,department,date);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return opd;
    }


    @GetMapping("/updatelab")
    public void decrementseatbyone(@RequestParam String username,@RequestParam String department,@RequestParam String date){
        opdlabService.saveseats(username,department,date);
    }

    @GetMapping("/changelab")
    public List<OPDLAB> seatuserchange(@RequestParam String username,@RequestParam String department,@RequestParam String date){
        List<OPDLAB> repo =  opdlabService.saveseats(username,department,date);
        return repo;
    }


    @PatchMapping("/opdchangeslab")
    public OPDLAB updateOPD(@RequestBody OPDLAB opdlab) {

        //opdsService.saveopd(phones,seatid,username,department,date);

        opdlabService.save(opdlab);

        return opdlab;
    }

    @GetMapping("/object2lab")
    public List<OPDLAB> getOPDseat2(@RequestParam String username,@RequestParam String department) {
        List<OPDLAB> opd = null;
        try {
            opd = opdlabService.findbynew(username,department);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return opd;
    }

    @GetMapping("/object3lab")
    public List<OPDLAB> getOPDseat3(@RequestParam String username) {
        List<OPDLAB> opd = null;
        try {
            opd = opdlabService.findbynew2(username);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return opd;
    }

    @GetMapping("/object4lab")
    public List<OPDLAB> getOPDseat3(@RequestParam String username,@RequestParam String department,@RequestParam String date) {
        List<OPDLAB> opd = null;
        try {
            opd = opdlabService.findbynew3(username,department,date);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return opd;
    }
}
