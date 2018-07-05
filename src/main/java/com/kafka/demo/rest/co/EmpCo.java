package com.kafka.demo.rest.co;

public class EmpCo {
    
    private String empId;
    private String employeeName;
    private String employeeDept;
    
    public String getEmpId() {
        return empId;
    }
    
    @Override
    public String toString() {
        return "EmpCo{" +
                "empId='" + empId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeDept='" + employeeDept + '\'' +
                '}';
    }
    
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public String getEmployeeDept() {
        return employeeDept;
    }
    
    public void setEmployeeDept(String employeeDept) {
        this.employeeDept = employeeDept;
    }
}
