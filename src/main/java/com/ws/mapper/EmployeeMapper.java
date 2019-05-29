package com.ws.mapper;

import com.ws.bean.Employee;

// @Mapper或@MapperScan将接口扫描装配到容器中
public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    void insertEmp(Employee employee);
}
