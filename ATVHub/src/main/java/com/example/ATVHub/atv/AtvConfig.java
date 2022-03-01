package com.example.ATVHub.atv;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class AtvConfig {

    @Bean
    CommandLineRunner commandLineRunner(AtvRepository repository){
        return args -> {
            Atv banshee = new Atv(
                    "ATV",
                    "Yamaha",
                    LocalDate.of(1997, 1, 1),
                    LocalDate.of(1988, 1, 1),
                    LocalDate.of(2007, 1, 1),
                    "Banshee"
            );
            Atv blaster = new Atv(
                    "ATV",
                    "Yamaha",
                    LocalDate.of(1999, 1, 1),
                    LocalDate.of(1988, 1, 1),
                    LocalDate.of(2007, 1, 1),
                    "Blaster"
            );
            Atv blasterCustom = new Atv(
                    "ATV",
                    "Yamaha",
                    LocalDate.of(1996, 1, 1),
                    LocalDate.of(1988, 1, 1),
                    LocalDate.of(2007, 1, 1),
                    "Blaster"
            );

            repository.saveAll(
                    List.of(banshee, blaster, blasterCustom)
            );
        };
    }
}
