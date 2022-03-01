package com.example.ATVHub.atv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Atv")
public class AtvController {

    private final AtvService atvService;

    @Autowired
    public AtvController(AtvService atvService) {
        this.atvService = atvService;
    }

    @GetMapping
    public List<Atv> getAtvs() {
        return atvService.getAtvs();
    }

    @PostMapping
    public void registerNewAtv(@RequestBody Atv atv){
        atvService.addNewAtv(atv);
    }

    @PutMapping(path = "{Id}")
    public void updateAtv(
            @PathVariable("atvId") Long Id,
            @RequestParam(required = false) String rideClass,
            @RequestParam(required = false) String make,
            @RequestParam(required = false) LocalDate year,
            @RequestParam(required = false) LocalDate yearMakeBegin,
            @RequestParam(required = false) LocalDate yearMakeEnd,
            @RequestParam(required = false) String model){
        atvService.updateAtv(Id, rideClass, make, year, yearMakeBegin, yearMakeEnd, model);
    };
}
