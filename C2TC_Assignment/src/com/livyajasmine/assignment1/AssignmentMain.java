package com.livyajasmine.assignment1;

import com.livyajasmine.assignment1.employees.Manager;
import com.livyajasmine.assignment1.employees.Developer;
import com.livyajasmine.assignment1.utilities.EmployeeUtilities;


public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer objects
        Manager manager = new Manager("Alice", 101, 80000, "IT");
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        // Display details
        System.out.println("Manager Details:");
        manager.displayDetails();

        System.out.println("\nDeveloper Details:");
        developer.displayDetails();

        // Utilities usage
        EmployeeUtilities util = new EmployeeUtilities();
        util.giveBonus(manager, 5000);
        util.giveBonus(developer, 3000);

        util.compareSalary(manager, developer);
    }
}