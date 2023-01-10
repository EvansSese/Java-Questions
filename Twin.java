public class Twin {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[] { 11, 9, 12, 13, 23 };
        System.out.println(isTwin(arr));
    }

    public static int isTwin(int[] arr) {
        boolean hasTwins;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                hasTwins = false;
                for (int j = 0; j < arr.length; j++) {
                    if (isPrime(arr[j]) && Math.abs(arr[i] - arr[j]) == 2) {
                        hasTwins = true;
                        break;
                    }
                }
                if (!hasTwins) {
                    // prime number does not have a twin in the array
                    return 0;
                }
            }
        }
        return 1;
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}