package com.main;

import models.Cylinder.Circle;
import models.Cylinder.Cylinder;
import models.DeveloperCompany.*;
import models.PoolArea.Cuboid;
import models.PoolArea.Rectangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());

        Employee employee = new Employee(1, "John Doe", 50000);
        System.out.println("com.DeveloperCompany.Employee ID: " + employee.getId());
        System.out.println("com.DeveloperCompany.Employee Name: " + employee.getName());
        System.out.println("com.DeveloperCompany.Employee Salary: " + employee.getSalary());

        HRManager hrManager = new HRManager(2, "Jane Smith", 60000);
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(3, "Alice", 30000);
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(4, "Bob", 32000);
        MidDeveloper midDeveloper1 = new MidDeveloper(5, "Eve", 50000);
        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(6, "Mike", 80000);

        hrManager.addEmployee(juniorDeveloper1);
        hrManager.addEmployee(juniorDeveloper2);
        hrManager.addEmployee(midDeveloper1);
        hrManager.addEmployee(seniorDeveloper1);

        System.out.println("\nHR Manager ID: " + hrManager.getId());
        System.out.println("HR Manager Name: " + hrManager.getName());
        System.out.println("HR Manager Salary: " + hrManager.getSalary());

        System.out.println("\nHR Manager's Junior Developers:");
        for (JuniorDeveloper juniorDeveloper : hrManager.getJuniorDevelopers()) {
            if (juniorDeveloper != null) {
                System.out.println(" - " + juniorDeveloper.getName() + ", Salary: " + juniorDeveloper.getSalary());
            }
        }

        System.out.println("\nHR Manager's Mid Developers:");
        for (MidDeveloper midDeveloper : hrManager.getMidDevelopers()) {
            if (midDeveloper != null) {
                System.out.println(" - " + midDeveloper.getName() + ", Salary: " + midDeveloper.getSalary());
            }
        }

        System.out.println("\nHR Manager's Senior Developers:");
        for (SeniorDeveloper seniorDeveloper : hrManager.getSeniorDevelopers()) {
            if (seniorDeveloper != null) {
                System.out.println(" - " + seniorDeveloper.getName() + ", Salary: " + seniorDeveloper.getSalary());
            }
        }

            }
        }






