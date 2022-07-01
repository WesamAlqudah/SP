package com.Test.demo.service;

import com.Test.demo.demo.Department;
import com.Test.demo.repository.DepartmentRepo;
import org.junit.jupiter.api.*;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentSerTest {

    @Autowired
    private  DepartmentSer departmentSer;

    @MockBean
    private DepartmentRepo departmentRepo;

//    @BeforeAll
    @BeforeEach
    void setUp() {
        Department department=
                Department.builder()
                        .departmentName("IT")
                        .departmentAddress("IA")
                        .departmentCode("52557")
                        .departmentId(1L)
                        .build();

        Mockito.when(departmentRepo.findByDepartmentNameIgonreCase("IT"))
                .thenReturn(department);
    }
    @Test
    @DisplayName("Get data based on valida Department Name")
//    @Disabled// after test use it
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentName="IT";
        Department found = departmentSer.fetchDepartmentByName(departmentName);
        assertEquals(departmentName,found.getDepartmentName());
    }
//
//    @Test
//    void saveDepartment() {
//    }
//
//    @Test
//    void fetchDepartmentList() {
//    }
//
//    @Test
//    void fetchDepartmentById() {
//    }
//
//    @Test
//    void deleteDepartmentById() {
//    }
//
//    @Test
//    void updateDepartment() {
//    }
//
//    @Test
//    void fetchDepartmentByName() {
//    }
}