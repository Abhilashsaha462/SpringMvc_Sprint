package com.niit.model;

public class Emp {

    private int empId;
    private String empName;
    private int empSal;

    public Emp() {
    }

    public Emp(int empId, String empName, int empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSal() {
        return empSal;
    }

    public void setEmpSal(int empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
