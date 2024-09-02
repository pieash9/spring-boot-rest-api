package com.pieash9.starter.controllers;

import com.pieash9.starter.dto.EmployeeDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {
    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getEmployees(@PathVariable("id") Long employeeId) {
        return new EmployeeDTO(employeeId, "John", LocalDate.of(2020, 1, 1), true);
    }

    @GetMapping(path = "/employees")
    public  String getData(@PathParam("sortBy") String sortBy, @PathParam("limit") Integer limit) {
        return "Hello " + sortBy + " " + limit;
    }
}
