// This file is part of a Java OOP project on LinkedIn Learning
// It contains the main class for the application.
// This one is for building Employee instances and managing their attributes.
import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        
        // Create Employee instances
        Employee myEmployeeOne = new Employee("Alice", 30, 50000, LocationType.MAIN_OFFICE);
        Employee myEmployeeTwo = new Employee("Bob", 25, 60000, LocationType.REMOTE);
        
        myEmployeeOne.raiseSalary(10); // Raises Alice's salary by 10%
        System.out.println("Alice's new salary: " + myEmployeeOne.salary);
        System.out.println("Bob's salary: " + myEmployeeTwo.salary );
    }

}
