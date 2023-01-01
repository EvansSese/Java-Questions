class PerfectSquare {
    public static void main(String[] args) {
        int result = nextPerfectSquare(-4);
        System.out.println(result);
    }

    public static int nextPerfectSquare(int n) {
        int nextPerfectSquare = 0;

        if (n < 0) {
            nextPerfectSquare = 0;
        } else if (n == 0) {
            nextPerfectSquare = 1;
        } else {
            for (int i = 1; i < n; i++) {
                nextPerfectSquare = i * i;
                if (n < nextPerfectSquare) {
                    return nextPerfectSquare;
                }
            }
        }

        return nextPerfectSquare;
    }
}