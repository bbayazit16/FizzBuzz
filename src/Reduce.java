public class Reduce {
    /* Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.
     *
     * For example, if you start with n = 2, the answer is 2.
     * Details: 2 (even, divide by 2) --> 1 (odd, subtract 1) --> 0.
     *
     * Prints how many steps it takes to reach 0 if you start at 100.
     * Add this file to your project, commit, and push. If you don't get the right answer, that's okay for now.
     * This is to get you to practice. You'll have until the end of the week to work out the details and
     * submit your working code on MarkUs.
     */
    public static void main(String[] args) {
        int start = 100;
        int numSteps = 0;
        while (start != 0) {
            start = reduceNumber(start);
            numSteps += 1;
        }

        System.out.println(numSteps);
    }

    /* If n is even divide it by 2. If n is odd, subtract 1.
     * Return the new result.
     */
    private static int reduceNumber(int n) {
        if ((n % 2) == 0) {
            return n / 2;
        }
        return n - 1;
    }
}
