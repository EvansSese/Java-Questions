public class Hollow {
    public static void main(String[] args) {
        int[] a = {0,0,0};
        System.out.println(isHollow(a));
    }

    public static int isHollow(int[] a){
        int precedingZeros = 0;
        int midZeros = 0;
        int followingZeros = 0;

        //for loop to count number of preceding zeros
        for(int i = 0; i<a.length;i++){
            if(a[i]>0){
                precedingZeros++;
            }else{
                break;
            }
        }

        //for loop to count number of mid zeros
        for(int j=(a.length/2)-1;j<=(a.length/2)+1;j++){
            if(a[j]==0){
                midZeros++;
            }else{
                break;
            }
        }

        //for loop to count number of following zeros
        for(int k = a.length-1; k>0;k--){
            if(a[k]>0){
                followingZeros++;
            }else{
                break;
            }
        }

        //analyse results
        if(precedingZeros==followingZeros && midZeros>=3){
            return 1;
        }else{
            return 0;
        }
    }
}
