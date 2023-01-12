public class Inertial {
    public static void main(String[] args) {
        int[] a = { 8, 4, 20, 9, 2, 11 };
        System.out.println(isInertial(a));

        int[] b = { 12, 11, 4, 9, 2, 3, 10 };
        System.out.println(isInertial(b));
    }

    static int isInertial(int[] a) {
        boolean hasOdd = false; //default value is false
        boolean oddIsGreater = true; //default value is true
        int maxVal = Integer.MIN_VALUE;
        int leastOddVal= Integer.MAX_VALUE;

        //loop through the array to check for condition 1,2 and evaluate for condition 3
        for(int i = 0; i<a.length;i++){
            if(a[i]%2!=0){ //check for odd number
                hasOdd = true; //pass condition 1
                if(a[i]<leastOddVal){ //set least odd value and max value
                    leastOddVal = a[i];
                }
            }

            if(a[i]>maxVal){ //check for max val
                maxVal = a[i]; //set maxVal
            }

        }

        for(int j=0; j<a.length;j++){ //loop to check if each odd value is greater than every even except maxVal
            if(a[j]%2==0 && (leastOddVal<a[j]) && (a[j]!=maxVal)){
                oddIsGreater = false;
            }
        }

        if((hasOdd) && (maxVal % 2 ==0) && (oddIsGreater)){ //check if all 3 conditions are true
            return 1;
        } else{
            return 0;
        }
    }
}