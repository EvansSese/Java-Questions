class PrimeCount {
    public static void main(String[] args) {
        int res = primeCount(0, 7);
        System.out.println(res);
    }

    static int primeCount(int start, int end) {
        int primeCount = 0;
        for (int num = start; num <= end; num++) {
            boolean isPrime = false;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (isPrime) {
                primeCount++;
            }
        }
        return primeCount;
    }
}