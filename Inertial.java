public class Inertial {
    public static void main(String[] args) {
        int[] a = { 4,3,2,1 };
        System.out.println(isInertial(a));

        // int[] b = { 2, 3, 5, 7 };
        // System.out.println(isInertial(b));
    }

    static int isInertial(int[] a) {
        boolean hasOdd = false; //default value is false
        int maxVal = Integer.MIN_VALUE;
        int evenVal = Integer.MIN_VALUE;
        int prevEvenVal= Integer.MIN_VALUE;
        int leastOddVal= Integer.MAX_VALUE;

        //loop through the array to check for condition 1,2 and evaluate for condition 3
        for(int i = 0; i<a.length;i++){
            if(a[i]%2!=0){ //check for odd number
                hasOdd = true; //pass condition 1
                if(a[i]<leastOddVal){ //set least odd value and max value
                    leastOddVal = a[i];
                }
            }

            if(a[i]>maxVal){
                maxVal = a[i]; //set maxVal
            }

            if(a[i]%2==0){ //check if its even
                if(a[i]>evenVal){
                    prevEvenVal = evenVal;
                    evenVal = a[i];
                }
            }
        }

        if((hasOdd) && (maxVal % 2 ==0) && (leastOddVal>prevEvenVal)){ //check if all 3 conditions are true
            return 1;
        } else{
            return 0;
        }
    }
}