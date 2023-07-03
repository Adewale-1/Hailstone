import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * This program generate an Hailstone series from a user input.
 *
 * @author A.Adenle
 *
 */
public final class HailstoneN1 {

    /**
     * No argument constructor--private to prevent instantiation.
     */
    private HailstoneN1() {
    }

    /**
     * Generates and outputs the Hailstone series starting with the given
     * integer.
     *
     * @param n
     *            the starting integer
     * @param out
     *            the output stream
     */
    private static void generateSeries(int n, PrintWriter out) {
        int input = n;
        final int constant = 3;

        while (input != 1) {
            out.print(input + ", ");
            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = (constant * input) + 1;
            }
        }
        out.print(input);
    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out, true);

        out.print("Enter a positive integer: ");
        int n = Integer.parseInt(in.readLine());

        generateSeries(n, out);
    }
}