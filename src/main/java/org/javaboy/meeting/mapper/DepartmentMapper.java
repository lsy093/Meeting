package org.javaboy.meeting.mapper;

import org.javaboy.meeting.model.Department;

import java.util.List;

public interface DepartmentMapper {

    Department getDepById(Integer id);

    List<Department> getAllDeps();
}
