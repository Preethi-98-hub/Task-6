package com.Task6;

public class Circle {
	private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 0.0;
    }

    // Constructor with one argument
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating Circle objects using different constructors
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);

        // Setting radius for circle1
        circle1.setRadius(3.0);

        // Calculating and displaying circumference for both circles
        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
    }


	}


