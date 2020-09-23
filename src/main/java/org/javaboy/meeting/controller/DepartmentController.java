package org.javaboy.meeting.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class DepartmentController {
    @RequestMapping("/departments")
    public String departments() {
        return "departments";
    }
}
