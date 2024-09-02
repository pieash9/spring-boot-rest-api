package com.pieash9.starter.controllers;

import com.pieash9.starter.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class EmployeeController {
    @GetMapping(path = "/employees")
    public EmployeeDTO getEmployees() {
        return new EmployeeDTO(1L, "John", LocalDate.of(2020, 1, 1), true);
    }
}
