package com.kurs.spring.spring_app;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class DataController {

    private Employee employee = new Employee("Kamil", 22);
    private List<Employee> employees = new ArrayList<>();

    @GetMapping("/employees")
    @ResponseBody
    public ResponseEntity<List<Employee>> getEmployeesList() {
        if(!employees.contains(employee))
            employees.add(employee);

        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.employees.get(id));
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> putEmployee(@PathVariable("id") Integer id,
                                                @RequestBody Employee employee) {

        this.employees.get(id).setAge(employee.getAge());
        this.employees.get(id).setName(employee.getName());

        return ResponseEntity.status(HttpStatus.OK).body(employees.get(id));
    }


    @PostMapping("/employee")
//    @ResponseBody     // with @RestController works without @ResponseBody
    public ResponseEntity<List<Employee>> postEmployeesList(@RequestBody Employee employee) {
        employee.setId(this.employees.size());
        employees.add(employee);

        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }
}
