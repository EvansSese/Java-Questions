public class OddEvenDiff {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        System.out.println(f(a));
    }

    public static int f(int[] a) {
        // initialize sum of odd and even
        int oddSum = 0;
        int evenSum = 0;

        // loop through to find odd and even elements
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) { // even
                evenSum = evenSum + a[i];
            } else {
                oddSum = oddSum + a[i];
            }
        }
        // return the odd sum diff
        return oddSum - evenSum;
    }
}
