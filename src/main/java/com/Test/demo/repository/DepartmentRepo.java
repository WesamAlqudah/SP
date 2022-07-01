package com.Test.demo.repository;

import com.Test.demo.demo.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {

        @Query(value = "select departmentName from department",nativeQuery = true)
        Department findByDepartmentName(String departmentName);

        @Query(value = "select departmentName from department ",nativeQuery = true)
        Department findByDepartmentNameIgonreCase(String departmentName);
}
