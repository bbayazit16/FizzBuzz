public class Multiples {
    final static int excludedUpperBound = 10;

    public static void main(String[] args) {
        int result = 0;
        for (int i = excludedUpperBound - 1; i > 0; i--) {
            boolean isThreeDivisible = (i % 3) == 0;
            boolean isFiveDivisible = (i % 5) == 0;
            if (isThreeDivisible || isFiveDivisible) {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
