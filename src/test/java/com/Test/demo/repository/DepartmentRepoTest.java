//package com.Test.demo.repository;
//
//import com.Test.demo.demo.Department;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@DataJdbcTest
//class DepartmentRepoTest {
//
//    @Autowired
//    private DepartmentRepo departmentRepo;
//
//    @Autowired
//    private TestEntityManager entityManager;
//
//    @BeforeEach
//    void setUp() {
//        Department department=
//                Department.builder()
//                        .departmentName("IR")
//                        .departmentCode("XE-i")
//                        .departmentAddress("Add")
//                        .build();
//        entityManager.persist(department);
//    }
//
//
//    @Test
//    public void wenFindById_thenReturnDepartment(){
//        Department department= departmentRepo.findById(1l).get();
//        assertEquals(department.getDepartmentName(),"Repo Test");
//    }
//}