package com.Test.demo.controller;


import com.Test.demo.demo.Department;
import com.Test.demo.error.DepartmentNotFoundException;
import com.Test.demo.service.DepartmentSer;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@RestController
public class DepartmentCont {

    @Autowired
    private DepartmentSer departmentSer;

    private  final Logger logger= LoggerFactory.getLogger(DepartmentCont.class);


    @Value("${welcome.message}")
    private String welcomeMsg;

    @GetMapping("/")
    public String wlcMsg(){
        return welcomeMsg;
    }

//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String test(){
//        return "test";
//    }

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department) {
        logger.info("Inside saveDepartment");
        return departmentSer.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentSer.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentSer.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
    departmentSer.deleteDepartmentById(departmentId);
    return"Department deleted Successfully !!";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,
                                       @RequestBody Department department){
        return departmentSer.updateDepartment(departmentId, department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable ("name") String departmentName){
        return departmentSer.fetchDepartmentByName(departmentName);
    }
}


