package com.Test.demo.service;

import com.Test.demo.demo.Department;
import com.Test.demo.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentSer {

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String departmentName);
}
