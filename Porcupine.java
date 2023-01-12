public class Porcupine {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(140));
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

    public static int findPorcupineNumber(int n){
        int porcupineNum = 0;
        int stopVal = Integer.MAX_VALUE;
        for(int num = n+1; num<stopVal; num++){
            if(isPrime(num)==1 && num%10==9){
                for(int nextNum = num+1;nextNum<stopVal;nextNum++){
                    if(isPrime(nextNum)==1 && nextNum%10==9){
                        porcupineNum = num;
                        return porcupineNum;
                    }
                }
            }
        }
        return porcupineNum;
    }
}
