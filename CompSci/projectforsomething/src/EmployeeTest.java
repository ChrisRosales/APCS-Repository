/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silen
 */
import java.util.ArrayList;

public class EmployeeTest {

    public static void main(String[] args) {
        ArrayList emps = new ArrayList();
        emps.add(new Employee("Ronald Reagan", 160000));
        emps.add(new Employee("Z-Guy", .5));

        for (int i = 0; i < emps.size(); i++) {
            System.out.println("Name: " + emps.get(i));
        }
        System.out.println("----------------------------");
        emps.add(1, new Employee("Someone in the middle of r and z", 50));
        emps.remove(0);
        for (int i = 0; i < emps.size(); i++) {
            System.out.println("Name: " + emps.get(i));
            
        }
        System.out.println("----------------------------");
        emps.set(0, new Employee("Paul Kane", 50000));
        for (int i = 0; i < emps.size(); i++) {
            System.out.println("Name: " + emps.get(i));
            
        }
        System.out.println("----------------------------");
        Employee T1 = (Employee)emps.get(0);
        Employee T2 = (Employee)emps.get(1);
        if (T1.getSalary() > T2.getSalary()) {
            System.out.println(T1.getName() + "Has a higher salary than " + T2.getName());
        }else {
            System.out.println(T2.getName() + "Has a higher salary than " + T1.getName());
        }
    }
}
