public class Porcupine {
    public static void main(String[] args) {
        System.out.println(findPorcupineNumber(409));
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
        int porcupineNum = 0; //initialize porcupine number as 0;
        boolean checkPorcupine = true; //set checking condtion to true;
        while(checkPorcupine){
            n++; //check next number after given number
            if(isPrime(n)==1){ //pass prime test
                if(n%10==9){ //has 9 at the end
                    porcupineNum = n; //set n as the porcupine number
                    boolean checkNextPorcupine = true; //set condition for checking next prime number
                    while(checkNextPorcupine){
                        n++;
                        if(isPrime(n)==1){ //pass isPrime test
                            if(n%10==9){ //has 9 at the end
                                checkNextPorcupine = false; //terminate the nested while loop
                                checkPorcupine = false; //terminate the outer while loop
                            }else{
                                checkNextPorcupine = false; //terminate the inner while loop and continue with the outer while loop
                            }
                        }
                    }
                }
            }
        }
        return porcupineNum;
    }
}
