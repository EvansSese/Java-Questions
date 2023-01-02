public class Twin {
    public static void main(String[] args) {
        System.out.print(isPrime(67));
    }

    public static int isPrime(int number) {
        int flag = 1;
        // for loop to find factors of the given number
        for (int divider = 2; divider * 2 < number; divider++) {
            // check if the divider is a factor of the number
            if (number % divider == 0) {
                flag = 0;
                return flag;
            }
        }
        return flag;
    }

    // public static int isTwin(int[] arr){

    // }
}
