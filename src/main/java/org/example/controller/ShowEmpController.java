package org.example.controller;

import org.example.dao.EmpDAO;
import org.example.model.Emp;
import org.example.util.InputHelper;
import org.example.view.EmpView;
import org.example.view.KeyView;

public class ShowEmpController {
    EmpView view = new EmpView();
    Emp tempEmp;

    public Integer process(EmpDAO empDAO) {
        KeyView.printEmpno(empDAO);
        System.out.print("Введіть ітендифікатор користувача інформацію якого потрібно переглянути - ");
        Integer tempEmpno = InputHelper.InputNumfromPool(empDAO.selectEMPNO());

        tempEmp = empDAO.seletEMP(tempEmpno);
        view.printEmp(tempEmp);

        return 0;
    }
}
