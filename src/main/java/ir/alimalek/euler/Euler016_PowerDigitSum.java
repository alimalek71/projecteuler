package ir.alimalek.euler;

import java.math.BigDecimal;

public class Euler016_PowerDigitSum {

    public static void main(String[] args) {
        System.out.println("PDS of 2^15: " + powerDigitSum(2, 15));
        System.out.println("PDS of 2^1000: " + powerDigitSum(2, 1_000));
    }

    private static int powerDigitSum(int i, int pow) {
        var x = new BigDecimal(i).pow(pow);
        var sum = 0;
        while (!x.equals(BigDecimal.ZERO)) {
            var dr = x.divideAndRemainder(BigDecimal.TEN);
            x = dr[0];
            sum += dr[1].intValue();
        }
        return sum;
    }
}
