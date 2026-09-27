/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hashir Azeem
 */
import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> staff = new ArrayList<>();
        staff.add(new Developer("Ali", 50000, 8000));
        staff.add(new SalesManager("Sara", 40000, 200000, 0.05));
        staff.add(new Developer("Bilal", 55000, 7000));
        staff.add(new SalesManager("Zara", 45000, 150000, 0.04));

        for (Employee e : staff) {
            System.out.println(e.getName() + " -> Final Pay: " + e.calculatePay());
        }
    }
}