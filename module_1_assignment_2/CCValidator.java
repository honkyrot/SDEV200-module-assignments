// 08-29-2025
// hong rot, sdev200
// MODULE 1, ASSIGNMENT 2

package module_1_assignment_2;

import java.util.Scanner;

public class CCValidator {
    public static void main(String[] args) {
        // get the 16 digit number from user
        Scanner user_input = new Scanner(System.in);
        System.out.print("Enter a 16 digit card number: ");
        long card_number = 0;

        // handle invalid input
        try {
            card_number = user_input.nextLong();
        } catch (Exception e) {
            System.out.println("invalid input");
            user_input.close();
            return; // exit the program if input is invalid
        }

        user_input.close();

        // return validation
        if (isValid(card_number)) {
            System.out.println("ts valid");
        } else {
            System.out.println("ts not valid");
        }

        // do the other methods

        System.out.println("# of digits is: " + getSize(card_number));
        System.out.println("prefix is: " + getPrefix(card_number, 1));
    }

    // Return true if the card number is valid
    public static boolean isValid(long number) {
        int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (total % 10 == 0) && prefixMatched(number, 4);
    }

    // calculates the sum of double even places
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;

        String number_str = Long.toString(number);

        // start from the second last digit, and move left 
        for (int i = number_str.length() - 2; i >= 0; i -= 2) {
            int digit = getDigit(Integer.parseInt(String.valueOf(number_str.charAt(i))) * 2);
            sum += digit;
        }
        
        return sum;
    }

    // Return this number if it is a single digit, otherwise,
    // return the sum of the two digit
    public static int getDigit(int number) {
        if (number < 10) {
            return number;
        } else {
            return (number % 10) + (number / 10);
        }
    }
    
    // Return sum of odd-place digits in number
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        String numStr = Long.toString(number);

        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }

        return sum;
    }

    // Return true if the number d is a prefix for number
    public static boolean prefixMatched(long number, int d) {
        String numStr = Long.toString(number);
        String prefix = Integer.toString(d);
        return numStr.startsWith(prefix);
    }

    // Return the number of digits in d
    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    // Return the first k number of digits from number. If the
    // number of digits in number is less than k, return number.
    public static long getPrefix(long number, int k) {
        String numStr = Long.toString(number);
        if (numStr.length() <= k) {
            return number;
        } else {
            return Long.parseLong(numStr.substring(0, k));
        }
    }
}
