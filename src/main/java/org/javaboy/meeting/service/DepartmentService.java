package org.javaboy.meeting.service;

import org.javaboy.meeting.mapper.DepartmentMapper;
import org.javaboy.meeting.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    public Department getDepById(Integer id) {
        return departmentMapper.getDepById(id);
    }
}
