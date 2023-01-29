public class DecodeArray {
    public static void main(String[] args) {
        int[] a = { 0, -3, 0, -4, 0 };
        System.out.println(decodeArray(a));
    }

    // use modulo operation to concatenate the digits of the number
    public static int decodeArray(int[] a) {
        double encodedNum = 0; // initialize the encoded number
        double c = (a.length - 2);
        for (int i = 1; i < a.length; i++) {
            double mod = Math.pow(10, c); // initialize modulo
            int prev_num = a[i - 1];
            int current_num = a[i];
            int diff = Math.abs(prev_num - current_num); // get difference

            double diff_mod = diff * mod; // multiply by current modulo
            c--; // decrease power

            encodedNum = encodedNum + diff_mod;
        }

        if (a[0] < 0) {
            encodedNum = -1 * encodedNum;
        }

        int num = (int) encodedNum; // convert double to int using typecasting

        return num;
    }
}
