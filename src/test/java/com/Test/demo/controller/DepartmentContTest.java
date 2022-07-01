//package com.Test.demo.controller;
//
//import com.Test.demo.demo.Department;
//import com.Test.demo.error.DepartmentNotFoundException;
//import com.Test.demo.service.DepartmentSer;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MockMvcResultHandlersDsl;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//
//@WebMvcTest(DepartmentCont.class)
//class DepartmentContTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @MockBean
//    private DepartmentSer departmentSer;
//
//    private Department department;
//
//    @BeforeEach
//    void setUp() {
//        department = Department.builder()
//                .departmentAddress("AMB")
//                .departmentCode("TOR_E")
//                .departmentName("TEST")
//                .departmentId(1L)
//                .build();
//    }
//
//    @Test
//    void saveDepartment() throws Exception {
//        Department inputDepartment = Department.builder()
//                .departmentAddress("AMB")
//                .departmentCode("TOR_E")
//                .departmentName("TEST")
//                .departmentId(1L)
//                .build();
//
//        Mockito.when(departmentSer.saveDepartment(inputDepartment))
//                .thenReturn(department);
//
//        mockMvc.perform(post("/departments")//url pass my url
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\n" +
//                        "        \"departmentId\": 1,\n" +
//                        "        \"departmentName\": \"AMB\",\n" +
//                        "        \"departmentAddress\": \"TOR_E\",\n" +
//                        "        \"departmentCode\": \"TEST\"\n" +
//                        "    "))
//                .andExpect(status().isOk());
//    }
//
//    @Test
//    void fetchDepartmentById() throws Exception {
//        Mockito.when(departmentSer.fetchDepartmentById(1L)
//        ).thenReturn(department);
//
//        mockMvc.perform(get("/departments/1")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.departmentName")
//                        .value(department.getDepartmentName()));
//    }
//}