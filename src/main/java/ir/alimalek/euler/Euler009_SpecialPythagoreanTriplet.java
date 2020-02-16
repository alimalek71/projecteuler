package ir.alimalek.euler;

public class Euler009_SpecialPythagoreanTriplet {

    public static void main(String[] args) {
        int counter = 0;
        for (int a = 1; a < 334; a++) {
            for (int b = a + 1; b < 500; b++) {
                for (int c = b + 1; c < 500; c++) {
                    counter++;
                    if (a + b + c != 1000)
                        continue;
                    if (a * a + b * b != c * c)
                        continue;

                    System.out.println("a: " + a + ", b: " + b + ", c: " + c);
                    System.out.println("abc: " + a * b * c);
                    System.out.println("counter: " + counter);
                }
            }
        }
    }

}
