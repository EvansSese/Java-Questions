public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(67));
    }

    static int isPrime(int number) {
        int isPrime = 0;
        for (int divider = 2; 2 * divider < number; divider++) {
            if (number % divider == 0) {
                isPrime = 0;
                break;
            } else {
                isPrime = 1;
            }
        }
        return isPrime;
    }
}