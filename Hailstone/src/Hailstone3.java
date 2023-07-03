import java.util.Scanner;

/**
 * This program generate an Hailstone series from a user input.
 *
 * @author A.Adenle
 *
 */
public final class Hailstone3 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private Hailstone3() {
    }

    /**
     * Generates and outputs the maximum value of Hailstone series starting with
     * the given integer.
     *
     * @param n
     *            the starting integer
     */
    private static void maximumValSeries(int n) {
        int input = n;
        int maximumValue = 0;
        final int constant = 3;

        while (input != 1) {
            System.out.print(input + ", ");

            if (input % 2 == 0) {
                input = input / 2;

            } else {

                input = (constant * input) + 1;
            }

            if (input > maximumValue) {
                maximumValue = input;
            }

        }
        System.out.println(input);
        System.out.println();
        System.out.print(maximumValue);

    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();

        maximumValSeries(n);
        
        in.close();
    }

}