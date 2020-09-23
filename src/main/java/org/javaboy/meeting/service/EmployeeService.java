package org.javaboy.meeting.service;

import org.javaboy.meeting.mapper.EmployeeMapper;
import org.javaboy.meeting.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public Employee doLogin(String username, String password) {
        Employee employee=employeeMapper.loadEmpByUsername(username);
        if(employee==null||!employee.getPassword().equals(password)){
            return null;
        }

        return employee;
    }

    public Integer doRge(Employee employee) {
        Employee emp = employeeMapper.loadEmpByUsername(employee.getUsername());
        if(emp!=null){
            return -1;
        }
        employee.setRole(1);
        employee.setStatus(0);
        return employeeMapper.doReg(employee);
    }

    public List<Employee> getAllEmpsByStatus(Integer status) {
        return employeeMapper.getAllEmpsByStatus(status);
    }

    public Integer updateStatus(Integer employeeid, Integer status) {
        return employeeMapper.updateStatus(employeeid,status);
    }
}
