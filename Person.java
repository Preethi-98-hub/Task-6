package com.Task6;

public class Person {
	 // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Person person = new Person("Jenny", 30);

	        // Access the attributes using getter methods
	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
	    }
	
	}


