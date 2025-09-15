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
}
