package org.example.dao;

import org.example.model.Emp;

import java.util.ArrayList;

public interface EmpDAO {
    void insertEMP(Emp insertEmp);
    public ArrayList<Integer> selectEMPNO();
    public ArrayList<Integer> selectDEPNO();
    Emp seletEMP(Integer empno);
    void remuveEMP(Integer empno);
}
