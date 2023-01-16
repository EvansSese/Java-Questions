public class Guthrie {
    public static void main(String[] args) {
        int[] a = {9,28,14,7,22,11,34,17,52,26,13,40,20,10,5,16,8,4,2,1};
        System.out.println(isGuthrieSequence(a));
    }

    public static int isGuthrieSequence(int[] a){
        int lastElement = a[a.length - 1]; //get last element of array
        if(lastElement == 1){ //last element should be 1;
            for(int i = 1; i<a.length;i++){
                int currentElement = a[i];
                int prevElement = a[i-1];
                int expectedElement = 0;
                if(prevElement%2==0){
                    expectedElement = prevElement / 2; //divide by 2 if even
                } else{
                    expectedElement = (prevElement*3) + 1; //multiply by 3, then add 1 for odd
                }

                if(currentElement != expectedElement){ //if current element is not equal to expected element, return 0
                    return 0;
                }
            }
        } else{
            return 0; //return 0 if last element is not equl to 1
        }
        return 1; //return 1 when all checks are passed
    }
}
