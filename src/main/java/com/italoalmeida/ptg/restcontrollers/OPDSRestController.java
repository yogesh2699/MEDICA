package com.italoalmeida.ptg.restcontrollers;


import com.italoalmeida.ptg.models.Hospital;
import com.italoalmeida.ptg.models.OPDs;
import com.italoalmeida.ptg.services.OPDSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class OPDSRestController {

   private OPDSService opdsService;

   @Autowired
    public OPDSRestController(OPDSService opdsService) {
        this.opdsService = opdsService;
    }

    @PostMapping("/opd")
    public OPDs addOPD(@RequestBody OPDs opDs) {

        opdsService.save(opDs);
        return opDs;
    }


    @GetMapping("/object")
    public List<OPDs> getOPDseats(@RequestParam String username,@RequestParam String department,@RequestParam String date) {
        List<OPDs> opd = null;
        try {
            opd = opdsService.findByseat(username,department,date);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return opd;
    }


    @GetMapping("/update")
    public void decrementseatbyone(@RequestParam String username,@RequestParam String department,@RequestParam String date){
       opdsService.saveseats(username,department,date);
    }

    @GetMapping("/change")
    public List<OPDs> seatuserchange(@RequestParam String username,@RequestParam String department,@RequestParam String date){
       List<OPDs> repo = opdsService.saveseats(username,department,date);
       return repo;
    }


    @PatchMapping("/opdchanges")
    public OPDs updateOPD(@RequestBody OPDs opDs) {

        //opdsService.saveopd(phones,seatid,username,department,date);

        opdsService.save(opDs);

       return opDs;
    }

    @GetMapping("/object2")
    public List<OPDs> getOPDseat2(@RequestParam String username,@RequestParam String department) {
        List<OPDs> opd = null;
        try {
            opd = opdsService.findbynew(username,department);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return opd;
    }

    @GetMapping("/object3")
    public List<OPDs> getOPDseat3(@RequestParam String username) {
        List<OPDs> opd = null;
        try {
            opd = opdsService.findbynew2(username);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return opd;
    }

    @GetMapping("/object4")
    public List<OPDs> getOPDseat3(@RequestParam String username,@RequestParam String department,@RequestParam String date) {
        List<OPDs> opd = null;
        try {
            opd = opdsService.findbynew3(username,department,date);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return opd;
    }

}
