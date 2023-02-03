public class Nice {
    public static void main(String[] args) {
        int[] a = { 1, -1, 1 };
        System.out.println(isNice(a));
    }

    public static int isNice(int[] a) {
        // loop through the elements and find their adjacent
        for (int i = 0; i < a.length; i++) {
            // initialize has adj boolean
            boolean hasAdj = false;

            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i] + 1 || a[j] == a[i] - 1) {
                    hasAdj = true;
                    break;
                }
            }

            // check if the element has no adjacent
            if (!hasAdj) {
                return 0;
            }
        }
        return 1;
    }
}
