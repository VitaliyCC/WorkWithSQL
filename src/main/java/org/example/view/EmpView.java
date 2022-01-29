package org.example.view;

import org.example.model.Emp;

public class EmpView {
    public void printEmp(Emp emp) {
        StringBuilder resultToPrint = new StringBuilder();
        System.out.println("Інформація згідно запиту:");
        resultToPrint.append("Ітендифікатор - " + emp.getEmpno() + "\n");
        resultToPrint.append("Фамілія - " + emp.getEname() + "\n");
        resultToPrint.append("Посада - " + emp.getJob() + "\n");
        resultToPrint.append("Ітендифікатор менеджера - " + emp.getMgr() + "\n");
        resultToPrint.append("Дата прийому на роботу - " + emp.getHiredata() + "\n");
        resultToPrint.append("Заробітня плата - " + emp.getSal() + "\n");
        resultToPrint.append("Премія - " + emp.getComm() + "\n");
        resultToPrint.append("Віділ в якому працє - " + emp.getDname() + "\n");
        resultToPrint.append("Місто в якому працює - " + emp.getLoc() + "\n");
        resultToPrint.append("Індекс ЄТС - " + emp.getEts() + "\n");

        System.out.println(resultToPrint.toString());
    }
}
