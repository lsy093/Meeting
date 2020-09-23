package org.javaboy.meeting.controller;

import org.javaboy.meeting.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ApproveaccountController {
    public static final Integer PENDING_APPROVE = 0;

    @Autowired
    EmployeeService employeeService;

    @RequestMapping("/approveaccount")
    public String approveaccount(Model model) {
        model.addAttribute("emps", employeeService.getAllEmpsByStatus(PENDING_APPROVE));
        return "/approveaccount";
    }

    @RequestMapping("updateStatus")
    public String updateStatus(Integer employeeid, Integer status) {
        Integer result = employeeService.updateStatus(employeeid, status);
        System.out.println(result);
        return "redirect:/admin/approveaccount";
    }
}
