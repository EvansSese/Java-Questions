public class MeeraInt {
    public static void main(String[] args) {
        System.out.println(isMeera(1));
    }

    public static int isMeera(int n) {
        // initialize factor count
        int nonTrivialCount = 0;

        // loop through the factors to see if its nontrivial
        for (int factor = 2; factor < n; factor++) {
            if (n % factor == 0) {
                nonTrivialCount++;
            }
        }
        if (nonTrivialCount > 0 && n % nonTrivialCount == 0) {
            return 1;
        }
        return 0;
    }
}
