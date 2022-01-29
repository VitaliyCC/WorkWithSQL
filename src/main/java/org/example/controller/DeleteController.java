package org.example.controller;

import org.example.dao.EmpDAO;
import org.example.util.InputHelper;
import org.example.view.KeyView;

public class DeleteController {
    public Integer process(EmpDAO empDAO) {
        KeyView.printEmpno(empDAO);
        System.out.print("Введіть ітендифікатор користувача що потрібно видалити - ");
        Integer tempEmpno = InputHelper.InputNumfromPool(empDAO.selectEMPNO());

        empDAO.remuveEMP(tempEmpno);

        return 0;
    }
}
