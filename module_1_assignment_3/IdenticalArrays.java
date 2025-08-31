// 08-31-2025
// hong rot, sdev200
// MODULE 1, ASSIGNMENT 3


// see if two arrays are identical

package module_1_assignment_3;

import java.util.Scanner;

public class IdenticalArrays {
    
    public static void main(String[] args) {
        // prompt user for two 3x3 arrays
        Scanner user_input = new Scanner(System.in);

        // helper class to read a 3x3 array
        class ArrayWriter {
            static int[][] readArray(Scanner scanner) {
                int[][] dummy_array = new int[3][3];

                // handle input
                for (int i = 0; i < dummy_array.length; i++) {
                    for (int j = 0; j < dummy_array[i].length; j++) {
                    try {
                        dummy_array[i][j] = scanner.nextInt();
                    } catch (Exception e) {
                        System.out.println("invalid input (not a number)");
                        scanner.close();
                        System.exit(1); // exit the program if input is invalid
                        }
                    }
                }
            return dummy_array;
            }
        }

        // first array
        System.out.println("Enter 9 values: ");
        int[][] m1 = ArrayWriter.readArray(user_input);

        // second array
        System.out.println("Enter 9 values: ");
        int[][] m2 = ArrayWriter.readArray(user_input);

        // check if they are identical
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else {
            System.out.println("The two arrays are not identical");
        }
    

        user_input.close();
    }

    // check if two 2D arrays are identical
    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                // if any element is different, return false
                if (m1[i][j] != m2[i][j]) {
                    return false;
                }
            }
        }
        // give this guy a true
        return true;
    }
}
