package com.example.ATVHub.atv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AtvService {

    private final AtvRepository atvRepository;

    @Autowired
    public AtvService(AtvRepository atvRepository) {
        this.atvRepository = atvRepository;
    }


    public List<Atv> getAtvs() {
        return atvRepository.findAll();
    }

    public void addNewAtv(Atv atv) {
        //return addNewAtv(atv);
        //System.out.println(atv);
        atvRepository.save(atv);
    }

    public void updateAtv(Long id,
                          String rideClass,
                          String make,
                          LocalDate year,
                          LocalDate yearMakeBegin,
                          LocalDate yearMakeEnd,
                          String model){

    }
}
