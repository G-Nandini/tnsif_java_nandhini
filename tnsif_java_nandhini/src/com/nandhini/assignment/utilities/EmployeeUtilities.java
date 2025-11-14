package com.nandhini.assignment.utilities;

import com.nandhini.assignment.employees.*;

public class EmployeeUtilities {
    public void displayEmployee(Employee emp) {
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
    }

   public double calculateAnnualSalary(Employee emp) {
        return emp.getSalary() * 12;
    }

   
    private void printMessage() {
        System.out.println("Inside EmployeeUtilities class");
    }

    // Public method that uses Manager and Developer classes
    public void showRoleDetails(Employee emp) {
        printMessage(); // calling private method

        if (emp instanceof Manager) {
            Manager m = (Manager) emp;
            System.out.println("Manager of " + m.getDepartmentName() + " department");
        } else if (emp instanceof Developer) {
            Developer d = (Developer) emp;
            System.out.println("Developer working on " + d.getProjectName());
        } else {
            System.out.println("General Employee");
        }
    }
}

