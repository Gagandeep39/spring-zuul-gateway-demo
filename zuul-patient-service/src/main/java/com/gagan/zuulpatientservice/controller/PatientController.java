package com.gagan.zuulpatientservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gagandeep
 * @date 30-04-2020
 * @time 20:41
 */

@RestController
public class PatientController {

    @GetMapping("/patients")
    public String showPatients(){
        return "List of Patients";
    }

}
