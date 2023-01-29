public class DecodeArray {
    public static void main(String[] args) {
        int[] a = { 1, 1 };
        System.out.println(decodeArray(a));
    }

    public static int decodeArray(int[] a) {
        String s = Integer.toString(0);
        for (int i = 1; i < a.length; i++) { // start at second element, so that we can fetch the first and find the
                                             // difference
            int prev_element = a[i - 1];
            int current_element = a[i];
            int element_difference = Math.abs(prev_element - current_element);

            String num_string = Integer.toString(element_difference);
            s = s + num_string;
        }

        int encodedNum = Integer.parseInt(s);

        if (a[0] < 0) {
            encodedNum = -1 * encodedNum;
        }

        return encodedNum;
    }
}
