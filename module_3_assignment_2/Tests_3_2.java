package module_3_assignment_2;

import java.math.BigInteger;
import java.util.Scanner;

public class Tests_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // enter two rational numbers
        System.out.print("Enter the first rational number \n>");
        BigInteger num1 = input.nextBigInteger();
        BigInteger den1 = input.nextBigInteger();

        System.out.print("Enter the second rational number \n>");
        BigInteger num2 = input.nextBigInteger();
        BigInteger den2 = input.nextBigInteger();


        RationalNumbers rational1 = new RationalNumbers(num1, den1);
        RationalNumbers rational2 = new RationalNumbers(num2, den2);

        // cook the results
        System.out.println(rational1 + " + " + rational2 + " = " + rational1.add(rational2));
        System.out.println(rational1 + " - " + rational2 + " = " + rational1.subtract(rational2));
        System.out.println(rational1 + " * " + rational2 + " = " + rational1.multiply(rational2));
        System.out.println(rational1 + " / " + rational2 + " = " + rational1.divide(rational2));

        // display the results
        System.out.println(rational2 + " is " + rational2.doubleValue());

        input.close();
    }
}