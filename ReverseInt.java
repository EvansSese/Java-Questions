public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(f(-12345));
    }

    public static int f(int n) {
        // initialize sign as a positive
        int sign = 1;
        if (n < 0) {
            // if n is negative, change sign to negative
            sign = -1;
            n = -n;
        }

        int reverse = 0; // init reverse as 0

        // while loop to divide each cycle by 10
        while (n != 0) {
            reverse = (reverse * 10) + (n % 10);

            // decrease by 10%
            n /= 10;
        }

        // return the reverse number
        return sign * reverse;
    }
}
