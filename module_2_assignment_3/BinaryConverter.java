// 9/8/2025
// hong rot
// sdev200
// MODULE 2, ASSIGNMENT 3

package module_2_assignment_3;

import java.util.Scanner;

public class BinaryConverter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String binary_string = "";
        
        try {
            binary_string  = input.nextLine();
        } catch (Exception e) {
            System.out.println("not a valid input");
            input.close();
            return; // exit
        }

        input.close();

        int decimal_value = binaryToDecimal(binary_string);
        if (decimal_value != -1) {
            System.out.println("Binary: " + binary_string);
            System.out.println("Decimal: " + decimal_value);
        }
    }

    // convert a binary string to a decimal integer
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i); // get the bit from the end
            if (bit == '1') {
                decimal += Math.pow(2, i);
            } else if (bit != '0') {
                // invalid character
                try {
                    throw new InvalidBinaryStringException("Invalid binary string: " + binary);
                } catch (InvalidBinaryStringException e) {
                    System.out.println(e.getMessage());
                    return -1; // it errors!!?!
                }
            }
        }
        return decimal;
    }

    // class to throw exception for invalid binary string
    public static class InvalidBinaryStringException extends Exception {
        public InvalidBinaryStringException(String message) {
            super(message);
        }
    }
}
