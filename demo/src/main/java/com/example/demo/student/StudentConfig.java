package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.tools.jar.CommandLine;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {
    // student repository is injected
    @Bean
    CommandLineRunner commandLineRunner
            (StudentRepository repository){
        return args -> {
            Student mariam= new Student("Mariam","marium.jamal@gmail.com",

                    LocalDate.of(2000, Month.JANUARY,5));
            Student alex= new Student("Alex","alex@gmail.com",

                    LocalDate.of(2004, Month.JANUARY,5));
            List<Student> list = new ArrayList<>();
            list.add(mariam);
            list.add(alex);
            repository.saveAll(
                    list
            );
        };
    }
}
