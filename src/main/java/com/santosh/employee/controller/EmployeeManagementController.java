package com.santosh.employee.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/employee")
@Slf4j
public class EmployeeManagementController {

    @GetMapping(path = "/getname", consumes = {APPLICATION_JSON_VALUE}, produces = {APPLICATION_JSON_VALUE})
    public String getName(@RequestParam(value = "name", required = true) final String name){
        log.info("Name is {}", name );
        return "Hello, " + name.toUpperCase();
    }

}
