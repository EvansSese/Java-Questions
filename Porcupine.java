public class Porcupine {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(1));
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
        boolean isPorcupine = false;
        n++;
        while(n < Integer.MAX_VALUE){
            if(isPorcupine){
                if(isPrime(n)==1){
                    break;
                }else{
                    isPorcupine = false;
                }
            }else{
                if(isPrime(n)==1){
                    if(n%10==9){
                        isPorcupine = true;
                        porcupineNum = n;
                    }
                }
            }

        }
        return porcupineNum;
    }
}
