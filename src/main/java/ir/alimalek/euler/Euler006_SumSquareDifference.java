package ir.alimalek.euler;

import java.math.BigInteger;

public class Euler006_SumSquareDifference {

    public static void main(String[] args) {

        System.out.println("***************************");
        long till = 100;
        BigInteger squareSum = squareSum(till);
        double sumSquare = sumSquare(till);
        BigInteger subtract = squareSum.subtract(BigInteger.valueOf((long) sumSquare));
        System.out.println(squareSum + " - " + sumSquare + " = " + subtract);
        System.out.println("***************************");

    }


    private static double sumSquare(long till) {
        return sumSquare(1, till);
    }

    private static BigInteger squareSum(long till) {
        return squareSum(1, till);
    }

    private static long sumSquare(long from, long till) {
        long sum = 0;
        for (double i = from; i <= till; i++) {
            sum += i * i;
        }
        return sum;
    }

    private static BigInteger squareSum(long from, long till) {
        BigInteger sum = new BigInteger("0");
        for (long i = from; i <= till; i++) {
            sum = sum.add(BigInteger.valueOf(i));
        }
        return sum.pow(2);
    }

}
