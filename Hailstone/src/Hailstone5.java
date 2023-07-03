import java.util.Scanner;

/**
 * This program generates a Hailstone series from a user input.
 *
 * @author A.Adenle
 *
 */
public final class Hailstone5 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private Hailstone5() {
    }

    /**
     * Repeatedly asks the user for a positive integer until the user enters
     * one. Returns the positive integer.
     *
     * @param scanner
     *            the scanner object
     * @return a positive integer entered by the user
     */
    private static int getPositiveInteger(Scanner scanner) {
        int value = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Enter a positive value : ");
            String input = scanner.nextLine();
            //Check if the string can be passed as an integer
            try {
                value = Integer.parseInt(input);

                if (value > 0) {
                    valid = true;
                } else {
                    System.out.println("This value must be a positive integer.");
                }
            } catch (NumberFormatException e) {
                System.out.println("This value must be a valid integer.");
            }
        }
        return value;
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
        Scanner scanner = new Scanner(System.in);

        String terminate = "y";

        while (terminate.equals("y")) {
            int checkedValue = getPositiveInteger(scanner);

            maximumValSeries(checkedValue);
            System.out.println();

            System.out.print("Do you want to calculate another series? (y/n)");
            terminate = scanner.nextLine();
        }
        scanner.close();
    }
}