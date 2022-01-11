package com.metin.medium.aop.controller.secured;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagementController {

    @GetMapping("/students/{id}")
    public void getStudentId(@PathVariable Long id) {
        System.out.println("Some information about the student...");
    }
}
