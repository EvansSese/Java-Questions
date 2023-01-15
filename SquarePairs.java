public class SquarePairs {
    public static void main(String[] args) {
        int[] a = { 9, 0, 2, -5, 7 };
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

        for (int targetIndex = 0; targetIndex < a.length; targetIndex++) { //loop to get x
            for (int compareIndex = 0; compareIndex < a.length; compareIndex++) { //loop to get y
                if (a[targetIndex] > 0 && a[compareIndex] > 0) { //both x and y should be greater than 0
                    if (a[targetIndex] < a[compareIndex]) { // x should be greater than y
                        if (isPerfectSquare(a[targetIndex] + a[compareIndex]) == 1) { //sum of x and y should be perfect square
                            squarePairsCount++; // increment perfect square count
                        }
                    }
                }
            }
        }
        return squarePairsCount;
    }
}