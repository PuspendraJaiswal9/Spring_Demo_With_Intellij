package com.example.Spring_Demo_With_Intellij.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String empName = "Sonu";

    @Autowired
    private DepartmentBean departmentBean;

    public String getEmpName() {
        return empName;
    }

    public String getDepartmentName() {
        return departmentBean.getDeptName();
    }
}
