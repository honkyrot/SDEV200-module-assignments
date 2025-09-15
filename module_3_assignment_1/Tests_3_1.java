package module_3_assignment_1;

public class Tests_3_1 {
    public static void main(String[] args) {
        // Create two Circle objects for testing
        Circle circle1 = new Circle() {
            {
                radius = 5.0;
            }
        };
        Circle circle2 = new Circle() {
            {
                radius = 7.0;
            }
        };
        Circle circle3 = new Circle() {
            {
                radius = 5.0;
            }
        };

        // Test equals method
        System.out.println("circle1 equals circle2: " + circle1.equals(circle2)); // Expected: false
        System.out.println("circle1 equals circle3: " + circle1.equals(circle3)); // Expected: true

        // Test compareTo method
        System.out.println("circle1 compareTo circle2: " + circle1.compareTo(circle2)); // Expected: negative value
        System.out.println("circle2 compareTo circle1: " + circle2.compareTo(circle1)); // Expected: positive value
        System.out.println("circle1 compareTo circle3: " + circle1.compareTo(circle3)); // Expected: 0
    }
}
