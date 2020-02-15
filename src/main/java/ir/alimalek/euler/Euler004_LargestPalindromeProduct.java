package ir.alimalek.euler;

public class Euler004_LargestPalindromeProduct {

    public static void main(String[] args) {
        int largestPalindrome = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                int candidate = i * j;
                if (isPalindrome(candidate)) {
                    largestPalindrome = Math.max(largestPalindrome, candidate);
                    System.out.println("i: " + i + ", j: " + j + ", i*j=" + candidate);
                    break;
                }
            }
        }
        System.out.println("Largest palindrome is: " + largestPalindrome);
    }

    private static boolean isPalindrome(int a) {
        return a == reverse(a);
    }

    private static int reverse(int a) {
        int revered = 0;

        int tmp = a;
        while (tmp > 0) {
            int remainder = tmp % 10;
            revered = (revered * 10) + remainder;
            tmp = tmp / 10;
        }

        return revered;
    }

}
