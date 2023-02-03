public class Bunker {
    public static void main(String[] args) {
        int[] a = { 7, 6, 10 };
        System.out.println(isBunker(a));
    }

    public static int isPrime(int number) {
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

    public static int isBunker(int[] a) {
        // initialize has one and has prime booleans
        boolean hasOne = false;
        boolean hasPrime = false;

        // loop through the array to find if element is 1 or prime
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                hasOne = true;
            }

            if (isPrime(a[i]) == 1) {
                hasPrime = true;
            }
        }

        // check if it has both 1 and prime number
        if (hasOne && hasPrime) {
            return 1;
        }

        return 0;
    }
}
