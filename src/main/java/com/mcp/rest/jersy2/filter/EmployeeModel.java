package com.mcp.rest.jersy2.filter;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Employee")
public class EmployeeModel {
    public String name;
    public int age;
    public EmployeeModel() {} // JAXB needs this
 
    public EmployeeModel(String name, int age) {
        this.name = name;
        this.age = age;
    }
}