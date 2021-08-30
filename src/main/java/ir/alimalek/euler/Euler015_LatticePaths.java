package ir.alimalek.euler;

import java.math.BigDecimal;

public class Euler015_LatticePaths {

    private static final int X_LENGTH = 20;
    private static final int Y_LENGTH = 20;

    public static void main(String[] args) {
        System.out.println("Q: How many such routes are there through a 20×20 grid?\nAns: " +
                combinationsLatticePaths(X_LENGTH, Y_LENGTH));
    }

    private static BigDecimal combinationsLatticePaths(int xLength, int yLength) {
        var fxy = factorial(xLength + yLength);
        var fx = factorial(xLength);
        var fy = factorial(yLength);
        return fxy.divide(fx.multiply(fy));
    }

    private static BigDecimal factorial(int s) {
        var fact = new BigDecimal(1);

        for (var i = 1; i <= s; i++) {
            fact = fact.multiply(new BigDecimal(i));
        }

        return fact;
    }
}
