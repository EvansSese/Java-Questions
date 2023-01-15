class PerfectSquare {
    public static void main(String[] args) {
        int result = nextPerfectSquare(-4);
        System.out.println(result);
    }

    public static int nextPerfectSquare(int n) {
        int nextPerfectSquare = 0; //initialize nextPerfectSquare as 0

        if (n < 0) { //if below 0, return 0
            nextPerfectSquare = 0;
        } else if (n == 0) { //if n is 0, return 1
            nextPerfectSquare = 1;
        } else { //start loop at 1 and end at n
            for (int i = 1; i < n; i++) {
                nextPerfectSquare = i * i;
                if (n < nextPerfectSquare) { //check if the nextPerfectSquare is greater than n
                    return nextPerfectSquare; //break loop as soon as we get the perfect square
                }
            }
        }

        return nextPerfectSquare;
    }
}