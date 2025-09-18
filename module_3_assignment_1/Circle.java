// 9/14/2025
// hong rot
// sdev200
// MODULE 3, ASSIGNMENT 1

package module_3_assignment_1;

import module_2_assignment_2.GeometricObject;

public class Circle extends GeometricObject implements Comparable<Circle> {

    public double radius;
    //Sets Circle class to extend GeometricObject and enables comparable interface 
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle otherCircle = (Circle) obj;
        return Double.compare(otherCircle.radius, radius) == 0;
    }
    //Overrides equals method and uses logic to compare circle objects based on their radius

    @Override
    public int compareTo(Circle otherCircle) {
        return Double.compare(this.radius, otherCircle.radius);
    }   

    // area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // perimeter
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}