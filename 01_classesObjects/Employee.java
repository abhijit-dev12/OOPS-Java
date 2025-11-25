//Create an Employee class that calculates total salary (HRA 20%, Bonus 10%)


import java.util.*;
public class Employee {
    double  baseSalary;
    double hra;
    double bonus;
    double total;

    //constructor
    public Employee(double baseSalary) {
        this.baseSalary = baseSalary;
        this.hra = 0.20*baseSalary;
        this.bonus = 0.10*baseSalary;
        this.total = baseSalary+hra+bonus;
    }

    //display
    public void displaySalary() {
        System.out.println("BaseSalary: "+baseSalary);
        System.out.println("HRA: "+hra);
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Base Salary: "); //take input of base salary 1st step
        double salary = sc.nextDouble();

        Employee emp = new Employee(salary);
        emp.displaySalary();

    }
}
