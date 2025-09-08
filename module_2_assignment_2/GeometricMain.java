// 9/8/2025
// hong rot
// sdev200
// MODULE 2, ASSIGNMENT 2


package module_2_assignment_2;

import java.util.Scanner;

public class GeometricMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three sides of the triangle: ");
        double side1 = 0, side2 = 0, side3 = 0;
        
        try {
            side1 = input.nextDouble();
            side2 = input.nextDouble();
            side3 = input.nextDouble();
        } catch (Exception e) {
            System.out.println("invalid input (not a number)");
            input.close();
            return; // exit the program if input is invalid
        }

        // color of triangle
        System.out.print("Enter a color: ");
        String color = input.next();

        // filled or not
        System.out.print("Is the triangle filled (true/false): ");
        boolean filled = false;

        try {
            filled = input.nextBoolean();
        } catch (Exception e) {
            System.out.println("invalid input (not a boolean)");
            input.close();
            return; // exit the program if input is invalid
        }
        
        input.close();

        // make the object the user is obsessed about
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // display the results
        System.out.println(triangle.toString());
        System.out.printf("The area is %.2f%n", triangle.getArea());
        System.out.printf("The perimeter is %.2f%n", triangle.getPerimeter());
        System.out.println("The color is " + triangle.getColor());
        System.out.println("The triangle is " + (triangle.isFilled() ? "filled" : "not filled"));
    }

    // GeometricObject.java: The abstract GeometricObject class
    public static abstract class GeometricObject {
        private String color = "white";
        private boolean filled;

        /**Default construct*/
        protected GeometricObject() {

        }
        /**Construct a geometric object*/
        protected GeometricObject(String color, boolean filled) {
            this.color = color;
            this.filled = filled;
        }
        /**Getter method for color*/
        public String getColor() {
            return color;
        }
        /**Setter method for color*/
        public void setColor(String color) {
            this.color = color;
        }
        /**Getter method for filled. Since filled is boolean,
        so, the get method name is isFilled*/
        public boolean isFilled() {
            return filled;
        }
        /**Setter method for filled*/
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
        /**Abstract method findArea*/
        public abstract double getArea();
        /**Abstract method getPerimeter*/
        public abstract double getPerimeter();
    }

    public static class Triangle extends GeometricObject {
        private double side1;
        private double side2;
        private double side3;

        // make default triangle
        public Triangle() {
            this.side1 = 1.0;
            this.side2 = 1.0;
            this.side3 = 1.0;
        }

        // triangle but defined
        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        // retruns all sides
        public String getSides() {
            return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
        }

        // return specific side
        public double getSide1() {
            return side1;
        }

        public double getSide2() {
            return side2;
        }

        public double getSide3() {
            return side3;
        }

        // returns area
        public double getArea() {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }

        // returns the perimeter
        public double getPerimeter() {
            return side1 + side2 + side3;
        }

        // returns a string description of the triangle
        @Override
        public String toString() {
            return "Triangle: side1 = " + getSide1() + " side2 = " + getSide2() + " side3 = " + getSide3();
        }
    } 
}
