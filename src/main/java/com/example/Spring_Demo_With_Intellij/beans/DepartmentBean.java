package com.example.Spring_Demo_With_Intellij.beans;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String deptName = "IT Department";

    public String getDeptName() {
        return deptName;
    }
}
