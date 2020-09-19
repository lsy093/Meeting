package org.javaboy.meeting.mapper;

import org.javaboy.meeting.model.Employee;

public interface EmployeeMapper {
    Employee loadEmpByUsername(String username);
}
