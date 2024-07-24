package com.Task6;

public class Employee {
	// Attributes
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter for ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to raise salary by a specified percentage
    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * percent / 100;
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
 // Main method for testing
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an Employee object
        Employee emp = new Employee(1, "John", 55000);

        // Displaying employee details
        emp.displayEmployeeDetails();

        // Raising salary by 10%
        emp.raiseSalary(10);

        // Displaying updated employee details
        emp.displayEmployeeDetails();
    }

	}


