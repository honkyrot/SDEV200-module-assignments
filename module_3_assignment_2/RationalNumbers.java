// 9/17/2025
// hong rot
// sdev200
// MODULE 3, ASSIGNMENT 2

package module_3_assignment_2;

import java.math.BigInteger;

public class RationalNumbers extends Number implements Comparable<RationalNumbers> {

    // Data fields for numerator and denominator
    private BigInteger numerator = BigInteger.ZERO;
    private BigInteger denominator = BigInteger.ONE;

    // Construct a rational with default properties
    public RationalNumbers() {
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    // construct a rational with specified numerator and denominator
    public RationalNumbers(BigInteger numerator, BigInteger denominator) {
        BigInteger gcd = gcd(numerator, denominator);
        BigInteger sign = denominator.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : BigInteger.ONE.negate();
        this.numerator = sign.multiply(numerator).divide(gcd);
        this.denominator = denominator.abs().divide(gcd);
    }

    // Find greatest common divisor of two numbers
    private static BigInteger gcd(BigInteger n, BigInteger d) {
        return n.abs().gcd(d.abs());
    }

    // return the numerator
    public BigInteger getNumerator() {
        return numerator;
    }

    // return the denominator
    public BigInteger getDenominator() {
        return denominator;
    }

    // add a rational number to this rational
    public RationalNumbers add(RationalNumbers secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .add(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new RationalNumbers(n, d);
    }

    // subtract a rational number from this rational
    public RationalNumbers subtract(RationalNumbers secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator())
                .subtract(denominator.multiply(secondRational.getNumerator()));
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new RationalNumbers(n, d);
    }

    // multiply a rational number by this rational
    public RationalNumbers multiply(RationalNumbers secondRational) {
        BigInteger n = numerator.multiply(secondRational.getNumerator());
        BigInteger d = denominator.multiply(secondRational.getDenominator());
        return new RationalNumbers(n, d);
    }

    // divide a rational number by this rational
    public RationalNumbers divide(RationalNumbers secondRational) {
        BigInteger n = numerator.multiply(secondRational.getDenominator());
        BigInteger d = denominator.multiply(secondRational.getNumerator());
        return new RationalNumbers(n, d);
    }

    // returns numerator followed by / then the denominator unless denominator is equal to 1
    @Override
    public String toString() {
        if (denominator.equals(BigInteger.ONE))
            return numerator.toString();
        else
            return numerator + "/" + denominator;
    }

    // checks if rational numbers are equal
    @Override 
    public boolean equals(Object other) {
        return this.subtract((RationalNumbers) other).getNumerator().equals(BigInteger.ZERO);
    }

    // Implement the abstract intValue method in Number
    @Override 
    public int intValue() {
        return (int) doubleValue();
    }

    // Implement the abstract floatValue method in Number
    @Override 
    public float floatValue() {
        return (float) doubleValue();
    }

    // Returns double value of rational number
    @Override
    public double doubleValue() {
        return numerator.doubleValue() / denominator.doubleValue();
    }

    // Implement the abstract longValue method in Number
    @Override 
    public long longValue() {
        return (long) doubleValue();
    }

    // Compares rational objects to see if they're less than, greater than, or equal to 0
    @Override
    public int compareTo(RationalNumbers o) {
        return this.subtract(o).getNumerator().compareTo(BigInteger.ZERO);
    }
}