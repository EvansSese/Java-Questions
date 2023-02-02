public class BunkerArray {
    public static void main(String[] args) {
        int [] a = {4, 9, 6, 15, 21};
        System.out.println(isBunkerArray(a));
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

    public static int isBunkerArray(int[] a){
        //loop through the given array
        for(int i=0; i<a.length;i++){
            //check if we are at the last element
            if(i!=a.length-1){
                if(a[i]%2 !=0){
                    if(isPrime(a[i+1])==1){
                        return 1;
                    }
                }
            }
        }

        return 0;
    }
}
