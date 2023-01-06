public class Twin {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[] { 3, 5, 8, 10, 27 };
        System.out.println(isTwin(arr));
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

    public static int isTwin(int[] arr) {
        // flag to hold either 0 or 1;
        int twinFlag = 0;
        // loop through the array to find prime numbers
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i];
            // check if the current number is prime
            if (isPrime(number) == 1) {
                // identify the adjacent numbers (expected twin)
                int upperNumber = number + 2;
                int lowerNumber = number - 2;

                // check if upper number is prime
                if (isPrime(upperNumber) == 1) {
                    // check if the number is in the array
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == upperNumber) {
                            twinFlag = 1;
                        } else {
                            twinFlag = 0;
                        }
                    }
                }

                // check if lower number is prime
                if (isPrime(lowerNumber) == 1) {
                    // check if the number is in the array
                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == lowerNumber) {
                            twinFlag = 1;
                        } else {
                            twinFlag = 0;
                        }
                    }
                }

            }
        }

        return twinFlag;
    }
}
