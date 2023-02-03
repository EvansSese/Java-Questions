public class Nice {
    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 7 };
        System.out.println(isNice(a));
    }

    public static int isNice(int[] a) {
        // loop through the array
        for (int i = 0; i < a.length; i++) {
            if (isAvailable(a, a[i]) == 0) {
                return 0;
            }
        }
        return 1;
    }

    // create a helper function to check if any of the adjacent values are available
    public static int isAvailable(int[] a, int n) {
        // loop through to see if the adjacent values are available
        for (int j = 0; j < a.length; j++) {
            if (a[j] == n - 1 || a[j] == n + 1) {
                // value is available
                return 1;
            }
        }
        // value is not available
        return 0;
    }
}
