package com.example.elktest.controller;

import com.example.elktest.service.ELKService;
import org.json.simple.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Xray Project
 *
 * @author w4ss1m
 */
@RestController
@RequestMapping(value = "/api")
public class ELKController {

    // Initializing instance of Logger for Controller
    private static final Logger log = LoggerFactory.getLogger(ELKController.class);

    private final ELKService service;


    public ELKController(ELKService service) {
        this.service = service;
    }

    @GetMapping(value = "/hello")
    public String helloWorld() {
        log.info("Inside Hello World Function");
        String response = "Hello World! " + new Date();
        log.info("Response => {}",response);
        return response;
    }

    @GetMapping(value = "/Food-Details")
    public JSONArray foodDetails() {
        log.info("Inside Food Detail Function");
        return service.getAllFoodDetails();
    }
}
