package org.example.view;

import org.example.dao.EmpDAO;

import java.util.ArrayList;

public class KeyView {
    public static void printEmpno(EmpDAO empDAO){
        ArrayList<Integer> printList =empDAO.selectEMPNO();
        System.out.println("Ітендифікатори працівників:");
        for (Integer temp: printList){
            System.out.print("|");
            System.out.print(temp);
        }
        System.out.print("|\n");
    }
    public static void printDepno(EmpDAO empDAO){
        ArrayList<Integer> printList =empDAO.selectDEPNO();
        System.out.println("Ітендифікатори можливих віділів для працівника:");
        for (Integer temp: printList){
            System.out.print("|");
            System.out.print(temp);
        }
        System.out.print("|\n");
    }
}
