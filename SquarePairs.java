public class SquarePairs {
    public static void main(String[] args) {
        int[] a = { 9 };
        System.out.println(countSquarePairs(a));
    }

    static int isPerfectSquare(int val) {
        int isPerfectSquare = 0;
        if (val >= 0) {
            double sqrt = Math.sqrt(val);
            int base = (int) sqrt;
            if ((sqrt - base) == 0) {
                isPerfectSquare = 1;
            } else {
                isPerfectSquare = 0;
            }
        }
        return isPerfectSquare;
    }

    static int countSquarePairs(int[] a) {
        int squarePairsCount = 0;

        for (int targetIndex = 0; targetIndex < a.length; targetIndex++) {
            for (int compareIndex = 0; compareIndex < a.length; compareIndex++) {
                if (a[targetIndex] > 0 && a[compareIndex] > 0) {
                    if (a[targetIndex] < a[compareIndex]) {
                        if (isPerfectSquare(a[targetIndex] + a[compareIndex]) == 1) {
                            squarePairsCount++;
                        }
                    }
                }
            }
        }
        return squarePairsCount;
    }
}