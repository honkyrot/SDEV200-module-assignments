package module_2_assignment_2;

public class Triangle extends GeometricObject {
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