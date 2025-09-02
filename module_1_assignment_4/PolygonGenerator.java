// 9/2/2025
// hong rot
// sdev200
// MODULE 1, ASSIGNMENT 4

package module_1_assignment_4;

public class PolygonGenerator {

    public static void main(String[] args) {
        // create three RegularPolygon objects
        RegularPolygon polygon0 = new PolygonGenerator().new RegularPolygon();
        RegularPolygon polygon1 = new PolygonGenerator().new RegularPolygon(6, 4);
        RegularPolygon polygon2 = new PolygonGenerator().new RegularPolygon(10, 4, 5.6, 7.8);

        // display their perimeter and area
        System.out.printf("polygon0 perimeter = %.2f, area = %.2f%n", polygon0.getPerimeter(), polygon0.getArea());
        System.out.printf("polygon1 perimeter = %.2f, area = %.2f%n", polygon1.getPerimeter(), polygon1.getArea());
        System.out.printf("polygon2 perimeter = %.2f, area = %.2f%n", polygon2.getPerimeter(), polygon2.getArea());
    }

    public class RegularPolygon {
        private int n = 3; // number of sides
        private double side = 1; // length of side
        private double x = 0; // x-coordinate of center
        private double y = 0; // y-coordinate of center

        // constructors
        public RegularPolygon() {
            // default constructor
        }

        public RegularPolygon(int n, double side) {
            this.n = n;
            this.side = side;
        }

        public RegularPolygon(int n, double side, double x, double y) {
            this.n = n;
            this.side = side;
            this.x = x;
            this.y = y;
        }

        // getters
        public int getN() {
            return n;
        }

        public double getSide() {
            return side;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        // setters
        public void setN(int n) {
            this.n = n;
        }

        public void setSide(double side) {
            this.side = side;
        }

        public void setX(double x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        // method to calculate perimeter
        public double getPerimeter() {
            return n * side;
        }

        // method to calculate area
        public double getArea() {
            return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
        }
    }
}