import java.util.Arrays;

public class IntegerBasedRounding {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        doIntegerBasedRounding(a, 4);
    }

    public static void doIntegerBasedRounding(int[] a, int n) {
        // create a copy of the same array given, which we shall modify later according
        // to rounding
        int[] b = a;
        if (n > 0) {
            // loop through array a
            for (int i = 0; i < a.length; i++) {
                // check each element and round to n
                int num = a[i];
                if (num > 0) {
                    int base_round = ((Math.round(num / n)) * n);
                    int distance = Math.abs(base_round - num);

                    if (distance < (float) n / 2) {
                        b[i] = base_round;
                    } else {
                        b[i] = base_round + n;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(b));

    }
}
