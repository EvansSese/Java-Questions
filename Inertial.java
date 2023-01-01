public class Inertial {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };
        System.out.println(isInertial(a));

        int[] b = { 2, 3, 5, 7 };
        System.out.println(isInertial(b));
    }

    static int isInertial(int[] a) {
        int isInertial = 0;
        int oddCount = 0;
        int evenCount = 0;
        int maxValue = 0;
        int[] oddValues = new int[a.length];
        int[] evenValues = new int[a.length];

        // scan through the array, get number of odd numbers and even numbers, add them
        // to their respective lists
        for (int i = 0; i < a.length; i++) {
            // check for maximum value
            if (a[i] > maxValue) {
                maxValue = a[i];
            }

            // check for odd and even
            if (a[i] % 2 != 0) {
                // is odd number
                oddValues[oddCount] = a[i];
                oddCount++;
            } else {
                // is even number
                evenValues[evenCount] = a[i];
                evenCount++;
            }

        }

        if ((oddCount > 0) && (maxValue % 2 == 0)) {
            // check if odd values are greater than every even value, which is not the
            // greates value
            for (int j = 0; j < evenValues.length; j++) {
                for (int k = 0; k < oddValues.length; k++) {
                    if (evenValues[j] != maxValue) {
                        if (oddValues[k] > evenValues[j]) {
                            isInertial = 1;
                            break;
                        } else {
                            isInertial = 0;
                            break;
                        }
                    }
                }
            }
        } else {
            isInertial = 0;
        }
        return isInertial;
    }
}