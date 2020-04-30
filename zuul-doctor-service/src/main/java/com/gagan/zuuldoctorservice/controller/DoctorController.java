package com.gagan.zuuldoctorservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gagandeep
 * @date 30-04-2020
 * @time 20:40
 */

@RestController
public class DoctorController {

    @GetMapping("/doctors")
    public String showDoctors(){
        return "Doctors Service";
    }

}
