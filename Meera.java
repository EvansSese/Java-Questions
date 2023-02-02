public class Meera {
    public static void main(String[] args) {
        int[] a = {8, 3, 4};
        System.out.println(isMeera(a));
    }

    public static int isMeera(int[] a){
        //loop through each element
        for(int i= 0; i<a.length;i++){
            //check if there is 2*n using linear search
            for(int j = 0; j<a.length; j++){
                if(a[i]*2 == a[j]){
                    //found 2*n in the array
                    return 0;
                }
            }
        }

        //if there is no 2*n in the array
        return 1;
    }
}
