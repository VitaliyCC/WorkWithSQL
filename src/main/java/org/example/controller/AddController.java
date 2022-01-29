package org.example.controller;

import org.example.dao.EmpDAO;
import org.example.model.Emp;
import org.example.util.InputHelper;
import org.example.view.KeyView;

import java.sql.Date;

public class AddController {
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private Date hiredata;
    private Integer sal;
    private Integer comm;
    private Integer deptno;

    public Integer process(EmpDAO empDAO) {
        System.out.print("Введіть індивідуальний номер працівника - ");
        empno = InputHelper.InputNum();

        System.out.print("Введіть фамілію працівника - ");
        ename = InputHelper.InputString();

        System.out.print("Введіть посаду працівника - ");
        job = InputHelper.InputString();

        KeyView.printEmpno(empDAO);
        System.out.print("Введіть менеджеря працівника - ");
        mgr = InputHelper.InputNumfromPool(empDAO.selectEMPNO());

        System.out.print("Введіть дату прийнятя на роботу працівника (РРРР-ММ-ДД) - ");
        hiredata = InputHelper.InputDate();

        System.out.print("Введіть заробітню плату працівника - ");
        sal = InputHelper.InputNum();

        System.out.print("Введіть премію працівника - ");
        comm = InputHelper.InputNum();

        KeyView.printDepno(empDAO);
        System.out.print("Введіть номер віділу працівника - ");
        deptno = InputHelper.InputNumfromPool(empDAO.selectDEPNO());

        empDAO.insertEMP(new Emp(empno, ename, job, mgr, hiredata, sal, comm, deptno, "dname", "loc", 0));
        return 0;
    }
}
