package edu.vit.corejava.oop;

/*
 * This program covers basics of class and it's methods and objects.
 * @author Suteerth Subramaniam
 */

import java.util.Scanner;

class Employee{
    private String firstName;
    private String lastName;
    private Double salary;
    
    public Employee(){};
    public Employee(String firstName, String lastName, Double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        salary = (this.salary < 0) ? 0.0 : this.salary;
    }
    public void raise(Double raise){
        this.salary = this.salary*(1+(raise/100));
    }
    public Double getYearlySalary(){
        return (this.salary * 12);
    }
    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", Monthly Salary= " + salary + ", Yearly Salary = " + this.getYearlySalary() + "]" ;
    }
    
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Please don't be itimidated by this try block, the code will work just fine without it
        // This is called try with resources, it is used to make sure the Scanner we created is closed after it's work is
        // done, therefore it is there in the code so VSC doesn't keep bothering me
        Employee[] emp = new Employee[2];
        int i = 0;
        try (Scanner sc = new Scanner(System.in);) {
            for (i = 0; i < emp.length; i++) {
                String fn, ln;
                Double s;
                System.out.print("Enter First Name : ");
                fn = sc.nextLine();
                System.out.print("Enter Last Name : ");
                ln = sc.nextLine();
                System.out.print("Enter Salary : ");
                s = sc.nextDouble();
                s = (s<0) ? 0 : s;
                sc.nextLine();
                emp[i] = new Employee(fn, ln, s);
            }
        } 
        System.out.println("Yearly Salaries");
        i = 1;
        for (Employee employee : emp) {
            System.out.print("Yearly Salary of employee "+i+" = ");
            System.out.printf("%.2f",employee.getYearlySalary());
            System.out.println();
            i++;
        }
        i=1;
        for (Employee employee : emp) {
            employee.raise(10.0);
        }
        for (Employee employee : emp) {
            System.out.print("Yearly Salary of employee "+i+" = ");
            System.out.printf("%.2f",employee.getYearlySalary());
            System.out.println();
            i++;
        }
        
    }
}
