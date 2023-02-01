public class Martian {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 1, 2, 1, 2,1};
        System.out.println(isMartian(a));
    }

    public static int isMartian(int[] a){
        int one_count = 0; //initialize counters
        int two_count = 0;

        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                one_count = one_count + 1; //increment 1s counter
            }

            if(a[i]==2){
                two_count = two_count + 1; //increment 2s counter
            }

            if(i>0){
                if(a[i-1]==a[i]){ //if consecutive elements are equal, end loop and return 0
                    return 0;
                }
            }
        }

        if(one_count > two_count){ //check if 1s counter is greater than 2s counter
            return 1; 
        }else{
            return 0;
        }
    }
}
