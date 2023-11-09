package org.example;

import java.text.MessageFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float length = 0;
        float width;
        float perimeter;
        float area;
        float radius;
        float circumference;
        int userInput = 0;
        boolean condition = false;
        while (true){
            System.out.println("""
                            
                    Choose a shape you would like to calculate.
                    1.) Square
                    2.) Rectangle
                    3.) Triangle (Equilateral)
                    4.) Circle
                    5.) Exit
                    """);
            while(!condition) {
                try {
                    userInput = Integer.parseInt(sc.nextLine());
                    if (userInput < 1 || userInput > 5) {
                        throw new NumberFormatException();
                    }
                    if (userInput >= 1 && userInput <= 5) {
                        condition = true;
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("Enter a number in the range of 1-5");
                } catch (Exception e) {
                    System.out.println("Something went wrong. Enter a number in the range of 1-5.");
                }
            }
            condition = false;
            switch (userInput){
                case 1:
                    while(!condition) {
                        try {
                            System.out.println("What is the length of the each side?");
                            length = Float.parseFloat(sc.nextLine());
                            if(length < 0){
                                throw new NumberFormatException();
                            }
//                            length = Math.abs(length);
                            if(length > 0){
                                condition = true;
                            }
                            Square square = new Square();
                            perimeter = square.calculatePerimeter(length, length);
                            area = square.calculateArea(length, length);
                            System.out.println(MessageFormat.format("The perimeter of the square is {0}, and the area of the square is {1}.", perimeter, area));
                        } catch (NumberFormatException  nfe) {
                            System.out.println("Enter a valid integer.");
                        }
                    }
                    condition = false;
                    break;
                case 2:
                    while (!condition) {
                        try {
                            if (length == 0) {
                                System.out.println("What is the length of the rectangle?");
                                length = Float.parseFloat(sc.nextLine());
                            }
                            length = Math.abs(length);
                            System.out.println("What is the width of the rectangle?");
                            width = Float.parseFloat(sc.nextLine());
                            width = Math.abs(width);
                            if (length > 0 && width > 0) {
                                condition = true;
                            }
                            Rectangle rectangle = new Rectangle();
                            perimeter = rectangle.calculatePerimeter(length, width);
                            area = rectangle.calculateArea(length, width);
                            System.out.println(MessageFormat.format("The perimeter of the rectangle is {0}, and the area of the rectangle is {1}.", perimeter, area));
                        } catch (NumberFormatException nfe) {
                            System.out.println("Enter a valid integer.");
                        }
                    }
                    condition = false;
                    break;
                case 3:
                    while (!condition) {
                        try {
                            System.out.println("Enter the length of the triangle: ");
                            length = Float.parseFloat(sc.nextLine());
                            length = Math.abs(length);
                            if (length > 0){
                                condition = true;
                            }
                            Triangle triangle = new Triangle();
                            perimeter = triangle.calculatePerimeter(length, length);
                            area = triangle.calculateArea(length, length);
                            System.out.println(MessageFormat.format("The perimeter of the triangle is {0}, and the area of the triangle is {1}.", perimeter, area));
                        } catch (NumberFormatException nfe){
                            System.out.println("Enter a valid integer.");
                        }
                    }
                    condition = false;
                    break;
                case 4:
                    while (!condition) {
                        try {
                            System.out.println("Enter the radius of the circle.");
                            radius = Float.parseFloat(sc.nextLine());
                            radius = Math.abs(radius);
                            if(radius > 0){
                                condition = true;
                            }
                            Circle circle = new Circle();
                            circumference = circle.calculateCircumference(radius);
                            area = circle.calculateArea(radius, radius);
                            System.out.println(MessageFormat.format("The circumference of the circle is {0}, and the area of the circle is {1}.", circumference, area));
                        } catch (NumberFormatException nfe){
                            System.out.println("Enter a valid integer");
                        }
                    }
                    condition = false;
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
            }
        }
    }
}