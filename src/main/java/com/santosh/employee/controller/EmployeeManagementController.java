package com.santosh.employee.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/employee")
@Slf4j
public class EmployeeManagementController {

    @GetMapping(path = "/getname", consumes = {APPLICATION_JSON_VALUE}, produces = {APPLICATION_JSON_VALUE})
    public String getName(@RequestParam(value = "name", required = true) final String name, @RequestParam(value = "age", required = true) final int age){
        log.info("Name is {}", name );
        return "Hello, " + name.toUpperCase() + ", your age is:: " + age;
    }

    @GetMapping(path = "{id}", produces = {APPLICATION_JSON_VALUE})
    public String getEmployee(@PathVariable(value = "id") final int empId){
        return String.valueOf(empId);
    }
}
