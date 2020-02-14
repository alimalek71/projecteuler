package ir.alimalek.euler;

public class Euler005_SmallestMultiply_LCM_GCD {

    public static void main(String[] args) {
        long[] range = new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Smallest multiply: " + lcm(range));
    }

    private static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    private static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private static long gcd(long[] input) {
        long result = input[0];
        for (int i = 1; i < input.length; i++)
            result = gcd(result, input[i]);
        return result;
    }

    private static long lcm(long[] input) {
        long result = input[0];
        for (int i = 1; i < input.length; i++)
            result = lcm(result, input[i]);
        return result;
    }

}
