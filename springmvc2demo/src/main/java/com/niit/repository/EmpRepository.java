package com.niit.repository;

import com.niit.model.Emp;

import java.util.ArrayList;
import java.util.List;

public class EmpRepository {
    public List<Emp> empdata;

    public EmpRepository()
    {
        this.empdata = new ArrayList();
    }

    public List<Emp> getEmpdata()
    {
        return empdata;
    }

    public void setEmps(List<Emp> empdata)
    {
        this.empdata = empdata;
    }

    public void addEmps(Emp emp)
    {
        this.empdata.add(emp);
    }

    public void deleteEmps(int EmpId)
    {
        this.empdata.remove(EmpId);
    }

    public void updateEmps(Emp emp)
    {
        this.empdata.add(emp);
    }

}
