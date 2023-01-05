public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }

    static int isPrime(int number) {
        int isPrime = 0;
        if (number > 1) {
            for (int divider = 2; divider <= number; divider++) {
                if (number % divider == 0 && divider != number) {
                    isPrime = 0;
                    return isPrime;
                } else {
                    isPrime = 1;
                }
            }
            return isPrime;
        } else {
            return isPrime;
        }
    }
}