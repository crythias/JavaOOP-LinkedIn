public class Employee {
    String name;
    int age;
    double salary;
    LocationType location;

    Employee(String name, int age, double salary, LocationType location) {
        this.name = name; 
        this.age = age;
        this.salary = salary;
        this.location = location;
    }   

    void raiseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        } else {
            System.out.println("Percentage must be positive.");
        }
    }   
}
