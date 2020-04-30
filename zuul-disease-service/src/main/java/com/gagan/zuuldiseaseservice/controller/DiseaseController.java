package com.gagan.zuuldiseaseservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gagandeep
 * @date 30-04-2020
 * @time 20:39
 */

@RestController
public class DiseaseController {

    @GetMapping("/diseases")
    public String showDisease(){
        return "Disease List";
    }
}
